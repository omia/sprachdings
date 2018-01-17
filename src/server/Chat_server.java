package server;

import lib.DatabaseConnector;
import lib.Server;

public class Chat_server extends Server {
    private DatabaseConnector databaseConnector;

    public Chat_server(int pPort) {
        super(pPort);
        databaseConnector= new DatabaseConnector(null,0,"Database.mdb",null,null);
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
}
