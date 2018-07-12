package com.techfundas.fundamentals.com.techfundas.fundamentals.inheritance;

/**
 * Created by Hp on 7/5/2018.
 * Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
 * Reusability and Sub Class
 */
 public class MultiLevelInheritanceFlight {

    private int boeingSeats;
    int aSeats;

    protected int getSeats(){
        return this.boeingSeats;
    }
        public MultiLevelInheritanceFlight()
        {
            System.out.println("Flight Class");
        }
        public void vehicleType()
        {
            System.out.println("Vehicle Type - Flight");
        }
    public void brand()
    {
        System.out.println("Brand Flight");
    }
    }
   class Boeing extends MultiLevelInheritanceFlight{
        public Boeing()
        {
          //  super();
            System.out.println("Boeing Class");
        }
        public void brand()
        {
            System.out.println("Brand Boeing");
        }
        public void speed()
        {
            System.out.println("Max: 700MPH");
        }
    }
     class Boeing777 extends Boeing {

        public Boeing777() {
            System.out.println("Boeing 777 Class");
        }

        public void speed() {
          //  super.speed();
           //to refer immediate parent class instance variable.
            //to invoke immediate parent class method.
            //to invoke immediate parent class constructor.
            System.out.println("Max: 600MPH");
        }

        public static void main(String args[]) {
            Boeing777 flight = new Boeing777();
            flight.vehicleType();
            flight.brand();
            flight.speed();
        }
    }

