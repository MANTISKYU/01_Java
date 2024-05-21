package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램
        * */

        int[] scores = new int[5];
//

        Scanner sc = new Scanner(System.in);
//        System.out.println("점수를 입력하세요");
//
//        int num1 = sc.nextInt();
//        System.out.println("점수를 입력하세요");
//        int num2 = sc.nextInt();
//        System.out.println("점수를 입력하세요");
//        int num3 = sc.nextInt();
//        System.out.println("점수를 입력하세요");
//        int num4 = sc.nextInt();
//        System.out.println("점수를 입력하세요");
//        int num5 = sc.nextInt();
        // 점수를 입력 받는다.
        // 입력받은 점수를 scores 배열에 저장
        // 배열의 값들을 합계 --> int
        // 배열의 값들을 평균 --> 실수

//        score[0] = num1;
//        score[1] = num2;
//        score[2] = num3;
//        score[3] = num4;
//        score[4] = num5;

        int sum = 0;
        double avg = 0;

//        for (int i = 0; i<5; i++) {
//
//            sum = sum + score[i];
//            System.out.println("배열의 값들의 합계 : " + sum);
//        }
//
//
//        for (int i = 0; i < 5; i++) {
//
//
//
//            avg = ((avg + score[i]) / i);
//            System.out.println("배열의 값들의 평균 : " + avg);

        for(int i = 0; i < scores.length; i++) {

            System.out.println(i + "번째 학생의 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();
        }

//        sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
//
        for(int i = 0; i < scores.length; i++) {

            sum = sum + scores[i];

        }


        avg = (double)sum/scores.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);



        }







    }

