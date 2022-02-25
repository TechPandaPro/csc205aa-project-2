package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {
    @Test
    void surfaceArea() {
        Sphere sphere = new Sphere(2);
        double expected = 50.2654;
        double actual = sphere.surfaceArea();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void volume() {
        Sphere sphere = new Sphere(2);
        double expected = 33.5103;
        double actual = sphere.volume();
        assertEquals(expected, actual, 0.0001);
    }
}