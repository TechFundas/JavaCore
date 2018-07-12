package com.techfundas.fundamentals.Capabilities;

//Super - accesses current object as if instance of base class
//By default all classes can be extended and derived class have the option to use or override inherited methods
//Final - cannot extend class - use final to prevent inheriting and / or overriding
//Abstract - User Abstract to require inheriting and / or overriding - no implementation

/**
 * Created by Hp on 7/9/2018.
 */
public class Main {
    public static void main(String[] args) {
        String[] ops = {"divide 100.0 50.0",
                "add 25.0 92.0",
                "substract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        MathHelper helper = new MathHelper();
        for(String statement:ops){
            helper.process(statement);
            System.out.println(helper);
        }


    }

   /* static void useMathEquation(){
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);


    }*/
}
