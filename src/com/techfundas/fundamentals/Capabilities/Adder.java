package com.techfundas.fundamentals.Capabilities;

/**
 * Created by Hp on 7/9/2018.
 */
public class Adder extends CalculateBase{
    public Adder(){}
    public Adder (double lValue, double rValue){
        super(lValue,rValue);
    }
    @Override
    public void calculate(){
        double value = getlValue() + getrValue();
        setResult(value);
    }

}
