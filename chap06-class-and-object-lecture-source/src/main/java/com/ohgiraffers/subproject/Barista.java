package com.ohgiraffers.subproject;

public class Barista {

    /*
    * 주문에 따라 커피를 만들어야함.
    *
    * */
    private int coffeeStock = 200; // 5000g 커피 보유
    public Coffee[] makeCoffee(Order order) {


        // 재고 차감 처리 - 커피 한잔에 20g 사용
        if(coffeeStock >= (order.getCount()*20)) {

        // 커피 생성
        Coffee[] coffees = new Coffee[order.getCount()];
        coffeeStock = coffeeStock - order.getCount()*20;
        for(int i = 0; i < coffees.length; i++) {

            coffees[i] = new Coffee(order.getMenuName(), order.getOption());

        }

        return coffees;
        } else {

            System.out.println("[바리스타] : 커피가루 충전해주세요!!!!!");
            return null;
        }

    }



}
