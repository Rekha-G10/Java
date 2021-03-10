package com.company;

class Runner implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class Main {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        Runner runner = new Runner();
        Thread thread1 = new Thread(runner);
        Thread thread2 = new Thread(runner);

        //System.out.println(thread1.getState());
        thread1.start();
        thread2.start();
        //System.out.println(thread1.getState());
        //mainThread.sleep(2000);
        //System.out.println(thread1.getState());
        System.out.println("end");

    }
}
