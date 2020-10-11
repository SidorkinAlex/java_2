package lesson_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scaner = new Scanner(System.in);
         int port =8189;

        try(ServerSocket server = new ServerSocket(port)) {
            System.out.println("Server started");
            socket = server.accept();
            System.out.println("Client connected" + socket.getRemoteSocketAddress());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            Thread threadRead = new Thread(() -> {
                try {
                    while (true) {
                        outputStream.writeUTF(scaner.nextLine());
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            });
            threadRead.setDaemon(true);
            threadRead.start();

            while (true){
                String str = inputStream.readUTF();
                if(str.equals("/end")){
                    System.out.println("client exit");
                    outputStream.writeUTF("/end");
                    break;
                } else {
                    System.out.println("Client: "+ str);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
