package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TetrahedronTest {
    @Test
    void surfaceArea() {
        Tetrahedron tetrahedron = new Tetrahedron(4.0);
        double expected = 27.7128;
        double actual = tetrahedron.surfaceArea();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void volume() {
        Tetrahedron tetrahedron = new Tetrahedron(4.0);
        double expected = 7.5424;
        double actual = tetrahedron.volume();
        assertEquals(expected, actual, 0.0001);
    }
}