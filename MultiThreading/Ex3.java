package com.company;

import java.util.Arrays;

interface Printer{
    public void print(String str);
}

class Task{
    public int perform(Printer printer, String word){
        printer.print(word);
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

         Task task = new Task();
     //   PMonitor.code(() -> System.out.println(numbers.stream()
        PMonitor.code(() -> System.out.println(numbers.parallelStream()
        .filter(element -> element % 2 == 0)
        .mapToInt(Main::computer)
        .sum())
        );

    }
    public static int compute(int number) {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return number * 2;

    }

}
class PMonitor {
    public static void code(Runnable Task) {
        long start = System.currentTimeMillis();
        try {
            task.run();
        } finally {
            long end = System.currentTimeMillis();
            System.out.println("time taken:" + (end - start) / 1.0e9);
        }
    }
}
