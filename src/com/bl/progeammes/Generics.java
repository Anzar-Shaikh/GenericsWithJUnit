package com.bl.progeammes;

public class Generics {

    public int maxValueInt(int val1, int val2, int val3) {
        int max = val1;
        if (val2 > max) {
            max = val2;
        } if (val3 > max) {
            max = val3;
        }
        return max;
    }

    public float maxValueFloat(float val1, float val2, float val3){
        float max = val1;
        if (val2 > max) {
            max = val2;
        } if (val3 > max) {
            max = val3;
        }
        return max;

    }

    public String maxString(String str1, String str2, String str3){
        String max = str1;
        if (str2.compareTo(max) > 0 ){
            max = str2;
        } if (str3.compareTo(max) > 0 ){
            max = str3;
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println("*******welcome to generics code tested By JUnit***** ");
        Generics generics = new Generics();
        int val1 = 2, val2 =3, val3 = 4;
        int result =  generics.maxValueInt(val1,val2,val3);
        System.out.println("the max vale of "+val1+" "+val2+" "+ val3+ " is :: "+ result);


        float float1 = 2.5f, float2 = 3.5f , float3 = 4.5f;
        float result1 = generics.maxValueFloat(float1,float2,float3);
        System.out.println("the max vale of "+float1+" , "+float2+" & "+ float3+ " is :: "+ result1);

        String str1="Hello", str2 = "hello anzar" , str3 = "hello anzar How are you";
        String result2 = generics.maxString(str1,str2,str3);
        System.out.println("the max vale of ("+str1+") , ("+str2+") & ("+str3+ ") is :: "+ result2);



    }
}
