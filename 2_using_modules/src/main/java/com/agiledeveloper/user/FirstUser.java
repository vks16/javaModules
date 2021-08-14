package com.agiledeveloper.user;

import com.agiledeveloper.util.*;

public class FirstUser {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        System.out.println("fib(10) : " + fibonacci.fib(10));

        useHelper(fibonacci);
    }

    public Fibonacci handover() {
        return new Fibonacci();
    }

    public static void useHelper(Fibonacci fibonacci) {
        Helper helper = fibonacci.getHelper();
        System.out.println(helper);
        // com.agiledeveloper.impl.MyHelper method = helper.getClass().getMethod("hidden");
        //Reflection part
        try {
            java.lang.reflect.Method method = helper.getClass().getMethod("hidden");
            // System.out.println(method);

            // method.invoke(helper); //Error here
            //To fix this, we may either place "open"

        }catch (Exception ex){
            System.out.println("Error(): " + ex.getMessage());
        }
    }
}