package com.ohgiraffers.section7.practice;

public class Application1 {

    public static void main(String[] args) {


        int a = 15;
        int b = 4;

        int result1 = a/b;
        int result2 = a % b;
        int result3 = 5 * 2 - 3;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        int x = 10;
        int y = 20;
        int z = 8;

        int result4 = x += 5;
        int result5 = y /= 4;
        int result6 = z %= 3;

        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);

        int i = 0;
        int j = 10;
        int k = 5;

        int result7 = i++;
        int result8 =- j;
        int result9 = ++ k;

        System.out.println("result7 = " + result7);
        System.out.println("result8 = " + result8);
        System.out.println("result9 = " + result9);

        int num1 = 10;
        int num2 = 20;
        int age = 20;


        System.out.println("num1과 num2가 같은가 : " + (num1 == num2));
        System.out.println("15가 10보다 큰가 : " + (15 > 10));
        System.out.println("변수 age가 18이상인지 확인하는 조건문 : " + (age > 18));

        boolean a1 = true;
        boolean b1 = false;
        int Age = 20;
        int X = 10;
        int Y = 20;


        System.out.println("a와 b가 모두 참일 때 참인 조건문 : " + (a1 && b1));
        System.out.println("int age가 18이상이면서 65미만인지 확인하는 코드 : " + (Age >= 18 && Age < 65));
        System.out.println("x가 10이 아니거나 y가 25 이상인지 확인하는 코드 : " + (X != 10 || Y >= 25));
























    }
}
