package com.techfundas.fundamentals.Capabilities;

/**
 * Created by Hp on 7/9/2018.
 */
public class Substracter extends CalculateBase{
    public Substracter(){}
    public Substracter (double lValue, double rValue){
        super(lValue,rValue);
    }
    @Override
    public void calculate(){
        double value = getlValue() - getrValue();
        setResult(value);
    }

}
