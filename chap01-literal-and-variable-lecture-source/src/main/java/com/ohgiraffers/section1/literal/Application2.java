package com.ohgiraffers.section1.literal;

public class Application2 {

public static void main(String[] args) {

    // 정수와 정수의 연산
    System.out.println("*======== 정수와 정수의 연산 ========*");
    System.out.println(123 + 456);
    System.out.println(123 - 23);
    System.out.println(123 * 10);
    System.out.println(123 % 10); // 나누기를 한 나머지 값
    System.out.println(123 / 10); // 나누기를 한 몫의 값

    // 실수와 실수의 연산
    System.out.println("*=========== 실수와 실수의 연산 ============*");
    System.out.println(1.23 + 1.23);
    System.out.println(1.23 - 0.23);
    System.out.println(1.23 * 10);
    System.out.println(1.23 / 10);
    System.out.println(1.23 % 10);

    // 정수와 실수의 연산
    // 정수와 실수를 연산을 하면 결과는 항상 실수가 나온다.
    System.out.println("=========== 정수와 실수의 연산 ==========");
    System.out.println(123 + 0.5); // 실수
    System.out.println(123 - 0.5); // 실수
    System.out.println(123 * 0.5); // 실수
    System.out.println(123 / 0.5); // 실수
    System.out.println(123 % 0.5); // 실수

    // 문자와 문자의 연산
    // 문자는 내부적으로 숫자로 인식되어 연산된다/
    System.out.println("========= 문자와 문자의 연산 =========");
    System.out.println('a' + 'b');
    System.out.println('a' - 'b');
    System.out.println('a' * 'b');
    System.out.println('a' / 'b');
    System.out.println('a' % 'b');

    // 문자와 정수의 연산
    System.out.println("=========== 문자와 정수의 연산 =========");
    System.out.println('a' + 1);
    System.out.println('a' - 1);
    System.out.println('a' * 10);
    System.out.println('a' / 10);
    System.out.println('a' % 10);

    // 문자와 실수의 연산
    // 결과는 실수의 형태로 나오게 된다.
    System.out.println("=========== 문자와 실수의 연산 =========");
    System.out.println('a' + 1.0);
    System.out.println('a' - 1.0);
    System.out.println('a' * 10.0);
    System.out.println('a' / 10.0);
    System.out.println('a' % 10.0);

    /*
     * 결론은 문자는 내부적으로 숫자 취급을 한다.
     * */

    // 문자열과 문자열의 연산
    // 문자열과 문자열의 연산은 합치기(이어붙이기)가 된다.
    // 문자열과 문자열의 연산은 '+' 연산만 가능하다.
    System.out.println("=========== 문자열과 문자열의 연산 =========");
    System.out.println("hello" + "world!");
//        System.out.println("hello" - "world!");
//        System.out.println("hello" * "world!");
//        System.out.println("hello" / "world!");
//        System.out.println("hello" % "world!");

    // 문자열과 다른 형태의 값 연산
    System.out.println("=========== 문자열과 다른 형태의 값 연산 =========");
    System.out.println("Deuk kyu" + 123); // 정수와의 연산
    System.out.println("Deuk kyu" + 123.456); // 실수와의 연산
    System.out.println("Deuk kyu" + 'a'); // 문자와의 연산
    System.out.println("Deuk kyu" + true); // 논리값과의 연산

    // 주의해야할 점 : 숫자로 된 문자열 형태의 값도 + 연산을 했을 때 문자열 합치기가 된다.
    System.out.println("123" + "456"); //123456

    // 논리값과 논리값의 연산
    // 논리값끼리의 연산은 모든 연산자 사용이 불가능하다.
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);

    // 논리값과 정수의 연산도 마찬가지로 안됩니다.
    // 논리값과 실수의 연산도 마찬가지로 안돼요.
    // 논리값과 문자의 연산도 안돼요.
    // 논리값과 문자열의 연산
    System.out.println("==========논리값과 문자열 값의 연산==============");
    System.out.println(true + "a");



}
}
