package com.bl.progeammes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericsTest {
    Generics generics = new Generics();

    @Test
    void maxValue() {
        int result1 = generics.maxValue(4,3,2);
        assertEquals(4,result1);

        int result2 = generics.maxValue(3,4,2);
        assertEquals(4,result2);

        int result3 = generics.maxValue(2,3,4);
        assertEquals(4,result3);
    }


}