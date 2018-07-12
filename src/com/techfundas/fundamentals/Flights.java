package com.techfundas.fundamentals;

public class Flights {
    int result;
    boolean isEnabled;

    public void addition(){
        int x,y;
        x=20; y=30;
        result = x+y;
    }

    public void display(){
        System.out.println("REsult = "+ this.result);
        System.out.println("Boolean "+ isEnabled);
    }

public static void main(String[] args) {

    Flights f = new Flights();
   // f.addition();
    f.display();
}
}
