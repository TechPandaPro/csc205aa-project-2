package com.csc205.project2;

/**
 * Represents a Tetrahedron.
 */
public class Tetrahedron extends Shape {
    private double width;

    /**
     * Initializes a new instance of a Tetrahedron.
     */
    public Tetrahedron() {
        super();
        this.width = 0.0;
    }

    /**
     * Initializes a new instance of a Tetrahedron.
     *
     * @param width the width of the tetrahedron
     */
    public Tetrahedron(double width) {
        super();
        this.width = width;
    }

    /**
     * Gets the radius of the tetrahedron.
     *
     * @return the radius of the tetrahedron
     */
    public double getRadius() {
        return width;
    }

    /**
     * Sets the radius of the tetrahedron.
     *
     * @param radius the new radius of the tetrahedron
     */
    public void setRadius(double radius) {
        this.width = radius;
    }

    /**
     * Computes the surface area of the tetrahedron.
     *
     * @return the surface area of the tetrahedron
     */
    public double surfaceArea() {
        return Math.sqrt(3) * Math.pow(width, 2);
    }

    /**
     * Computes the volume of the tetrahedron.
     *
     * @return the volume of the tetrahedron
     */
    public double volume() { return Math.pow(width, 3) / (6 * Math.sqrt(2)); }

    /**
     * Gives a simple String representation of
     * the tetrahedron.
     *
     * @return the string representation of the tetrahedron
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tetrahedron{");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
