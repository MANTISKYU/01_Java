package com.ohgiraffers.section04.use3;

public class Application {

    public static void main(String[] args) {

        Dice dice = new HellDice(); // 헬다이스를 super 다이스로 변경해도 작동되게

        Dicer dicer = new Dicer();
        dicer.throwDice();

    }


}
