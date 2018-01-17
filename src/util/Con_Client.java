package util;

public class Con_Client {
    String ip;
    int port;
    int id;
    String Nick;
    String color;

    public Con_Client(String ip, int port, int id, String nick) {
        this.ip = ip;
        this.port = port;
        this.id = id;
        Nick = nick;
        color= "#000000";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String nick) {
        Nick = nick;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

