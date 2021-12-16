package com.codechef;
import java.lang.Thread;

public class Main {

    public static void main(String[] args) {
	/*
	Achieving multithreading with runnable interface:
	 */
    int n=8;
    for(int i=0;i<=8;i++){
        Thread object = new Thread(new implement1());
        object.start();
    }
    }
}
class implement1 implements Runnable{

    @Override
    public void run() {
        System.out.println("thread is running");
    }
}
