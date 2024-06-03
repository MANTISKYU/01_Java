package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Application {


    public static void main(String[] args) {

        File file = new File ("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            boolean iscreate = file.createNewFile();

            /*
            * crateNewFile()
            * 파일 생성 후 성공 실패 여부를 boolean으로 리턴한다.
            * 최초 실행시 새롭게 파일이 만들어지기 때문에 true 반환.
            * 한번 생성되고 난 이후에는 새롭게 파일이 생성되지 않기 때문에 false를 반환
            * */

            System.out.println("파일이 생성되었나? : " + iscreate);

            System.out.println("파일의 크기 : " + file.length() + "byte");
            System.out.println("파일의 경로 : " + file.getPath());
            System.out.println("현재 파일의 상위 경로 : " + file.getParent());
            System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

            boolean isDelete = file.delete();
            System.out.println("isDelete : " + isDelete);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
