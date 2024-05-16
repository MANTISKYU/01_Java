package com.ogiraffers.section01.method;

public class Application10 {

    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 5;

        Calculator calc = new Calculator();


        // 더하기
        int plus = calc.nonStaticPlusNumberOf(num1, num2);
        System.out.println("두 수를 더한 값 : " + plus);

        // 빼기
        int minus = calc.nonStaticMinusNumberOf(num1, num2);
        System.out.println("두 수를 뺀 값 : " + minus);

        // 곱하기
        int multiple = calc.nonStaticMultipleNumberOf(num1, num2);
        System.out.println("두 수를 곱한 값 : " + multiple);

        // 나누기
        int divide = calc.nonStaticDivideNumberOf(num1, num2);
        System.out.println("두 수를 나눈 값 : " + divide);

        // 나머지
        int rest = Calculator.restNumberOf(num1, num2);
        System.out.println("두 수를 나눈 나머지 : " + rest );



    }
}
