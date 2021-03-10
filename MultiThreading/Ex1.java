package com.company;

public class Ex1 {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();

      // Thread thread1 = new Thread(new Runnable()
        Thread thread1 = new Thread(() -> System.out.println(Thread.currentThread())); //lambda expression
//           @Override
//           public void run() {
//               System.out.println(Thread.currentThread().getState());
//           }
//       });
        System.out.println("Thread execution over");;
        thread1.start();
        System.out.println(thread1.getState());
        try{
            mainThread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(thread1.getState());
        System.out.println("end");

    }
}
