package com.ogirraffers.section01.conditional;

public class Application {
    // 실행용 클래스

    public static void main(String[] args) {


        A_if aIf = new A_if();


//        aIf.testSimpleIfStatement(); // 단일 if 문
//        aIf.testnestedIfstatement();


        B_ifElse b_ifElse = new B_ifElse();

//        b_ifElse.testSimpleIfElseStatement();

//        b_ifElse.testNestedIfElseStatement();

        C_ifElseIf cifelseif = new C_ifElseIf();

//        cifelseif.testSimpleIfElseIfStatement();


//        cifelseif.testNestedIfElseIfStatement2();

        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStatement();

        dSwitch.testSwitchVendingMachine();









    }

}
