package com.ohgiraffers.section04.use4;

public class SuperDice implements Dice {

    private int min;
    private int max;

    public SuperDice() {

        this.max = 10;
        this.min = 1;

    }

    @Override
    public int getNumber() {

        // 0.xxxxxxxx -> 곱하기 2

        int num;
        num= (int) Math.random()*(max+min-1)+min;

        return 0;
    }
}
