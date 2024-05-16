package com.ogiraffers.section01.method;

public class Application04 {

    public static void main(String[] args) {

        /* 여러개의 전달인자를 이용한 메소드의 호출 테스트 */

        Application04 app4 = new Application04();

        String name = "이득규";
        int age = 20;
        char gender = '남';

        app4.testmethod(name, age, gender);



    }

    // "당신의 이름은 ~이고, 나이는 ~이며, 성별은 ~입니다."

    public void testmethod(String name, int age,final char gender) {

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다." );

    }

}
