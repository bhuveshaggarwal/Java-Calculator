package com.bhuvesh;

public class Calculator {

    static int add(int a, int b){
        return a + b;
    }

    static int subtract(int a, int b){
        return a - b;
    }

    static int multiply(int a, int b){
        return a * b;
    }

    static int divide(int a, int b){
        if(b != 0){
            return a / b;
        } else{
            return 0;
        }
    }
}
