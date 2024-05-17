package com.ogiraffers.section02.package_and_import;

import com.ogiraffers.section01.method.Calculator;

import java.util.Date;

import static com.ogiraffers.section01.method.Calculator.staticMax2NumberOf;
import static com.ogiraffers.section01.method.Calculator.staticMaxNumberOf;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 임포트
        *
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우, 패키지명을 포함한 풀 클래스 이름을 사용해야 하지만
        * 그것은 너무 길어서 불편하다
        *
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
        * */


        Calculator calculator = new Calculator();
        int min = calculator.nonStaticMinNumberOf(50, 60);

        System.out.println("50과 60 중 더 작은 것은? : " + min);

        //static 메소드의 경우

        int max = staticMaxNumberOf(100, 200);
        System.out.println("100과 200 중 더 큰 것은? " + max);

        int max2 = staticMaxNumberOf(100, 200);
        System.out.println("100과 200 중 더 큰 것은? : " + max2);

        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

















    }

}
