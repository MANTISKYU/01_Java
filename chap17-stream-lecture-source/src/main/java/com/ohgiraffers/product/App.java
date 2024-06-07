package com.ohgiraffers.product;

import com.ohgiraffers.section02.terminal.Member;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
//import java.util.stream.Stream;




public class App {

    public static void main(String[] args) {

        List<Product> list = List.of(
                new Product("아이폰X", "apple", "전자기기류", 1000000),
                new Product("맥프로", "apple", "전자기기류", 6300000),
                new Product("베지밀", "정식품", "음료류", 1000000),
                new Product("파스타면", "de cecco", "식품류", 10000),
                new Product("LG G7", "LG", "전자기기", 700000),
                new Product("기계식키보드", "LEOPOLD", "전자기기류", 100000),
                new Product("고양이", "베르나르베르베르", "도서", 15000),
                new Product("간다, 봐라", "법정스님", "도서", 8900),
                new Product("까페라떼", "디초코", "음료류", 4000),
                new Product("아포가토", "디초코", "디저트류", 4500)
        );



        Product product = new Product();
//        List<Product> stringList = Arrays.asList(product);

//        String list2 = list.stream().filter(str -> list.containsAll("전자기기류"));
//        List<Product> listStream = list;
        List<Product> list2 = list.stream().filter(str -> str.getCategory().contains("전자기기")).toList();

        System.out.println("list2 = " + list2);

        List<Product> list3 = list.stream().filter(str -> str.getBrand().equals("apple")).toList();

        System.out.println("list3 = " + list3);













//        List<String> collectorCollection = stringList
//                .stream()
//                .allMatch(str -> str.contains("전자기기류"));

    }


}
