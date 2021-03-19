package com.company;

class Data{
    private int value;

    public void getValue(){
        System.out.println(value);
    }

    public void setValue(int value){
        this.value = value;
    }
}

class Runner implements Runnable{
    Data data;
    Runner(){
        data = new Data();
    }
    @Override
    public void run() {
        Thread currTThread = Thread.currentThread();
        for(int counter=0;counter<10;counter++) {
            System.out.println(currTThread);
            if(currTThread.getName().equals("Producer")) {
                data.setValue(counter + 1);
            }
            else{

            data.getValue();
        }
        //for(;;)
        //for (int ctr = 0; ctr < 100; ctr++) {
            //System.out.println(Thread.currentThread()+String.valueOf(ctr));
        }
    }
}

public class Runnable{

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        Runner runner = new Runner();
        Thread thread1 = new Thread(runner, "Producer");
        Thread thread2 = new Thread(runner,"Consumer");

        //System.out.println(thread1.getState());

        //thread2.setPriority(10);

        thread1.start();
        thread2.start();
        
        //System.out.println(thread1.getState());
        //mainThread.sleep(2000);
        //System.out.println(thread1.getState());
        System.out.println("end");

    }
}
