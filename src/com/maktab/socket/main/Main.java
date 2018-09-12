package com.maktab.socket.main;


import com.maktab.socket.client.SendTextData;

import java.io.IOException;

/**
 * Created by Mohsen on 18/09/12.
 */
public class Main {

    public static void main(String[] args) {
        SendTextData send = new SendTextData();
        try {
            send.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
