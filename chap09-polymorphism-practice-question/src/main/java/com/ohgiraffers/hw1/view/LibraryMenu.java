package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);




    public void mainMenu() {

        System.out.println("회원의 이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("나이를 입력해주세요");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("성별을 입력해주세요");
        char gender = sc.nextLine().charAt(0);

        lm.insertMember(new Member(name, age, gender, 0));

        while (true) {


            System.out.println("메뉴");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.println();
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:
                    System.out.println(lm.myInfo()); break;

                case 2: selectAll(); break;

                case 3: searchBook(); break;

                case 4: rentBook(); break;

                case 0:
                    System.out.println("프로그램을 종료합니다"); return;

                default:
                    System.out.println("다시 입력해주세요"); break;



            }


        }




    }

    public void selectAll() {

//        lm의 selectAll()메소드를 통해 전체 도서 목록 주소값 받아오기
        Book[] bList = lm.selectAll();

        System.out.println("전체 도서 목록 조회");

        for (int i = 0; i< bList.length; i++) {

            System.out.println(i + "번 도서 : " + bList[i]);


        }





    }

    public void searchBook() {

        System.out.println("키워드를 입력해주세요");
        String keyword = sc.nextLine();

        // lm의 searchBook() 메소드에 keyword 전달
        // 결과값으로 검색된 도서목록 받아옴 --> keyword라면 키워드가 포함된 도서들은 여러권이겠지?
        Book[] searchList = lm.searchBook(keyword);

        // 향상된 for문 이용해서 출력
        System.out.println("검색 도서 목록 조회");

        for(Book bk : searchList) {

            if(bk != null)
                System.out.println(bk);
        }

    }

    public void rentBook() {

        // 전체 도서 목록 조회 메소드를 다시 한번 호출
        selectAll();

        // 도서 전체 조회를 통해 도서들의 번호를 알아봤을 것이다.
        // 따라서 도서 대여는 도서번호를 통해 입력받도록 하자
        System.out.println("대여할 도서 번호 : ");
        int index = sc.nextInt();

        // lm의 rentBook() 메소드에 index 전달
        // 성공적으로 대여 됐는지 결과값 result 받기
        int result = lm.rentBook(index);

        // result가 0인 경우 성공적으로 대여
        // result가 1인 경우 나이제한으로 대여 실패
        // result가 2인 경우 성공적으로 대여 & 요리학원 쿠폰 발급 성공

        if(result == 0)
            System.out.println("성공적으로 대여되었습니다");
        else if (result == 1)
            System.out.println("나이제한으로 대여 불가능입니다");
        else
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다");




    }

}
