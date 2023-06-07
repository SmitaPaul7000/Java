package org.example.start;


import java.util.Comparator;

interface printinterface1{
    public void print();

    public static void show() {

    }
}


interface getage{
    public int getage1();
}

public class Stud implements printinterface1, getage, Comparator, Comparable{

    private final int rollno;
    private String name;
    private int age;

    static int count=0;

    public Stud(String name, int age, int rollno) {
        this.name=name;
        this.age=age;
        this.rollno=rollno;

        count++;
    }

    public static int count() {

        // there would be no instance variables
        return count;
    }

    public int getage() {
        return age;
    }

    public void setage(int a) {
        if(a<0) {
            return;
        }

        age=a;
    }

    public void print() {
        System.out.println(name+" "+rollno+
                " "+age);
    }

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getage1() {
        // TODO Auto-generated method stub
        return 0;
    }

}
