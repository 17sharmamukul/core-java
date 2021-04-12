package com.work.mukul.java8.doubleColon;

interface Intern {
    void m1(String s);
}

public class DoubleColonTest {

    public static void main(String[] args) {
        test(str -> {
            System.out.println("hello->"+str);
        });
    }

    public static void test(Intern intern) {
        intern.m1("Mukul sharma");
    }
}

