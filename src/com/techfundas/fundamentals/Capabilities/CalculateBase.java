package com.techfundas.fundamentals.Capabilities;

/**
 * Created by Hp on 7/9/2018.
 */
public abstract class CalculateBase {
    private double lValue;
    private double rValue;
    private double result;

    public double getlValue(){
        return lValue;
    }

    public void setlValue(double lValue){ this.lValue = lValue; }

    public double getrValue(){
        return rValue;
    }

    public void setrValue(double rValue){ this.rValue = rValue;}
    public double getResult(){
        return result;
    }
    public void setResult(double result){ this.result = result;}

    public  CalculateBase(){}

    public CalculateBase(double lValue, double rValue){
        this.lValue = lValue;
        this.rValue = rValue;
    }

    public abstract void calculate();

}
