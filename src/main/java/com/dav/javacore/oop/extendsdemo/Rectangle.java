package com.dav.javacore.oop.extendsdemo;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {

    /** The height. */
    private double height;

    /** The width. */
    private double width;

    /**
     * Gets the height.
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height.
     *
     * @param height the new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the width.
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width.
     *
     * @param width the new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Perimeter.
     *
     * @return the double
     */
    public double perimeter() {
        return (this.height + this.width) * 2;
    }

    /**
     * Acreage.
     *
     * @return the double
     */
    public double acreage() {
        return this.height * this.width;
    }
}
