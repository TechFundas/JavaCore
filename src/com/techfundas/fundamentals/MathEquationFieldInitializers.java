package com.techfundas.fundamentals;

/**
 * Created by Hp on 7/2/2018.
 */
public class MathEquationFieldInitializers {
    private double lValue;
    private double rValue;
    //private char opCode;
    private char opCode = 'a';
    private double result;

    public double getlValue(){
        return lValue;
    }
    public void setlValue(double lValue){
        this.lValue = lValue;
    }
    public double getrValue(){
        return rValue;
    }
    public void setrValue(double rValue){
        this.rValue = rValue;
    }
    public char getOpCode(){
        return opCode;
    }
    public void setOpCode(char opCode){
        this.opCode = opCode;
    }
    public double getResults(){
        return result;
    }

    public MathEquationFieldInitializers(){

    }

    public MathEquationFieldInitializers(char opCode){
        this.opCode = opCode;
    }

    public MathEquationFieldInitializers(char opCode, double lValue, double rValue){
        this(opCode);
       // this.opCode = opCode;
        this.lValue = lValue;
        this.rValue = rValue;
    }

    public void execute(){
        switch (opCode) {
            case 'a':
                result = rValue + lValue;
                break;
            case 's':
                result = rValue - lValue;
                break;
            case 'm':
                result = rValue * lValue;
                break;
            case 'd':
                result = rValue != 0.0d ? rValue / lValue : 0.0d;
                break;
            default:
                System.out.println("Error - Enter valid character");
                result = 0.0d;
        }
    }
}
