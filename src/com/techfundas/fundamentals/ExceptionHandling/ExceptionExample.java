package com.techfundas.fundamentals.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Hp on 7/10/2018.
 *
 *
 *   Object <--Throwable  --> Error   / Exception
 *   Error --> Linkage Errors
 *   Exception --> Runtimeexception
 */
public class ExceptionExample {

    int a = 5;
    int b= 0;

    public void print(int a, int b) {
        try {
            System.out.println("value " + a / b);
            try{
                System.out.println("value"+a+b);
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                System.out.println("finally with in try");
            }
        }catch(NumberFormatException e){
           // e.printStackTrace();
            System.out.println("Number Format Exception");
           // System.out.println("Entered value for B should be greater than 0");
        }catch(ArithmeticException e){
           // e.printStackTrace();
            System.out.println("Arithmetic Exception");
        }catch(ArrayIndexOutOfBoundsException e){
           // e.printStackTrace();
            System.out.println("Array Index Out of bound Exception");

        }catch(NullPointerException e) {
           // e.printStackTrace();
            System.out.println("Null Pointer Exception");
        }
                finally{
            System.out.println("Executed Finally Block");
        }
    }

    public static void main(String[] args) {
        ExceptionExample ex = new ExceptionExample();
        ex.print(1,0);
    }
}
