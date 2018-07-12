package com.techfundas.fundamentals.com.techfundas.fundamentals.inheritance;

import com.sun.org.apache.xpath.internal.operations.Mult;

/**
 * Created by Hp on 7/7/2018.
 */
public class Examples  {


    public static void main(String[] args) {
        MultiLevelInheritanceFlight f = new MultiLevelInheritanceFlight();
        f.getSeats();
        System.out.println(BritishAirways.seatCount);
        System.out.println(BritishAirways.getPassangerCount());

    }




}
