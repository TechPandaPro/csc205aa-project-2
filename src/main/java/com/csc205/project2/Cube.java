package com.csc205.project2;

/**
 * Represents a cube.
 */
public class Cube extends Shape {

    private double width;

    /**
     * Initializes a new instance of a Cube.
     */
    public Cube() {
        super();
        this.width = 0.0;
    }

    /**
     * Initializes a new instance of a Cube.
     *
     * @param width the width of the cube
     */
    public Cube(double width) {
        super();
        this.width = width;
    }

    /**
     * Gets the width of the cube.
     *
     * @return the width of the cube
     */
    public double getWidth() { return width; }

    /**
     * Sets the width of the cube.
     *
     * @param width the new width of the cube
     */
    public void setWidth(double width) { this.width = width; }

    /**
     * Computes the surface area of the cube.
     *
     * @return the surface area of the cube
     */
    public double surfaceArea() { return 6.0 * Math.pow(width, 2); }

    /**
     * Computes the volume of the cube.
     *
     * @return the volume of the cube
     */
    public double volume() { return Math.pow(width, 3); }

    /**
     * Gives a simple String representation of
     * the cube.
     *
     * @return the string representation of the cube
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
