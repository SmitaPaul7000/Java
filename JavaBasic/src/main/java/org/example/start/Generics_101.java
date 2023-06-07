package org.example.start;

class Pairs<T>{
    T a;
    T b;

    public T getfirst() {
        return this.a;
    }

    public T getsecond() {
        return this.b;
    }

    public void setfirst(T a) {
        this.a=a;
    }

    public void setsecond(T b) {
        this.b=b;
    }
}




public class Generics_101 {

    public static void main(String[] args) {

        Pairs<Integer> p = new Pairs<>();
        p.setfirst(10);
        p.setsecond(20);


        Pairs<String> p1 = new Pairs<>();
        p1.setfirst("abc");
        p1.setsecond("xyz");


        Pairs p2 =new Pairs();
        p2.setfirst("abc");
        p2.setsecond(10);



    }

}
