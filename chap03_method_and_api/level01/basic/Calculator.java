package com.ohgiraffers.chap03_method_and_api.level01.basic;

public class Calculator {

    public void checkMethod() {

        System.out.println("checkMethod() 작동 확인");
    }

    public int sum1to10() {

        return 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
    }

    public void checkMaxNumber(int a, int b) {

        System.out.println(a + " 과(와) " + b + " 중 더 큰 값은 " + ((a > b) ? a : b) + "입니다.");
    }

    public int sumTwoNumber(int a, int b) {

        return a + b;
    }

    public int minusTwoNumber(int a, int b) {

        return a - b;
    }
}
