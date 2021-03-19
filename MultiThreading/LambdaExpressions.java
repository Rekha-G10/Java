package com.company;

interface Printer {
   public void print(String str, int number);

}

class Task{
    public int perform(Printer printer){
        printer.print("lambda", 44);
        return 0;
    }
}

public class LambdaExpression {

    public static void main(String[] args) {

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();*/

        //new Thread(() -> System.out.println("Hello")).start();

        /*new Printer(){
            @Override
            public void print() {
                System.out.println("printed");
            }
        };
        printer.print();*/

       // Printer printer = (text) -> System.out.println(text);

        String text1 = "First";
        Printer printer1 = (text,number) -> System.out.println(text+number);

        //printer1.print("lambda","44");

        Task task = new Task();
        task.perform(printer);

        //printer = System.out::println;

    }
}
