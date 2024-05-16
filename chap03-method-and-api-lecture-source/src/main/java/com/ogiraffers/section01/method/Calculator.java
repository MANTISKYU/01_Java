package com.ogiraffers.section01.method;

public class Calculator {

    // 삼항연사자로 두수를 비교해서 작은 값을 return 해주는 메소드

    public int nonStaticMinNumberOf(int first, int second) {


        int result = (first > second) ? second : first;

        return result;

    }


    // 삼항연산자로 두수를 비교해서 큰 값을 return 해주는 메소드
    public static int staticMaxNumberOf(int first, int second) {


        return (first > second) ? first : second; // 둘 중 더 큰 값이 리턴됨

    }

    // 더하기, 뺴기, 곱하기, 나누기, 나머지
    // 이 각각을 수행할 수 있는 메소드를 만들고
    // 더하기, 빼기, 곱하기, 나누기 ==> non-static


    public int nonStaticPlusNumberOf(int num1, int num2){

        return (num1 + num2);

    }

    public int nonStaticMinusNumberOf(int num1, int num2){

        return (num1 - num2);

    }

    public int nonStaticMultipleNumberOf(int num1, int num2){

        return (num1 * num2);

    }


    public int nonStaticDivideNumberOf(int num1, int num2){

        return (num1 / num2);

    }

    public static int restNumberOf(int num1, int num2){

        return (num1 % num2);


    }

    public static int staticMax2NumberOf(int num1, int num2){

        return (num1 > num2) ? num1 : num2;


    }


}
