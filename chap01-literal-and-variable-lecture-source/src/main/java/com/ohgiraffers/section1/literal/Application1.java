package com.ohgiraffers.section1.literal;

public class Application1 {
    public static void main(String[] args) {
        /*
        System.out.print("a");
        System.out.print("a");
        System.out.println("b");
        System.out.print("c");

        System.out.println("편해요 ㅎㅎ");
        System.out.println();
        */

        /*
        * 여기 사이에는 모든게 주석이 된다.
        *
        * */

        // 수업목표 : 여러 가지 값의 형태를 출력 할 수 있다.

        System.out.println(12.3);
        System.out.println(123);

        // 문자 출력
        System.out.println('a'); // 문자 형태의 값은 홀따옴표로 감싸주어야한다.
//        System.out.println('ab');

        System.out.println('1'); // 숫자 값이지만 홀따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.


        // 문자열 출력
        System.out.println("안녕하세요"); // 문자열은 문자가 여러개가 나열된 형태를 의미하여 쌍따옴표로 감싸져있다.
        System.out.println("123"); // 필기 : 정수이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다.
        System.out.println(""); // 아무 값도 없는 빈쌍따옴표도 문자열로 취급 된다(문자는 불가능).
        System.out.println("a"); // 한개의 문자도 쌍따옴표로 감싸면 문자열이다 (문자 'a' 랑은 다르다)

        // 논리값 출력
        System.out.println(true);
        System.out.println(false);

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








    }
}
