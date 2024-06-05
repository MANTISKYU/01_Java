package com.ohgiraffers.lamda.test;

import com.ohgiraffers.section01.intro.OuterCalculator;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;


public class Application {

    public static void main(String[] args) {

        Application app = new Application();
//        app.test1();
//        app.test2();
//        app.test2_General();
//        app.test3();
//        app.test3_General();
//        app.test4();
//        app.test4_General();
        app.test5();
        app.test5_General();

//        Calculator c1 = new Calculator() {


//
//
//            @Override
//            public int Lotto() {
//
//
//                for(int i =0; i< 6; i++) {
//
//                    System.out.println("로또번호는" + Lotto());
//
//                }
//
//                return Lotto();
//            }
//
//            @Override
//            public double hwan(double a) {
//
//                return a/1300;
//
//            }
//
//            @Override
//            public String LocalTime() {
//                return LocalTime.now().toString();
//            }
//        };

//
//        System.out.println(c1.LocalTime());
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("원화를 입력해주세요");
//        System.out.println(c1.hwan(sc.nextInt()) + "달러입니다");
////        System.out.println(c1.lotto());
//
//
//


    }

    private void test5_General() {

        // 리스트를 만드는 방법
        List<String> strList1 = new ArrayList<>();
        strList1.add("abc");
        strList1.add("");
        strList1.add("대한민국");
        strList1.add("    ");

        // List를 만드는 방법 2
        // Arrays.asList() : 나열된 값을 리스트로 만들어준다.
        // asList()로 만든 리스트의 경우, 컬렉션 프레임워크가 아닌 Arrays 내부의
        // static inner class로 만들어진다 --> 추가, 삭제 불가능 / 변경만 가능
        List<String> strList2 = new ArrayList<>(Arrays.asList("abc", "", "대한민국", "       "));
        List<String> strAsListTest = Arrays.asList("1", "2");
//        strAsListTest.add("3"); // unSupportedOperationException
//        strAsListTest.clear(); // unSupportedOperationException

        // List를 만드는 방법 3
        // List.of() : 팩토리메소드, 나열된 값을 리스트로 만들어준다.
        // List.of()로 만든 리스트는 ImmutableCollections 객체의 내부클래스인 ListN 클래스로 List를 생성
        // 추가, 삭제 불가능 / 변경만 가능
        List<String> strListOfTest = List.of("1", "2");
//        strListOfTest.add("3"); // unSupportedOperationException
//        strListOfTest.clear();
        List<String> strList3 = new ArrayList<>(List.of("abc", "", "대한민국", "     "));

        /*
        * List.of(), Arrays.asList() --> 추가, 삭제 불가능하게 한 이유
        * 불변 객체여야 다른 컬렉션으로 변환이 용이하기 때문
        *
        * */

        // 공백을 제외한 문자열의 길이가 0인지 판단
        for(String str: strList1) {

            // 문자열을 trim() --> 공백을 앞뒤로 다 지우는

            Boolean isLengthZero = str.trim().length() ==0;

            System.out.println("[" + str + "]의 길이는 0입니까?" + isLengthZero );

        }


    }

    private void test5() {

        List<String> strList = new ArrayList<>(Arrays.asList("abc", "", "대한민국", "       "));

        Predicate<String> isLengthZero = str -> str.trim().length() == 0;

        for (String str : strList) {

            System.out.println(str + isLengthZero.test(str));

        }




    }

    private void test4() {

        Function<Integer, Double> calc = won -> {

          double rate = 1300;
          return won / rate;

        };

        double dollor = calc.apply(3000);
        System.out.println(dollor);
    }

    private void test4_General () {
        BiFunction<Integer, Double, Double> calc = (won, rate) -> {

            return won / rate;



        } ;

        double dollor = calc.apply(2000, 1000.0);

        System.out.println("달러는" + dollor);



    }



    private void test3() {


        Consumer<Integer> calc = won -> {

          double rate = 1300;
          double dollor = won / rate;
            System.out.println(won + "won" + " => " + dollor);

        };

        calc.accept(3000);



    }

    private void test3_General () {

        // 입력받을 값
        int won = 3000;

        // 환율
        double rate = 1300;

        // 달러로 환산
        double dollor = won/ rate;

        // 출력
        System.out.println(won + "won" + " => " + dollor);



    }


    private void test2_General() {

        /*
        * Set 특징 : 중복 저장이 허용되지 않음
        * TreeSet 특징 : 자동 정렬
        * 컬렉션 -> 컬렉션에서 다룰 수 있는 데이터는 기본적으로 객체만 가능 -> Integer를 사용한 이유
        * */

        Set<Integer> lotto = new TreeSet<>();

        // 숫자 6개
//        int num = (int)(Math.random()*45) +1;
//        System.out.println(num);

        // 반복문
        while(lotto.size() <6) {

            lotto.add((int)(Math.random()*45) +1);


        }

        System.out.println("lotto = " + lotto);

    }

    private void test2() {

        Supplier<Set<Integer>> lotto = () -> {

            Set<Integer> set = new TreeSet<>();
            while(set.size() <6) {

                set.add((int)(Math.random()*45) +1);


            }

            return set;

        };

        Set<Integer> lottoResult = lotto.get();
        System.out.println("lottoResult = " + lottoResult);

    }




    private void test1() {

        // 방법 1 Runnable
        Runnable now = () -> {

            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        };

        now.run();

        // 방법 2 Consumer
        Consumer<LocalTime> now2 = (time) -> {

            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        };

        now2.accept(LocalTime.now());

    }

    private void test1_General () {

        // os에 보이는 현재 시간을 반환해주는 기능
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // 매개변수도 필요없음
        // 리턴도 필요 없음
        // Runnable
        // Consumer

    }


}
