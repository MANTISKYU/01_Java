package com.ohgiraffers.subproject;

public class Coffee {

    // 커피종류 {아메리카노, 라떼}
    private final String coffeeName;

    private final String option;

    public Coffee(String coffeeName, String option) {
        this.coffeeName = coffeeName;
        this.option = option;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getOption() {
        return option;
    }

    // toString : 필드에 있는 모든걸 출력하고 싶을 때 만드는 메소드
    public String toString() {

        return "%s(%s)".formatted(coffeeName, option);

    }

}
