package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        // 메소드의 파라미터 (매개변수)

        /*
        * 매개변수로 사용 가능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스자료형
        * 4. 클래스자료형 배열
        * 5. 가변인자
        * */

        ParameterTest pt = new ParameterTest();

        // 기본자료형을 매개변수로 전달받는 메소드 호출 확인.
        int num = 20;

        pt.testPrimaryTypeParameter(num);

        // 기본자료형 배열을 매개변수로 전달받는 메소드 호출 확인

        int[] iarr = new int[] {1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값" + iarr);
        pt.testPrimaryTypeArrayParameter(iarr);

        System.out.println("변경후 배열의 값 출력");
        for(int i = 0; i < iarr.length; i++) {

            System.out.println(iarr[i] + " ");}


        // 클래스 자료형
        Rectangle r1 = new Rectangle(12.5, 22.5);

        System.out.println("인자로 전달하는 값 : " + r1);

        pt.testPrimaryTypeParameter(r1);

        System.out.println("==========변경 후 원본 사각형의 넓이와 둘레 ==========");
        r1.calcArea(); // 넓이 출력
        r1.calcRound(); // 둘레 출력


        // 가변인자

//        pt.testVariableLengthArrayParameter("이름");
        pt.testVariableLengthArrayParameter("홍길동"); // 가변인자가 전달되지 않아도 괜찮음
        pt.testVariableLengthArrayParameter("홍길동", "볼링"); // 1개 가능
        pt.testVariableLengthArrayParameter("홍길동", "볼링", "당구");
        pt.testVariableLengthArrayParameter("신사임당", new String[]{"테니스", "서예"}); // 배열도 가능



        }



    }

