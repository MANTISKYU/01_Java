package com.ohgiraffers.section2.variable;

public class Application3 {
    public static void main(String[] args) {

        /*
         * 변수의 명명 규칙
         *
         * 변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 존재한다.
         * 실무적으로 굉장히 중요하기 떄문에 숙지가 필수적이다.
         * 또한, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다.
         * */

        /*
         * 변수의 명명 규칙
         * 1. 컴파일 에러를 발생시키는 규칙
         *   1-1. 동잃한 밤위 내에서 동이한 변수명을 가질 수 없다
         *  1-2. 예약어는 사용이 불가능하다.
         *       에약어? : 자바에서 미리 사용하겠다고 컴파일러와 약속한 키워드들을 의미한다
         * 1-3. 병수명은 대문자와 서문자를 구분핟니다.
         * 1-4 변수명은 숫자로 시작할 수 없다.
         * 1-5 특수기호는 '_'와 '$'만 사용 가능하다. (공백을 사용할 수 없습니다)

         * 2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의  규칙 (암묵적 규칙)
         * 2-1 변수명의 길이 제한은 없다.
         * 2-2 변수명이 합성어로 이루어진 경우, 첫단어는 소문자, 두번째 시작단어부터는 대문자로 시작한다.(camel-case)
         * 2-3 단어와 단어 사이의 연결은 언더스코어(_)로 하지 않는다. (2-2 지켜라)
         *    상수를 사용할 때 특수하게 사용한다.
         * 2-4 한글로 변수명을 짓는게 가능하지만, 권장되진 않는다. (한글을 취급하는 다영한 방식 때문에 에러 유발)
         * 2-5 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
         * 2-6 전형적인 변수 이름이 있다면 가급적 사용하도록 한다.
         * 2-7 변수명은 명사형으로 작성할 수 있도록 한다.
         * 2-8 boolean 형은 의문문으로 가급적 긍정의 형태로 네이밍을 합니다.
         * */

        // 컴파일 에러를 발생시키는 규칙
        int age = 20;
        // int age; // 동일한 변수명을 가지므로 에러가 발생함

//        int true; // 예약어 사용 불가
//        int byte;

        int Age = 20; // 위에서 만든 age와 다른 변수로 취급한다.
        int True = 20; // 예약어 true와 다른 변수로 취급한다.

//        int 1age = 20; // 숫자로 시작하기 때문에 컴파일 에러가 발생한다.
        int age1 = 20; // 숫자가 맨 앞에 있지 않으면 섞어서 사용 가능하다.

//        int a ge; // 사용가능한 특수 문자 외에는 사용이 불가능하다.
//        int a@ge;
        int _a_ge_ = 20; // 언더스코어(_) 사용 가능하다. 처음 중간 마지막 상관 없음.
        int $h$arp$ = 20; // $ 사용 가능하다. 처음 중간 마지막 상관 없음.


        // 암묵적 약속
        // 변수의 길이에는 제한이 없지만, 적당히 하자.
        int askdjklflasdljlasjd; // 이렇게는 사용하지 말자.

        /*
        * 카멜케이스
        *
        * 합성어일 경우 첫단어는 모두 소문자, 두번째 시작 단어는 대문자로 시작한다.
        * 자바에서는 클래스명만 유일하게 대문자로 시작한다.
        * */
        int maxAge = 20;
        int minAge = 10;

        int 나이; // 가능하지만 권장하지 않음.

        String s; // 변수가 어떤 의미인지 파악하기 힘듦
        String name; // 의미를 분명히 해서 변수명을 지어야 의도가 파악이 된다.

        // 전형적인 변수명들
        int sum = 0;
        int max = 0;
        int min = 0;
        int count = 1;

        String gohome;
        String home; // 가급적 명사형으로 짓는다.

        boolean isAlive = true;
//        boolean isDead = false; 부정형보다 긍정형이 더 나은 방식이다.
        boolean isTrue = true;

        

















    }
}
