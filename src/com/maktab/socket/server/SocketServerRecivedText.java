package com.maktab.socket.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Mohsen on 18/09/12.
 */
public class SocketServerRecivedText {


    public static void main(String[] args) {
        try (
                ServerSocket server = new ServerSocket(8585);
                Socket socket = server.accept();
                Scanner in = new Scanner(socket.getInputStream());
                Formatter out = new Formatter(socket.getOutputStream());) {
            String next;
            do {
                next = in.nextLine();
                System.out.println(next);
                out.format("Resend : " + next + "%n");
                out.flush();
            } while (!next.equals("exit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
