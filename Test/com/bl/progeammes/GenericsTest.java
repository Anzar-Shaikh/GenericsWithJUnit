//package com.bl.progeammes;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class GenericsTest {
//    Generics generics = new Generics();
//
//    @Test
//    void maxValue() {
//        int result1 = generics.maxValueInt(4,3,2);
//        assertEquals(4,result1);
//
//        int result2 = generics.maxValueInt(3,4,2);
//        assertEquals(4,result2);
//
//        int result3 = generics.maxValueInt(2,3,4);
//        assertEquals(4,result3);
//    }
//
//
//    @Test
//    void maxValueFloat() {
//        float floatResult1 = generics.maxValueFloat(4.5f,3.5f,2.7f);
//        assertEquals(4.5f,floatResult1);
//
//        float floatResult2 = generics.maxValueFloat(3.5f,4.5f,2.7f);
//        assertEquals(4.5f,floatResult2);
//
//        float floatResult3 = generics.maxValueFloat(3.5f,2.7f,4.5f);
//        assertEquals(4.5f,floatResult3);
//    }
//
//    @Test
//    void maxString() {
//        String str1="Hello", str2 = "hello anzar" , str3 = "hello anzar How are you";
//
//        String stringResult1 = generics.maxString(str3,str2,str1);
//        assertEquals(str3,stringResult1);
//
//        String stringResult2 = generics.maxString(str2,str3,str1);
//        assertEquals(str3,stringResult2);
//
//        String stringResult3 = generics.maxString(str1,str2,str3);
//        assertEquals(str3,stringResult3);
//    }
//}