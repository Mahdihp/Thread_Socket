package com.maktab.socket.work.with.file;


import com.maktab.socket.entity.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Mohsen on 18/09/12.
 */
public class SaveFile {

    public static void main(String[] args) {



        try {
            FileOutputStream saveFile = new FileOutputStream("D:/person.txt");

            ObjectOutputStream out = new ObjectOutputStream(saveFile);

            Person person = new Person("Ali", new double[]{17.0, 18.0});
            person.setAvg(15);
            System.out.println(person.getName());
            System.out.println(person.getAvg());

            out.writeObject(person);
            out.close();
        }
         catch (IOException e){
                e.printStackTrace();
            }

    }
}
