package com.ohgiraffers.section04.use4;

public class Application {

    public static void main(String[] args) {

        Dice dice = new HellDice();

        Dicer dicer = new Dicer();

        dicer.throwDice(dice);






    }

}
