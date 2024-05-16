package com.ogiraffers.section01.method;

public class Application05 {

    public static void main(String[] args) {

        /*
        * return(반환)
        *
        * 모든 메소드의 내부에는 return;이 존재한다.
        * void 메소드의 경우 return; 명시적으로 작성하지 않아도, 마지막줄에 자동으로 추가해준다.
        * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가라는 명령어이다.
        * */

        System.out.println("main() 메소스 시작함...");

        Application05 app5 = new Application05();
        app5.testmethod();


        System.out.println("main() 메소드 종료됨...");

    }

    public void testmethod() {

        System.out.println("testmethod() 동작 확인");

        return; // 이 시점부터 메소드 종료하고 메인으로 돌아감. 입력하지 않으면 자동으로 마지막에 컴파일러가 실행

    }

}
