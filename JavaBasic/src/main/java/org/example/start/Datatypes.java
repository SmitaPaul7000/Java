package org.example.start;

public class Datatypes {
    public static void main(String args[]){

        byte b = 10;

        b = 127;
        b++;
        System.out.println(b);

        short sh =20;
        int in = 30;
        long ln = 40;

        byte by = 10;
        // in variables
        by = (byte)sh; // demotion cannot happen, it would happen
        // forcibly
        by = (byte)in;
        by = (byte)ln;

        sh = by;
        sh = (short)in;
        sh = (short)ln;


        // default values

        // all the default values are int in nature

        by = 20;

        by = (byte)257;

        System.out.println(by);


        int a = 5;
        byte b2 = 20;

        long ln1 = 100000000000000l;

        int a1 = (int)10000000000000000l;
        System.out.println(a1);


        double d = 2.5;
        float f = 2.5f;












    }

}
