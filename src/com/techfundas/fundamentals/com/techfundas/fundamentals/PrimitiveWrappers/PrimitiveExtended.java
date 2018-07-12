package com.techfundas.fundamentals.com.techfundas.fundamentals.PrimitiveWrappers;

/**
 * Created by Hp on 7/7/2018.
 */
public class PrimitiveExtended {

    enum seats{ economy, Businessclass, a, b, c};


    public static void main(String[] args) {
        seats s = seats.a;
        System.out.println("Values in Enum "+ s);
    }
    public static int getPriorityPass(){
        System.out.println(PrimitiveExamples.aStatic);

        return 2;
    }
}
