package client;

import lib.Client;
import lib.Connection;

public class backend {

    Client mCon ;
     String serverIP = "" ;
    private int     serverPort =5121;

public backend (){
   connectToServer(serverIP ,serverPort);

}

public void connectToServer(String pServerIP ,int  pserverPort){
    mCon = new Client(serverIP ,serverPort) {
        @Override
        public void processMessage(String pMessage) {
            backendProcessMessage(pMessage);
        }
    };

}

public void backendProcessMessage (String pMessage){}

public void sendMessage(String pToUser, String pFromUser , String pMessage ){

    String mMessage = "Message"+'\r' + pToUser + '\r' +  pFromUser + '\r' +  ;
    mCon.send(mMessage);
}

}
