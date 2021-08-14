package com.agiledeveloper.second;

import com.agiledeveloper.user.FirstUser;

public class SecondUser {
    public static void main(String[] args){
        FirstUser firstUser = new FirstUser();

        System.out.println(firstUser.handover().fib(10));
    }
}