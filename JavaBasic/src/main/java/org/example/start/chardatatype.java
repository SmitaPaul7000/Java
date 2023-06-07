package org.example.start;

public class chardatatype {
    public static void main(String args[]){

        char ch = 'X';

        System.out.println(ch);

        int a = ch;

        System.out.println(a);

        //ch++;
        ch=(char)(ch+1);
        System.out.println(ch);


        for(int i=1; true; i++){
            System.out.println("this is infinite loop");
        }


    }
}
