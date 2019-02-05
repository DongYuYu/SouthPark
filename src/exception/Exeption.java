package exception;

import java.io.IOException;

public class Exeption extends Exception{

    public static void main(String[] args) {

        int a = 5, b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }





        try{
        throw new IOException();
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.print("run");

    }



}
