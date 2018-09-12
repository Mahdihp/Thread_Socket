package com.maktab.socket.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Mohsen on 18/09/12.
 */
public class SendTextData {

    public void run() throws IOException {
        Socket socket = new Socket("localhost", 8585);
        OutputStream outputStream = socket.getOutputStream();
        Scanner in = new Scanner(socket.getInputStream());
        Formatter formatter = new Formatter(outputStream);

        Scanner scanner = new Scanner(System.in);
        String str = "";
        String next="";
        while (!str.equals("exit")) {
            str = scanner.nextLine();
            formatter.format(str + "%n");
            formatter.flush();
            next = in.nextLine();
            System.out.println(next);
        }
        socket.close();
        System.out.println("finished");

    }

}
