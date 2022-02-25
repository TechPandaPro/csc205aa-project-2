package com.csc205.project2;

/**
 * Represents a sphere.
 */
public class Sphere extends Shape {

    private double radius;

    /**
     * Initializes a new instance of a sphere.
     */
    public Sphere() {
        super();
        this.radius = 0.0;
    }

    /**
     * Initializes a new instance of a sphere.
     *
     * @param radius the radius of the sphere
     */
    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Gets the radius of the sphere.
     *
     * @return the radius of the sphere
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the sphere.
     *
     * @param radius the new radius of the sphere
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Computes the surface area of the sphere.
     *
     * @return the surface area of the sphere
     */
    public double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Computes the volume of the sphere.
     *
     * @return the volume of the sphere
     */
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Gives a simple String representation of
     * the sphere.
     *
     * @return the string representation of the sphere
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
