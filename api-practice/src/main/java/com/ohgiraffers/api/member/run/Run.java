package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Run {

    public static void main(String[] args) {



        String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        // | 기준으로 분리
        String[] firstSplitArr = data.split("\\|"); // | 정규표현식에 사용되므로 escape를 사용해

        System.out.println("fistArr = " + Arrays.toString(firstSplitArr));

        // , 기준으로 분리
        // firstSplitArr[0] : 1, 김연아, 165, 47, 19900905
//        String[] secondSplitArr = firstSplitArr[0].split(",");
//        System.out.println("secondSplitArr = " + Arrays.toString(secondSplitArr));


        Member[] members = new Member[firstSplitArr.length];
        for (int i =0; i < firstSplitArr.length; i++) {

            String[] secondSplitArr = firstSplitArr[i].split(",");

            // 분리해서 나온 데이터들을 Member라는 클래스의 필드값으로 저장.
            Member member = new Member();
            member.setMemberName(secondSplitArr[1]);
            member.setMemberNo(Integer.parseInt(secondSplitArr[0]));
            member.setHeight(Integer.parseInt(secondSplitArr[2]));
            member.setWeight(Integer.parseInt(secondSplitArr[3]));
            LocalDate birth = LocalDate.parse(secondSplitArr[4], DateTimeFormatter.ofPattern("yyyyMMdd"));
            member.setBirth(birth);

            members[i] = member;


        }

        System.out.println(Arrays.toString(members));





    }

}
