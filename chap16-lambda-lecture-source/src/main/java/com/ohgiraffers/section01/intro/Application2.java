package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x,y) -> x + y;
        OuterCalculator.Sum minus2 = (x,y) -> x - y; // 다른 것도 선언 가능

        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(20, 10));

        OuterCalculator.Minus minus = (x,y) -> x-y;

        System.out.println("20과 10의 차 : " + minus.minusTwoNumber(20, 10));

        OuterCalculator.Multiple multiple = (x,y) -> x*y;

        System.out.println("20과 10의 곱 : " + multiple.multipleTwoNumber(20, 10));

        OuterCalculator.Division division = (x,y) -> x/y;

        System.out.println("20을 10으로 나눈 몫 : " + division.divisionTwoNumber(20, 10));






    }

}
