package server;

import lib.DatabaseConnector;
import lib.List;
import lib.Server;
import util.Con_Client;
import util.parser;

import java.time.Instant;

public class Chat_server extends Server {
    private DatabaseConnector databaseConnector;
    private List<Con_Client> clientList;

    public Chat_server(int pPort) {
        super(pPort);
        databaseConnector = new DatabaseConnector(null, 0, "Database.mdb", null, null);
        clientList = new List<Con_Client>();
    }

    @Override
    public void processNewConnection(String pClientIP, int pClientPort) {
    }

    @Override
    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        String message[] = parser.StringtoArray(pMessage);
        aaa(message, pClientIP, pClientPort);
    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {
    removconbyIPport(pClientIP,pClientPort);
    }

    private void aaa(String[] input, String pClientIP, int pClientPort) {
        input[0] = input[0].toLowerCase();
        switch (input[0]) {
            case "login":
                login(input, pClientIP, pClientPort);
                break;
            case "register":
                register(input, pClientIP, pClientPort);
            case "sendmessageglobal":
                sendmessageglobal(input, pClientIP, pClientPort);
                break;
            case "sendmessageprivate":
                sendmessageprivate(input, pClientIP, pClientPort);
                break;
            case "logoff":
                logoff(input, pClientIP, pClientPort);
                break;
            case "changenickname":
                changenickname(input, pClientIP, pClientPort);
                break;
            case "openchat":
                openchat(input, pClientIP, pClientPort);
                break;
            case "createchat":
                createchat(input, pClientIP, pClientPort);
                break;
            case "addtochat":
                addtochat(input, pClientIP, pClientPort);
                break;
            case "removefromChat":
                removefromChat(input, pClientIP, pClientPort);
                break;
            case "addtoFriendslist":
                addtoFriendslist(input, pClientIP, pClientPort);
                break;
            case "removefromFriendslist":
                removefromFriendslist(input, pClientIP, pClientPort);
                break;
            case "resend":
                resend(input, pClientIP, pClientPort);
                break;
            case "getusername":
                getusername(input, pClientIP, pClientPort);
                break;
            case "getnick":
                getnick(input, pClientIP, pClientPort);
                break;
            case "changecolor":
                changecolor(input, pClientIP, pClientPort);
                break;
            default:
                System.out.println("Invalid command from " + pClientIP + ":" + pClientPort + "  " + input[0]);
        }
    }

    private void login(String[] input, String pClientIP, int pClientPort) {
        databaseConnector.executeStatement("select password from user where username='" + input[1] + "'");
        if (databaseConnector.getCurrentQueryResult().getData()[0][0].equals(input[2])) {
            databaseConnector.executeStatement("select nick");
            String nick = databaseConnector.getCurrentQueryResult().getData()[0][0];
            clientList.append(new Con_Client(pClientIP, pClientPort, 0, nick));
            String message[] = new String[2];
            message[0] = "LoginState";
            message[1] = "true";
            message[2] = "Login erfolgreich";
            send(pClientIP, pClientPort, parser.arrayToString(message));
        } else {
            String message[] = new String[2];
            message[0] = "LoginState";
            message[1] = "false";
            message[2] = "Username oder Password falsch";
            send(pClientIP, pClientPort, parser.arrayToString(message));
        }
    }
    private void register(String[] input, String pClientIP, int pClientPort) {
        databaseConnector.executeStatement("Select Username from User where USERNAME='" + input[1] + "'");
        if (databaseConnector.getCurrentQueryResult().getData()[0][0] != null) {
            String message[] = new String[2];
            message[0] = "error";
            message[1] = "register_error";
            message[2] = "Nutzername vergeben";
            send(pClientIP, pClientPort, parser.arrayToString(message));
        } else {
            databaseConnector.executeStatement("select Nickname from User where Nickname='" + input[3] + "'");
            if (databaseConnector.getCurrentQueryResult().getData()[0][0] != null) {
                String message[] = new String[2];
                message[0] = "error";
                message[1] = "register_error";
                message[2] = "Nick vergeben";
                send(pClientIP, pClientPort, parser.arrayToString(message));
            } else {
                databaseConnector.executeStatement("insert into user (username,password,Nickname) values(" + input[1] + "," + input[2] + "," + input[3] + ")");
                String message[] = new String[2];
                message[0] = "LoginState";
                message[1] = "true";
                message[2] = "register erfolgreich";
                send(pClientIP, pClientPort, parser.arrayToString(message));
            }
        }
    }
    private void sendmessageglobal(String[] input, String pClientIP, int pClientPort) {
        long times = Instant.now().getEpochSecond();
        databaseConnector.executeStatement("insert into chatverlauf (von,zu,Nachricht,zeit) values(" + input[1] + ",alle," + input[2] + "," + times + ")");
        String message[] = new String[4];
        message[0] = "SendMessageGlobal";
        message[1] = getNickvonIPport(pClientIP, pClientPort);
        message[2] = input[2];
        message[3] = String.valueOf(times);
        message[4] = getcolorfromIPport(pClientIP, pClientPort);
        sendtoallconected(parser.arrayToString(message));
    }
    private void sendmessageprivate(String[] input, String pClientIP, int pClientPort) {
        long times = Instant.now().getEpochSecond();
        databaseConnector.executeStatement("insert into chatverlauf (von,zu,Nachricht,zeit) values(" + input[1] + "," + input[2] + "," + input[3] + "," + times + ")");
        String message[] = new String[4];
        message[0] = "SendMessagePrivate";
        message[1] = getUsernamevonIPport(pClientIP, pClientPort);
        message[2] = input[3];
        message[3] = String.valueOf(times);
        message[4] = getcolorfromIPport(pClientIP, pClientPort);
        sendtousername(parser.arrayToString(message),input[2]);
    }
    private void logoff(String[] input, String pClientIP, int pClientPort) {
        removconbyIPport(pClientIP,pClientPort);
    }
    private void changenickname(String[] input, String pClientIP, int pClientPort) {
        databaseConnector.executeStatement("update user set NIckname='"+input[1]+"' where username='"+getUsernamevonIPport(pClientIP,pClientPort)+"'");
        databaseConnector.executeStatement("");
        //todo
    }
    private void openchat(String[] input, String pClientIP, int pClientPort) {
    }
    private void createchat(String[] input, String pClientIP, int pClientPort) {
    }
    private void addtochat(String[] input, String pClientIP, int pClientPort) {
    }
    private void removefromChat(String[] input, String pClientIP, int pClientPort) {
    }
    private void addtoFriendslist(String[] input, String pClientIP, int pClientPort) {
    }
    private void removefromFriendslist(String[] input, String pClientIP, int pClientPort) {
    }
    private void resend(String[] input, String pClientIP, int pClientPort) {
    }
    private void getusername(String[] input, String pClientIP, int pClientPort) {
    }
    private void getnick(String[] input, String pClientIP, int pClientPort) {
    }
    private void changecolor(String[] input, String pClientIP, int pClientPort) {
    }



