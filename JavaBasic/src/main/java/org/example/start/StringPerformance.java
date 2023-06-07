package org.example.start;

public class StringPerformance {
    public static void main(String[] args) {

        Long start = System.currentTimeMillis();
        String s1 = "value1";
        String s2 = "value2";

        for(int i=1; i<=100000; i++) {
            s1=s1+s2;
        }

        Long end = System.currentTimeMillis();

        System.out.println(end-start);

        start=System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("value1");
        String s = "value2";

        for(int i=1; i<=100000; i++) {
            sb.append(s);
        }
        end=System.currentTimeMillis();
        System.out.println(end-start);

        start=System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder("value1");
        String s3 = "value2";

        for(int i=1; i<=100000; i++) {
            sb1.append(s3);
        }
        end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}
