package lesson_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static String server = "0.0.0.0";
    public static int port = 8189;
    public static void main(String[] arg){
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);

        try {
            socket = new Socket(server, port);
            System.out.println("Connected to server:"+ socket.getRemoteSocketAddress());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            Thread threadRead = new Thread(() -> {
                try {
                    outputStream.writeUTF(scanner.nextLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            threadRead.setDaemon(true);
            threadRead.start();
            while (true){
                String string = inputStream.readUTF();
                if(string.equals("/end")){
                    System.out.println("Connected closed");
                    outputStream.writeUTF("/end");
                    break;
                } else {
                    System.out.println("Server: "+ string);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
