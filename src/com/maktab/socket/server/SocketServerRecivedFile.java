package com.maktab.socket.server;


import com.maktab.socket.entity.Person;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Mohsen on 18/09/12.
 */
public class SocketServerRecivedFile {
    public static void main(String[] args) {


        try{
            ServerSocket server = new ServerSocket(8585);
            Socket socket = server.accept();
            Scanner in = new Scanner(socket.getInputStream());
            ObjectInputStream inObject = new ObjectInputStream(socket.getInputStream());

            Person person= (Person) inObject.readObject();
            System.out.println(person.getName());
            System.out.println(person.getAvg());
            in.close();}
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

    }

}
