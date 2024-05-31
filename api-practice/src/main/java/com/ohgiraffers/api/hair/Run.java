package com.ohgiraffers.api.hair;

import com.ohgiraffers.api.hair.Member;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

public class Run {

    public static void main(String[] args) {


        String data = "1,Devin,Rossey,drossey0@state.tx.us,Male,2024-09-04,20:22,2012-10-10T07:55:50\n" +
                "2,Alice,Krause,akrause1@about.com,Female,1983/04/04,2024-06-01,16:16,2011-09-08T17:09:39\n" +
                "3,Elinore,Girauld,egirauld2@sciencedaily.com,Female,1989/01/19,2024-01-13,16:21,2012-12-04T19:37:08\n" +
                "4,Guntar,Snowsill,gsnowsill3@uol.com.br,Male,,2024-05-10,9:14,2015-10-15T11:04:16";



        String[] firstSplitArr = data.split(",");

        System.out.println("값을 제대로 받아왔는지 확인");
        System.out.println(Arrays.toString(firstSplitArr));

        Member[] members = new Member[firstSplitArr.length];
        for( int i = 0; i < firstSplitArr.length; i++) {

            String[] secondSplitArr = firstSplitArr[i].split(",");

            Member member = new Member();

            member.setId(secondSplitArr[0]);
            member.setFirst_name(secondSplitArr[1]);
            member.setLast_name(secondSplitArr[2]);
            member.setEmail(secondSplitArr[3]);
            member.setGender(secondSplitArr[4]);
            member.setBirthday(LocalDate.parse(secondSplitArr[5]));
            member.setReservation_date(LocalDate.parse(secondSplitArr[6]));
            member.setReservation_time(LocalTime.parse(secondSplitArr[7]));
            member.setCreated_at(LocalDateTime.parse(secondSplitArr[8]));



            members[i] = member;


        }

        System.out.println("===========================");
        System.out.println(Arrays.toString(members));








    }

}
