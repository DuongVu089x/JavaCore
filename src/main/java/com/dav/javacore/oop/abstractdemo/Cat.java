package com.dav.javacore.oop.abstractdemo;

// TODO: Auto-generated Javadoc
/**
 * The Class Cat.
 */
public class Cat extends AnimalAbstract implements ICanFly{

    /**
     * Instantiates a new cat.
     */
    public Cat() {
        super();
    }

    /* (non-Javadoc)
     * @see com.dav.javacore.oop.abstractdemo.AnimalAbstract#talk()
     */
    @Override
    public void talk() {
        System.out.println(this.getSpecies() + " " + this.getName() + " Moe moe!");
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
