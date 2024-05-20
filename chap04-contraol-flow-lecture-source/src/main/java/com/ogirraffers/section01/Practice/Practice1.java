package com.ogirraffers.section01.Practice;

import java.util.Scanner;

public class Practice1 {

    public void Practicetest1() {

//        나이와 키를 입력받는다. 모든 조건을 충족하면
//        ”놀이기구를 탑승 하실 수 있습니다.”를 출력하고,
//        조건이 하나라도 충족되지 않을 경우
//        ”놀이기구를 탑승 하실 수 없습니다.”를 출력한다.
//
//        + 문제
//        어떤 조건에 의해 탑승할 수 없는지 이유를 같이 출력해준다.
//        - “나이가 9살 미만이라 탑승 하실 수 없습니다.”
//        - “키가 110cm 미만이라 탑승 하실 수 없습니다.”
//        - “나이가 9살 미만이고, 키가 110cm 미만이라 탑승하실 수 없습니다.”

        System.out.println("나이를 입력하십시오");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("키를 입력하십시오");
        int num2 = sc.nextInt();

        if (num >= 9 && num2 >=110) {

            System.out.println("놀이기구를 탑승하실 수 있습니다");

        } else if (num >= 9 && num2 <110) {

            System.out.println("놀이기구를 탑승 하실 수 없습니다.");
            System.out.println("키가 110cm 미만이라 탑승하실 수 없습니다");

        } else if (num <9 && num2 >= 110) {

            System.out.println("놀이기구를 탑승 하실 수 없습니다.");
            System.out.println("나이가 9살 미만이라 탑승하실 수 없습니다");


        } else if (num <9 && num2 <110) {

            System.out.println("놀이기구를 탑승 하실 수 없습니다.");
            System.out.println("나이가 9살 미만이고, 키가 110cm 미만이라 탑승하실 수 없습니다");

        }








    }


}
