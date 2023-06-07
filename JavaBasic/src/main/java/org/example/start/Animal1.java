package org.example.start;

public abstract class Animal1 {

    public abstract void animalSound();

    public void sleep() {
        System.out.println("zzzz...");
    }


}

abstract class Pig1 extends Animal1{

    public abstract void animalSound();

}

class Piglet1 extends Pig1{

    @Override
    public void animalSound() {
        // TODO Auto-generated method stub
        System.out.println("wee wee...");

    }

}


abstract class Building_sampleflat{
    public void Livingroom(){

    }

    public void kitchen(){

    }

    public abstract void bedroom();
}


class Flat102 extends Building_sampleflat{

    @Override
    public void bedroom() {
        // TODO Auto-generated method stub

    }

}

interface Animal12{
    public void animalSound();
    public void sleep();
}

interface Area{
    public abstract void findArea();
}

