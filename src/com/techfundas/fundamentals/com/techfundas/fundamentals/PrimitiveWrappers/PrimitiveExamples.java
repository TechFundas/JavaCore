package com.techfundas.fundamentals.com.techfundas.fundamentals.PrimitiveWrappers;

import com.techfundas.fundamentals.com.techfundas.fundamentals.inheritance.MultiLevelInheritanceFlight;

/**
 * Created by Hp on 7/6/2018.
 */
public class PrimitiveExamples{

public static final Integer aStatic = 100;
    //int b = a;
    //Integer c = b;

    Integer d = Integer.valueOf(100); // Boxing
    int e = d.intValue(); // UnBoxing

    //Strings
    String x ="100";
    double s1 = Double.parseDouble(x); // UnBoxing
    Double s2 = Double.valueOf(x); // Boxing

    String passCode ="!Naveen123";  //

   // Character c= '!';

    static int alpha= 10;

    public static int getSeats(){

        return 0;
    }


}
