package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Practice {

    /*
    * # 객체만들기 연습문제

**문제 설명:**

이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.

**문제 설명:**

Joshua Bloch가 쓴 "Effective Java" 책을 만들고, 416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.

**문제 설명:**

Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을 출력하세요.

**문제 설명:**

나이가 30살이고 이름이 James인 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다. 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.

### **예제 5: Laptop 클래스**

**문제 설명:**
Dell 브랜드의 XPS 13 모델이고, 16GB RAM과 512GB SSD를 가진 노트북을 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
    * */

public void Dog () {

    String name = "Max";
    int age = 5;
    String kinds = "골든 리트리버";

    System.out.println("강아지의 이름은 " + name + "이고, 나이는 " + age + "살이며 " + kinds + "종입니다.");

}

public void Book () {

    String author = "Joshua Bloch";
    String name = "Effective Java";
    int page = 416;
//    String cover = "하드커버";

    Scanner sc = new Scanner(System.in);
    System.out.println("책의 저자를 알고 계시다면 말씀해주세요");

    String author1 = sc.nextLine();

    if(author1.equals("Joshua Bloch")) {

        System.out.println("네 맞습니다");
    } else {

        System.out.println("책의 저자는 Joshua Bloch입니다.");
    }

    System.out.println("책의 이름을 말씀해주세요");
    String name1 = sc.nextLine();

    if(name1 == "Effective Java") {

        System.out.println("네 맞습니다");
    } else {

        System.out.println("책의 이름은 Effective Java입니다.");
    }

    System.out.println("책이 몇 페이지인지 알고 계시다면 말씀해주세요");
    int page1 = sc.nextInt();

    if (page1 == 416) {

        System.out.println("정확히 알고 계십니다. 책은 안 읽고 페이지만 세셨군요");

    } else if(page1 > 416) {

        System.out.println("이 책은 그렇게까지 두껍지는 않습니다. 416 페이지입니다");

    } else if (page1 < 416) {

        System.out.println("이 책은 그보다 두껍습니다 416 페이지입니다");
    }

    String cover = "하드커버";
    System.out.print("이 책이 하드커버인지 소프트커버인지 알고 계신가요");
    String cover1 = sc.nextLine();

    if (cover1.equals("하드커버")) {

        System.out.println("정확히 알고 계시는군요");

    } else if (cover1.equals("소프트커버")) {

        System.out.println("딱 봐도 딱딱해보이지 않나요 하드커버입니다");

    } else {

        System.out.println("둘 중에 하나 고르라고 하면 꼭 이렇게 다른 거 고르는 애들이 있어요");

    }



}


}


