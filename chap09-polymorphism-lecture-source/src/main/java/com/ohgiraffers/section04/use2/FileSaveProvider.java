package com.ohgiraffers.section04.use2;

public class FileSaveProvider implements SaveProvider {

    // SaveProvider를 상속받고, save()를 구현해라
    // return은 무조건 false
    // 안내문구는 "파일저장에 실패했습니다"


    @Override
    public boolean save(String data) {

        System.out.println("파일저장에 실패했습니다");
        return false;
    }
}
