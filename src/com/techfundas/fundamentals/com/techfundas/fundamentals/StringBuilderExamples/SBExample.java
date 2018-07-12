package com.techfundas.fundamentals.com.techfundas.fundamentals.StringBuilderExamples;

/**
 * Created by Hp on 7/6/2018.
 */
public class SBExample {

    String x = "Alpha";
    String y = "Beta";
    String z = x+y;



    public static void main(String[] args) {
        SBExample sbExample = new SBExample();
        System.out.println(sbExample.x);

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("AlpbaBeta");
        System.out.println(sBuilder);
        sBuilder.append("Gama");
        System.out.println(sBuilder);

    }
}
