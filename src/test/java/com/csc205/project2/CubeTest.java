package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {
    @Test
    void surfaceArea() {
        Cube cube = new Cube(1);
        double expected = 6.0;
        double actual = cube.surfaceArea();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void volume() {
        Cube cube = new Cube(1);
        double expected = 1.0;
        double actual = cube.volume();
        assertEquals(expected, actual, 0.0001);
    }
}