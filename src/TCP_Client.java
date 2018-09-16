import java.io.*;
import java.net.*;

public class TCP_Client {
    public static void main(String argv[]) throws Exception {
        Socket clientSocket = new Socket("localhost",12000);
        DataInputStream inFromServer = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        System.out.println("Connect to Top Up Easy : ready");
        BufferedReader inFormUser = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String messageIn = inFromServer.readUTF();
            System.out.println("client : " + messageIn);
            if (messageIn.equalsIgnoreCase("hello")){
                String messageOut =  "hello";
                outToServer.writeUTF(messageOut);

            }
            else if (messageIn.equalsIgnoreCase("exit")) break;

        }
        clientSocket.close();

        /*while (!msgout.equalsIgnoreCase("exit")){
            msgout = inFormUser.readLine();
            outToServer.writeUTF(msgout);
            msgin = inFromServer.readUTF();
            System.out.println("Server : " + msgin); //printing server message
        }*/

        /*while (true){
            String sentence = inFormUser.readLine();
            outToServer.writeBytes(sentence + '\n');
            if (sentence.equalsIgnoreCase("exit")) {
                System.out.println("Connection end by client");
                break;
            }

            clientSocket.close();
        }*/


    }
}
