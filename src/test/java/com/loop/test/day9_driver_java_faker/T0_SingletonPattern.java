package com.loop.test.day9_driver_java_faker;

public class T0_SingletonPattern {

    private T0_SingletonPattern() {
        // Private constructor to prevent external instantiation
    }

    private static String word;

    public static String getWord(){

        if(word == null){
            System.out.println("First time calling, Object is null and assigning now");
            word = "driver";
        } else {
            System.out.println("Word is already assigned and has value");
        }

        return word;
    }




}
