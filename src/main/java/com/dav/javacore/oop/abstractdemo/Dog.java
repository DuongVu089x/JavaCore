package com.dav.javacore.oop.abstractdemo;

// TODO: Auto-generated Javadoc
/**
 * The Class Dog.
 */
public class Dog extends AnimalAbstract implements ICanFly{

    /**
     * Instantiates a new dog.
     */
    public Dog() {
        super();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.dav.javacore.oop.abstractdemo.AnimalAbstract#talk()
     */
    @Override
    public void talk() {
        System.out.println(this.getSpecies() + " " + this.getName() + " Go go go");
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
