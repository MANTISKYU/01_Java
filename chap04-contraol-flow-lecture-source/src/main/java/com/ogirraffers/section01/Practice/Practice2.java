package com.ogirraffers.section01.Practice;

import java.util.Scanner;

public class Practice2 {


    public void Practicetest2() {

//        영어와 수학의 점수를 입력 받는다.
//        두 과목의 평균이 60점 이상이고, 두 과목 모두다 40점 이상이여야 합격이 가능하다.
//        평균이 60점 미만일 경우 “시험 불합격”
//        60점은 넘지만 한과목이 40점 미만일 경우 “한과목 과락으로 인한 불합격”
//        두 조건다 통과할경우 “시험 합격” 을 출력한다.

        Scanner sc = new Scanner(System.in);

        System.out.println("영어 점수를 입력하십시오");
        int num = sc.nextInt();

        System.out.println("수학 점수를 입력하십시오");
        int num2 = sc.nextInt();

        if (num + num2 >= 120 && (num >= 40 && num2 >= 40)) {

            System.out.println("시험 합격");


        } else if (num + num2 >= 120 && (num <40 || num2 < 40)) {

            System.out.println("한과목 과락으로 인한 불합격");

        } else if (num + num2 < 120) {

            System.out.println("시험 불합격");

        }








    }

}
