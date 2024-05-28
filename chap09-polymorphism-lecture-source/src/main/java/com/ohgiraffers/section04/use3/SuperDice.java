package com.ohgiraffers.section04.use3;

import static java.lang.Math.random;

public class SuperDice implements Dice{


        int MIN_NUM;
        int MAX_NUM;

    public SuperDice() {

        MIN_NUM = 1;
        MAX_NUM = 10;

    }

    @Override
    public int getNumber() {


        System.out.println((int)Math.random()*(MAX_NUM-MIN_NUM+1) + MIN_NUM);
        return 0;
    }


}
