package com.techfundas.fundamentals.com.techfundas.fundamentals.inheritance;

public class BritishAirways extends InheritanceFlight{
    int EconomySeats=60;
    int BusinessClassSeats = 40;
    public static final int seatCount = 10;

    static int getPassangerCount(){
        return 20;
    }
    public static void main(String args[]){
        BritishAirways bAirways=new BritishAirways();
        System.out.println("Seats in Flight is:"+bAirways.Seats);
        System.out.println("Seats in BA is:"+(bAirways.EconomySeats+bAirways.BusinessClassSeats));
    }
}
