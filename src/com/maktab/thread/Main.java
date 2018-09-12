package com.maktab.thread;

public class Main {

    public static void main(String[] args) {

        ThreadWithExtends threadWithExtends = new ThreadWithExtends();
        ThreadWithRunnable threadWithRunnable1 = new ThreadWithRunnable();
        threadWithRunnable1.run();
        Thread threadWithRunnable = new Thread(threadWithRunnable1);
        threadWithExtends.start();
        threadWithRunnable.start();
    }
}