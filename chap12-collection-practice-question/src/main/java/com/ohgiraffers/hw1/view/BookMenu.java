package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();


    public BookMenu() {
    }

    public void menu() {


        do {

            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 선택 : ");

            int menu = sc.nextInt();

//        *** 도서 관리 프로그램 ***
//        1. 새 도서 추가 // addBook (inputBook()이 리턴한 객체) 실행
//        2. 도서정보 정렬 후 출력 // sortedBookList(정렬종류번호) 실행
// =>입력받은 매개변수를 이용하여 정렬방식에 따라 출력
//        정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)
//        1,2 이외의 값을 입력했을 시에는 “번호를 잘못입력하였습니다”를 출력
//=> ArrayList<BookDTO> 리턴 받아 printBookList(ArrayList<BookDTO>) 실행
//        3. 도서 삭제 // deleteBook (도서 번호) 실행
// => seachBook()메소드를 이용
//=> 결과값 리턴 받아 0일 경우 “성공적으로 삭제”
//        1일 경우 “삭제할 글이 존재하지 않음”
//        4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
// => index 리턴 받아 -1일 경우 “조회한 도서가 존재하지 않음”
//        -1이 아닐 경우 printBook(index) 출력
//        5. 전체 출력 // displayAll() 실행
//=> 결과 리스트 리턴 받아 비어있을 경우 “출력할 도서가 없습니다.”
//        아닌 경우는 전체 출력
//        6. 끝내기 // main()으로 리턴
//        메뉴 번호 선택 : >> 입력 받음
//// 메뉴 화면 반복 실행 처리
//// 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행

            switch (menu) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순): ");
                    int select = sc.nextInt();
                    if (select == 1 || select == 2) {
                        bm.printBookList(bm.sortedBookList(select));
                    } else {
                        System.out.println("번호를 잘못입력하셨습니다.");
                    }
                    break;
                case 3:
                    System.out.println("삭제할 도서의 인덱스를 입력해 주세요");
                    int index = sc.nextInt();
                    bm.deleteBook(index);
                    break;
                case 4:
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    System.out.print("정말 끝내시겠습니까? (y/n) : ");
                    char answer = sc.next().toUpperCase().charAt(0);

                    if (answer == 'Y') {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    } else System.out.println("메뉴를 다시 불러옵니다.");

                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }while(true);








    }

    public BookDTO inputBook() {

        Scanner sc = new Scanner(System.in);

        System.out.println("내용을 입력하세요");
        System.out.print("도서번호(ISBN) : ");
        String bNo = sc.next();
        System.out.print("카테고리 (1.인문/2.자연과학/3.의료/4.기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("책제목 : ");
        String bTitle = sc.nextLine();
        System.out.print("저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, bTitle, author);



    }

    public String inputBookTitle() {

        Scanner sc = new Scanner(System.in);

        System.out.println("확인할 도서명을 입력해주세요.");
        System.out.print("책제목 : ");
        return sc.nextLine();




    }

}


