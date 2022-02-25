package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    @Test
    void surfaceArea() {
        Cylinder cylinder = new Cylinder(2.0, 1.0);
        double expected = 18.8495;
        double actual = cylinder.surfaceArea();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void volume() {
        Cylinder cylinder = new Cylinder(2.0, 1.0);
        double expected = 6.2831;
        double actual = cylinder.volume();
        assertEquals(expected, actual, 0.0001);
    }
}