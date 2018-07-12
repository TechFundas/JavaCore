package com.techfundas.fundamentals.com.techfundas.fundamentals.stringexamples;

import javax.sound.midi.Soundbank;

/**
 * Created by Hp on 7/6/2018.
 */
public class StringExamples {

    String vehicle = "car";
    String vehicleType = "Benz";
    String tempVariable = vehicleType;

    int z= 10;
    String alpha = "Java";
    String beta = "Java";

    //String gamma = (z).toString();
    public void stringOps() {
        if (alpha == beta) {
            System.out.println("Alpha equals beta");
        } else {
            System.out.println("Alpha is NOT EQUALS Beta");
        }
        if (alpha.equals(beta)) {
            System.out.println("Alpha equals beta");
        } else {
            System.out.println("Alpha is NOT EQUALS Beta");
        }
    }
    public void stringOps(String lValue, String rValue){
        if( lValue == rValue){
            System.out.println("lValue equals rValue");
        }else{
            System.out.println("Not Matched");
        }

    }

    public static void main(String[] args) {
        StringExamples sExample = new StringExamples();
        System.out.println(sExample);
        sExample.stringOps("Alpha","Alpha");
      //  sExample.stringOps();
        /*System.out.println("String value ="+sExample.vehicle+" "+ sExample.vehicleType);
        System.out.println("Value of VehicleType "+ sExample.tempVariable);
        //System.out.println("value of b"+sExample.b);*/
    }


}
