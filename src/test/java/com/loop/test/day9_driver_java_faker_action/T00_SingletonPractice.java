package com.loop.test.day9_driver_java_faker_action;

import org.testng.annotations.Test;

public class T00_SingletonPractice {


    @Test
    public void practice(){
        String str1 = T0_SingletonPattern.getWord();
        System.out.println("str1 = " + str1);

        System.out.println("=====================");

        String str2 = T0_SingletonPattern.getWord();
        System.out.println("str2 = " + str2);
    }
}
