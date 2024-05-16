package com.ogiraffers.section01.method;

import java.sql.SQLOutput;

public class Application09 {

    public static void main(String[] args) {

        /* 다른 클래스에서 작성한 메소드 호출 */

        int first = 100;
        int second = 50;

        /*
        * non-static 메소드의 사용방법
        * [클래스명] [사용할이름] = new [클래스명]();
        *
        * 사용
        * [사용할이름].[메소드명]();
        *
        * */

        Calculator calc = new Calculator();
        int min = calc.nonStaticMinNumberOf(first, second);

        System.out.println("두 수 중 최소 값은 : " + min);


        /*
        * static 메소드의 사용방법
        *
        * [클래스명].[메소드명]();
        * */

        int max = Calculator.staticMaxNumberOf(first, second);

        System.out.println("두 수 중 최대값은 : " + max);








    }
}
