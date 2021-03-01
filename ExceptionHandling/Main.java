package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Logger logger = Logger.getLogger(Main.class.getName());
        try{
            System.out.println(2/1);
            try{
            System.out.println(Integer.parseInt("23a"));

            }
            catch (ArithmeticException ae){
                logger.log(Level.INFO,"no");
            }

            Class.forName("java.util.Date");
            System.out.println("End");
        }
        catch (ArithmeticException ae){
            logger.log(Level.INFO,"can't divide by zero");
        }
        catch (NumberFormatException nfe){
            logger.log(Level.SEVERE,"give an valid number");
        }

        catch (ClassNotFoundException e) {
            logger.log(Level.SEVERE,"can't locate class");

        }
        System.out.println("end");


    }
}