    private void sendtoallconected(String message) {
        clientList.toFirst();
        while (clientList.hasAccess()) {
            send(clientList.getContent().getIp(), clientList.getContent().getPort(), message);
            clientList.next();
        }
    }
    private void sendtousername(String message,String user){
        send(getIpfromUsername(user),getPortfromUsername(user),message);
    }

    private String getUsernamevonIPport(String pClientIP, int pClientPort) {
        clientList.toFirst();
        while (clientList.hasAccess()) {
            if (clientList.getContent().getIp().equals(pClientIP) && clientList.getContent().getPort() == pClientPort) {
                databaseConnector.executeStatement("select username from user where id='" + clientList.getContent().getId() + "'");
                return databaseConnector.getCurrentQueryResult().getData()[0][0];
            }
            clientList.next();
        }
        return "";
    }
    private String getNickvonIPport(String pClientIP, int pClientPort) {
        clientList.toFirst();
        while (clientList.hasAccess()) {
            if (clientList.getContent().getIp().equals(pClientIP) && clientList.getContent().getPort() == pClientPort) {
                return clientList.getContent().getNick();
            }
            clientList.next();
        }
        return "";
    }
    private String getcolorfromIPport(String pClientIP, int pClientPort) {
        clientList.toFirst();
        while (clientList.hasAccess()) {
            if (clientList.getContent().getIp().equals(pClientIP) && clientList.getContent().getPort() == pClientPort) {
                return clientList.getContent().getColor();
            }
            clientList.next();
        }
        return "";
    }

    private void changeNickfromIPport(String pClientIP, int pClientPort,String nick){
        clientList.toFirst();
        while (clientList.hasAccess()) {
            if (clientList.getContent().getIp().equals(pClientIP) && clientList.getContent().getPort() == pClientPort) {
                clientList.getContent().setNick(nick);break;
            }
            clientList.next();
        }
    }

    private void removconbyIPport(String pClientIP, int pClientPort){
        clientList.toFirst();
        while (clientList.hasAccess()) {
            if (clientList.getContent().getIp().equals(pClientIP) && clientList.getContent().getPort() == pClientPort) {
                clientList.remove();break;
            }
            clientList.next();
        }
    }


    private String getIpfromUsername(String User) {
        databaseConnector.executeStatement("select id from user where username='" + User + "'");
        int id = Integer.parseInt(databaseConnector.getCurrentQueryResult().getData()[0][0]);
        clientList.toFirst();
        while (clientList.hasAccess()) {
            if (clientList.getContent().getId() == id) {
                return clientList.getContent().getIp();
            }
            clientList.next();
        }
        return "";
    }
    private int getPortfromUsername(String User) {
        databaseConnector.executeStatement("select id from user where username='" + User + "'");
        int id = Integer.parseInt(databaseConnector.getCurrentQueryResult().getData()[0][0]);
        clientList.toFirst();
        while (clientList.hasAccess()) {
            if (clientList.getContent().getId() == id) {
                return clientList.getContent().getPort();
            }
            clientList.next();
        }
        return -1;
    }
}
