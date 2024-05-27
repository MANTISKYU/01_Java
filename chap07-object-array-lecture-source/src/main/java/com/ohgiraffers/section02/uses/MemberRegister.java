package com.ohgiraffers.section02.uses;

public class MemberRegister {

    // 서비스라는 클래스에서 정보를 받아오고,
    public void regist(Member[] members) {

        System.out.println("회원을 등록합니다");

        // 실제로 저장되는 않았고, repository의 메소드를 통해
        // repository에 저장할 예정
        for(Member m : members) {

            System.out.println(m.getName() + "님을 회원 등록에 성공했습니다");

        }

        if(MemberRepository.store(members)) {
            System.out.println("총" + members.length + "명의 회원 등록에 성공했습니다.");

        }

    }

}
