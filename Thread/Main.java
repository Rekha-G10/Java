package com.company;


class Runner implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread());
    }
}
public class Main {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        Thread thread1 = new Thread(new Runner());

        System.out.println(thread1.getState());
        thread1.start();

        System.out.println(thread1.getState());
        try{
            mainThread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end");

        System.out.println(thread1.getState());
    }
}
