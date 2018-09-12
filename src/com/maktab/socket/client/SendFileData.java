package com.maktab.socket.client;


import com.maktab.socket.entity.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mohsen on 18/09/12.
 */
public class SendFileData {

    public static void main(String[] args) {


        try {
            Socket socket = new Socket("localhost", 8585);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            Person person = new Person("Ali", new double[]{17.0, 18.0});
            person.setAvg(15);
            System.out.println(person.getName());
            System.out.println(person.getAvg());

            out.writeObject(person);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
