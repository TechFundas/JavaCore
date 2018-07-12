package com.techfundas.fundamentals;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Hp on 7/3/2018.
 */
public class ParameterImmutability {
    int x = 10;
    int y = 20;


    public ParameterImmutability(){

    }

    public ParameterImmutability(int Value){
        System.out.println(this.x); // x?
        this.x = Value;
        System.out.println(this.x); // x?
    }



    void swapNumbers(ParameterImmutability i, ParameterImmutability j){

    }

    public static void main (String[] args){
        ParameterImmutability val1 = new ParameterImmutability();
        //System.out.println("value "+ val1.x);
        System.out.println("value  val1"+  val1.x);
        ParameterImmutability val2 = new ParameterImmutability(30);
        System.out.println("value val2 "+  val2.x);
        System.out.println("value  val1 after modification"+  val1.x);
    }

}
