package org.example.start;

public class StudUse {
    public static void main(String[] args) {

        Stud s1 = new Stud("M", 20, 23);
        Stud s2 = new Stud("M", 20, 23);
        Stud s3 = new Stud("M", 20, 23);

        System.out.println(Stud.count);


        Stud.count();

        //.count();
        Stud.count();



        s1.getage();

        s1.setage(-12);



        s1.print();

    }
}
