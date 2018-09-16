import java.io.*;
import java.net.*;
public class TCP_Server {
    public static void main(String argv[]) throws Exception {
        ServerSocket ourFirstSocket = new ServerSocket(12000);
        Socket connectionSocket = ourFirstSocket.accept();
        System.out.println("========== Top Up Easy Server ==========");
        System.out.println("Server ready to receive : ");

        DataInputStream din = new DataInputStream(connectionSocket.getInputStream());
        DataOutputStream dout = new DataOutputStream(connectionSocket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String messageOut = "";
            String messageIn = din.readUTF();
            System.out.println("Client : " + messageIn); //printing client message
            if (messageIn.equalsIgnoreCase("hello")){
                messageOut = "hi client. do you want to top up your phone? : [yes/no]";
            }
            else if (messageIn.equalsIgnoreCase("exit")){
                messageOut = "Connection end by server";
                break;
            }
            dout.writeUTF(messageOut);
            dout.flush();
        }


        /*while (!msgin.equalsIgnoreCase("exit")){
            msgin = din.readUTF();

            if (msgin.equalsIgnoreCase("hi")){
                msgout = "hi client. do you want to top up your phone? : [yes/no]";
                if (msgin.equalsIgnoreCase("yes")) msgout = "Please choose your network | A = AIS, D = DTAC, T = TRUE";
            }
            dout.writeUTF(msgout);
            dout.flush();
        }*/
        connectionSocket.close();

        /*while(true) {

            BufferedReader messagesFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            //PrintStream outFroemServer = new PrintStream()
            String clientSentence = messagesFromClient.readLine();
            System.out.println("Receiver : " + clientSentence);
            if (clientSentence.equalsIgnoreCase("exit")) {
                System.out.println("Connection end by server");
                break;
            }
            connectionSocket.close();

        }*/
    }
}
