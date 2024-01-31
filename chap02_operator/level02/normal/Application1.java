package com.ohgiraffers.chap02_operator.level02.normal;

public class Application1 {

    public static void main(String[] args) {

        /* 실수를 변수로 선언하여 점수를 저장하고,
         * 이를 정수로 변환하여 점수가 90점 이상이면 "A",
         * 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D",
         * 60점 미만이면 "F"를 출력하는 프로그램을 작성해본다.
         *
         * -- 출력 예시 --
         * 
         * 홍길동의 이번 점수등급은 B입니다.
         *
         * */

        double num1 = 95;
        double num2 = 85;
        double num3 = 75;
        double num4 = 65;
        double num5 = 55;

        String result1 = "점수등급은 " + ((num1 >= 90)? "A입니다." : (num1 >= 80)? "B입니다." : (num1 >= 70)? "C입니다." : (num1 >= 60)? "D입니다." : "F입니다.") + "(점수 : " + num1 + " 점)";
        String result2 = "점수등급은 " + ((num2 >= 90)? "A입니다." : (num2 >= 80)? "B입니다." : (num2 >= 70)? "C입니다." : (num2 >= 60)? "D입니다." : "F입니다.") + "(점수 : " + num2 + " 점)";
        String result3 = "점수등급은 " + ((num3 >= 90)? "A입니다." : (num3 >= 80)? "B입니다." : (num3 >= 70)? "C입니다." : (num3 >= 60)? "D입니다." : "F입니다.") + "(점수 : " + num3 + " 점)";
        String result4 = "점수등급은 " + ((num4 >= 90)? "A입니다." : (num4 >= 80)? "B입니다." : (num4 >= 70)? "C입니다." : (num4 >= 60)? "D입니다." : "F입니다.") + "(점수 : " + num4 + " 점)";
        String result5 = "점수등급은 " + ((num5 >= 90)? "A입니다." : (num5 >= 80)? "B입니다." : (num5 >= 70)? "C입니다." : (num5 >= 60)? "D입니다." : "F입니다.") + "(점수 : " + num5 + " 점)";
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
