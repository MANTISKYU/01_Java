package com.ohgiraffers.subproject;

public class Order {

    private final String menuName; // 커피종류
    private final String option; // HOT OR ICE
    private final int count;

    public Order(String menuName, String option, int count) {

        this.menuName = menuName;
        this.option = option;
        this.count = count;

    }

    public String getMenuName() {
        return menuName;
    }

    public String getOption() {
        return option;
    }

    public int getCount() {
        return count;
    }
}
