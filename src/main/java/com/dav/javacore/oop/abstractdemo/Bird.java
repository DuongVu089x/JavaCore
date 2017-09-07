package com.dav.javacore.oop.abstractdemo;

public class Bird extends AnimalAbstract implements ICanFly {

    public Bird() {
        super();
    }

    @Override
    public void talk() {
        System.out.println(this.getSpecies() + " " + this.getName() + " Something!");
    }

    @Override
    public boolean canFly() {
        return true;
    }

}
