package com.dav.javacore.oop.abstractdemo;

// TODO: Auto-generated Javadoc
/**
 * The Class AnimalAbstract.
 */
public abstract class AnimalAbstract {

    /** The name. */
    private String name;

    /** The color. */
    private String color;

    /** The species. */
    private String species;

    /**
     * Instantiates a new animal abstract.
     */
    public AnimalAbstract() {
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color.
     *
     * @param color
     *            the new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the species.
     *
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the species.
     *
     * @param species
     *            the new species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Talk.
     */
    abstract public void talk();

}
