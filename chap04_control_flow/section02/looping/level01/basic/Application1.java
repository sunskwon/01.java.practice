package com.ohgiraffers.chap04_control_flow.section02.looping.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 1부터 10까지 합계를 구하고 결과를 출력하세요
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */

        Application1 a = new Application1();
        int result = a.oneToTenSum();

        System.out.println("1부터 10까지의 합 : " + result);
    }

    public int oneToTenSum() {

        int sum = 0;

        for (int i = 1; i < 11; i++) {

            sum += i;
        }

        return sum;
    }
}
