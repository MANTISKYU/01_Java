package com.ogiraffers.section01.method;

public class Application07 {

    public static void main(String[] args) {

        /* 매개변수와 리턴값의 복합 활용 */

        int first = 20;
        int second = 20;

        Application07 app7 = new Application07();
        System.out.println("두 수를 더한 결과 : " + app7.plustwonumber(first, second));
        System.out.println("두 수를 뺀 결과 : " + app7.minustwonumber(first, second));
        System.out.println("두 수를 곱한 결과 : " + app7.multipletwonumber(first, second));
        System.out.println("두 수를 나눈 결과 : " + app7.dividetwonumber(first, second));




    }


    public int plustwonumber(int first, int second) {

        return first + second;



    }


    public int minustwonumber(int first, int second){

        return first - second;

    }

    public int multipletwonumber(int first, int second){

        return first * second;

    }

    public int dividetwonumber(int first, int second){

        return first / second;
    }



}
