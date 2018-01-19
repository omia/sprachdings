package server;

import lib.DatabaseConnector;
import lib.List;
import lib.Server;
import util.Con_Client;

public class Chat_server extends Server {
    private DatabaseConnector databaseConnector;
    private List<Con_Client> clientList;

    public Chat_server(int pPort) {
        super(pPort);
        databaseConnector= new DatabaseConnector(null,0,"Database.mdb",null,null);
        clientList = new List<Con_Client>();
    }

    @Override
    public void processNewConnection(String pClientIP, int pClientPort) {
    }

    @Override
    public void processMessage(String pClientIP, int pClientPort, String pMessage) {

    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {

    }

    private void aaa(String[] input,String pClientIP, int pClientPort){
        input[0]=input[0].toLowerCase();
        switch (input[0]){
            case "login":login(input,pClientIP,pClientPort);break;
            case "register":register(input,pClientIP,pClientPort);
            case "sendmessageglobal":sendmessageglobal(input,pClientIP,pClientPort);break;
            case "sendmessageprivate":sendmessageprivate(input,pClientIP,pClientPort);break;
            case "logoff":logoff(input,pClientIP,pClientPort);break;
            case "changenickname":changenickname(input,pClientIP,pClientPort);break;
            default:System.out.println("Invalid command from "+pClientIP+":"+pClientPort+"  "+input[0]);
        }
    }

    private void login(String[] input,String pClientIP, int pClientPort){
        databaseConnector.executeStatement("select password from user where username='"+input[1]+"'");
        if (databaseConnector.getCurrentQueryResult().getData()[0][0].equals(input[2])){
            databaseConnector.executeStatement("select nick");
            //clientList.append(new Con_Client(pClientIP,pClientPort,0,));
        }
    }

    private void register(String[] input,String pClientIP, int pClientPort){}

    private void sendmessageglobal(String[] input,String pClientIP, int pClientPort){

    }

    private void sendmessageprivate(String[] input,String pClientIP, int pClientPort){}

    private void logoff(String[] input,String pClientIP, int pClientPort){}

    private void changenickname(String[] input,String pClientIP, int pClientPort){}


    private void successlogin(String pClientIP, int pClientPort){}


}
