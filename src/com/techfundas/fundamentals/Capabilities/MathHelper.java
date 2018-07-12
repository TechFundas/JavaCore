package com.techfundas.fundamentals.Capabilities;

/**
 * Created by Hp on 7/9/2018.
 */
public class MathHelper {
    private static final char ADD_SIGN = '+';
    private static final char SUBSTRACT_SIGN = '-';
    private static final char MULTIPLY_SIGN = '*';
    private static final char DIVIDE_SIGN = '%';

    MathCommand command;
    double lValue;
    double rValue;
    double result;

    public void process(String statement){
        //add 1.0 2.0
        String[] parts = statement.split(" ");
        String commandString = parts[0]; //add
        lValue = Double.parseDouble(parts[1]);
        rValue = Double.parseDouble(parts[2]);
        setCommandFromString(commandString);
        CalculateBase calculator = null;
        switch(command){
            case Add:
                calculator = new Adder(lValue,rValue);
                break;
            case Substract:
                calculator = new Substracter(lValue,rValue);
                break;
            case Multiply:
                calculator = new Multiplier (lValue,rValue);
                break;
            case Divide:
                calculator = new Divider(lValue,rValue);
                break;
        }
        calculator.calculate();
        result = calculator.getResult();

    }

    private void setCommandFromString(String commandString){
        //add mathCommand.Add
        if(commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if(commandString.equalsIgnoreCase(MathCommand.Substract.toString()))
            command = MathCommand.Substract;
        else if(commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if(commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;
    }
    @Override
    public String toString() {
        char sign = ' ';
        switch (command) {
            case Add:
                sign = ADD_SIGN;
                break;
            case Substract:
                sign = SUBSTRACT_SIGN;
                break;
            case Multiply:
                sign = MULTIPLY_SIGN;
                break;
            case Divide:
                sign = DIVIDE_SIGN;
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lValue);
        sb.append(' ');
        sb.append(sign);
        sb.append(' ');
        sb.append(rValue);
        sb.append(" = ");
        sb.append(result);
        return sb.toString();

    }
}







