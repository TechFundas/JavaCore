package com.techfundas.fundamentals.ExceptionHandling;

import java.io.IOException;

/**
 * Created by Hp on 7/10/2018.
 *
 *
 *   Object <--Throwable  --> Error   / Exception
 *   Error --> Linkage Errors
 *   Exception --> Runtimeexception
 */
public class ExceptionThrowsExample {

    int a = 5;
    int b= 0;


    public void print(int a) throws Exception {

            System.out.println("value " + a / 0);

    }

    public void methodA(){
        methodB();
    }

    public void methodB(){
        methodC();
    }

    public void methodC(){
        methodD();
    }

    public void methodD(){

    }
    public static void main(String[] args) throws Exception {
        ExceptionThrowsExample ex = new ExceptionThrowsExample();
        ex.print(1);
    }
}
