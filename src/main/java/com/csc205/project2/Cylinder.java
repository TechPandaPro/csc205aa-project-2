package com.csc205.project2;

/**
 * Represents a cylinder.
 */
public class Cylinder extends Shape {

    private double height;
    private double radius;

    /**
     * Initializes a new instance of a Cylinder.
     */
    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    /**
     * Initializes a new instance of a Cylinder.
     *
     * @param height the height of the cylinder
     * @param radius the radius of the cylinder
     */
    public Cylinder(double height, double radius) {
        super();
        this.height = height;
        this.radius = radius;
    }

    /**
     * Gets the height of the cylinder.
     *
     * @return the height of the cylinder.
     */
    public double getHeight() { return height; }

    /**
     * Gets the radius of the cylinder.
     *
     * @return the radius of the cylinder.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the height of the cylinder.
     *
     * @param height the new height of the cylinder
     */
    public void setHeight(double height) { this.height = height; }

    /**
     * Sets the radius of the cylinder.
     *
     * @param radius the new radius of the cylinder
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Computes the surface area of the cylinder.
     *
     * @return the surface area of the cylinder
     */
    public double surfaceArea() { return (2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2)); }

    /**
     * Computes the volume of the cylinder.
     *
     * @return the volume of the cylinder
     */
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Gives a simple String representation of
     * the cylinder.
     *
     * @return the string representation of the cylinder
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}