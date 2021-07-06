package com.bl.progeammes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericsTest {
    Generics generics = new Generics();

    @Test
    void maxValue() {
        int result1 = generics.maxValueInt(4,3,2);
        assertEquals(4,result1);

        int result2 = generics.maxValueInt(3,4,2);
        assertEquals(4,result2);

        int result3 = generics.maxValueInt(2,3,4);
        assertEquals(4,result3);
    }


    @Test
    void maxValueFloat() {
        float floatResult1 = generics.maxValueFloat(4.5f,3.5f,2.7f);
        assertEquals(4.5f,floatResult1);

        float floatResult2 = generics.maxValueFloat(3.5f,4.5f,2.7f);
        assertEquals(4.5f,floatResult2);

        float floatResult3 = generics.maxValueFloat(3.5f,2.7f,4.5f);
        assertEquals(4.5f,floatResult3);
    }
}