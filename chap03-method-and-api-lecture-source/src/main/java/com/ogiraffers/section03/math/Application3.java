package com.ogiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /*
        * java.util.Random
        *
        * java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
        * nextInt(Int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 변환
        *
        * 원하는 범위의 난수를 구하는 공식
        * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        Random random = new Random();

        // 0에서 9까지의 난수 발생
        int randomNum1 = random.nextInt(10);
        System.out.println("0부터 9까지의 난수 : " + randomNum1);

        // 1 ~ 10까지의 난수 발생
        int randomnum2 = random.nextInt(10) + 1;
        System.out.println("1부터 10까지의 난수" + randomnum2);

        // 20 ~ 45까지의 난수 발생
        int randomnum3 = random.nextInt(26) + 20;
        System.out.println("20부타 45까지의 난수" + randomnum3);


        // -128 ~ 127까지의 난수 발생
        // int randomnum4 = random.nextInt(256) - 128;
        int randomnum4 = random.nextInt(256) - 128; // 객체를 생성하자마자 바로 메소드 호출 가능
        System.out.println("-128부터 127까지의 난수 " + randomnum4);







    }

}
