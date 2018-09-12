package com.maktab.thread;

/**
 * Created by Mohsen on 18/09/12.
 */
public class ThreadWithExtends extends Thread{
private int count = 1000000;
    @Override
    public void run() {
        for(int i=0;i<count ;i++){
        System.out.println(i);
        }
    }
}
