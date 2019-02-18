package exception;

import java.io.IOException;

public class Exeption extends Exception{

    public static void main(String[] args) {

        int a = 5, b = 0;
        try {
            int c = a / b;
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("here");
            //throw new IndexOutOfBoundsException();
        }






        finally {
            try {
                Thread.sleep(3000);
            }



            catch (Exception e) {

            }
            //throw new ArithmeticException();
            //System.out.println("run");
        }




        //System.out.print("hi");
//        try {
//            throw new ClassNotFoundException();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }


//        try{
//        throw new IOException();
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//        System.out.print("run");

    }



}
