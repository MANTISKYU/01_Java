package com.ohgiraffers.exception.charcheck;



public class CharacterProcess {

    public CharacterProcess() {
    }

    public int countAlpha(String s) {

        int count = 0;


        for (int i = 0; i<s.length(); i++) {


            if ((65=<s && s=< 90) || (97=<s && =<122)) {

                count++;

            }

            return count;



        }


    }

    public abstract void test1(String s);
}
