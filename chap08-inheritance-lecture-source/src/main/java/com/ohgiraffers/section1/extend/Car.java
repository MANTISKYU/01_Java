package com.ohgiraffers.section1.extend;

public class Car {

    // 부모클래스

    // 자동차의 달리는 상태를 확인 할 수 있는 필드
    private boolean runningStatus;

    public Car() {

        System.out.println("Car 클래스의 기본 생성자 호출됨");

    }

    public void run() {

        runningStatus = true;
        System.out.println("자동차가 달리기 시작합니다...");

    }

    public void soundHorn() {

        // 자동차가 주행중일 때만 경적을 울리게
        if (isRunning()) {

            System.out.println("빵빵");

        } else {

            System.out.println("경적 안 울림");

        }

    }

    protected boolean isRunning() {

        return runningStatus;
    }

    public void stop() {


    }

}
