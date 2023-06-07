package org.example.start;

public class StringPool {
    public static void main(String args[]){

        String s1 = "java";

        String s2 = "java";

        String s3 = "java";

        if(s1==s2){
            System.out.println(true);
        }

        if(s1==s3){
            System.out.println(true);
        }

        if(s2==s3){
            System.out.println(true);
        }

        String s4 = "javascript";

        if(s1==s4){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        String s5 = new String("java");

        if(s1==s5){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        String s6 = new String("java");
        if(s5==s6){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        System.out.println(s5.equals(s6));

        s6+="script";

        if(s6==s4){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        s1+="script";

        if(s4==s1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
}
