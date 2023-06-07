package org.example.start;

enum Levels{
    LOW,
    MEDIUM,
    HIGH;

    public void printvalue() {
        Levels myVar = Levels.HIGH;


        System.out.println(myVar);

        switch(myVar) {
            case LOW:
                break;

            case MEDIUM:
                break;

            case HIGH:System.out.println("High");
                break;
            default:

        }

    }
}

enum Numbers{
    _1,
    _2,
    _3,
    _4,
    _5
}


public class enums {

    public static void main(String args[]) {

        Levels myVar = Levels.HIGH;

        Numbers num = Numbers._1;
        System.out.println(num);
        System.out.println(myVar);

        switch(myVar) {
            case LOW:
                break;

            case MEDIUM:
                break;

            case HIGH:System.out.println("High");
                break;
            default:

        }

    }

}
