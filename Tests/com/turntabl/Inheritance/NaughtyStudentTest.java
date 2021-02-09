package com.turntabl.Inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {
    @Test
    void hack() {
        ArrayList<Double> grades1 = new ArrayList<>();
        grades1.add(56.00);
        grades1.add(56.00);
        grades1.add(70.00);
        grades1.add(78.00);

        NaughtyStudent ns1 = new NaughtyStudent(grades1);

        assertFalse(ns1.getAverageGrade() == ns1.hack());
        assertEquals(ns1.hack(), 1.1 * ns1.getAverageGrade());
        assertTrue(ns1.hack() > ns1.getAverageGrade());
    }

}