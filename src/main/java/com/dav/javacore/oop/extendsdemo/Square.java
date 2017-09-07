package com.dav.javacore.oop.extendsdemo;

// TODO: Auto-generated Javadoc
/**
 * The Class Square.
 */
public class Square extends Rectangle {

    /**
     * Instantiates a new square.
     */
    public Square() {
    }

    /* (non-Javadoc)
     * @see com.dav.javacore.oop.Rectangle#perimeter()
     */
    @Override
    public double perimeter() {
        return this.getHeight() != 0 ? this.getHeight() * 4 : this.getWidth() * 4;
    }

    /* (non-Javadoc)
     * @see com.dav.javacore.oop.Rectangle#acreage()
     */
    @Override
    public double acreage() {
        return this.getHeight() != 0 ? this.getHeight() * this.getHeight() : this.getWidth() * this.getWidth();
    }
}
