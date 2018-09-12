package com.maktab.socket.work.with.file;

import com.maktab.socket.entity.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Mohsen on 18/09/12.
 */
public class LoadFile {
    public static void main(String[] args) {


    try{
        FileInputStream loadFile= new FileInputStream("D:/person.txt");

        ObjectInputStream in = new ObjectInputStream(loadFile);

        Person person= (Person) in.readObject();
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
