package com.maktab.thread;

/**
 * Created by Mohsen on 18/09/12.
 */
public class ThreadWithRunnable implements Runnable{

    @Override
    public void run() {
        String str="";
        for(int i = (int)('a');i<(int)('z');i++){
            for(int j = (int)('a');j<(int)('z');j++){
                for(int k = (int)('a');k<(int)('z');k++){
                    str = String.valueOf((char)i) +String.valueOf((char)j)+String.valueOf((char)k);
                    System.out.println(str);
                }
            }
        }
    }
}
