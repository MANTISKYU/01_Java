package com.ohgiraffers.section02.dimensional;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 가변배열
        *
        * 할당과 동시에 블록을 이용해서 초기화가 가능하다,
        * */

        int[][] iarr = {{1, 2, 3, 4, 5} , {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        for(int i = 0; i<iarr.length; i++){

         for(int j = 0; j< iarr[i].length; j++) {

             System.out.print(iarr[i][j] + " ");
         }
            System.out.println();
        }

        int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};


        System.out.println("========= 가변배열 =========");

        for(int i = 0; i<iarr2.length; i++){

            for(int j = 0; j< iarr2[i].length; j++) {

                System.out.print(iarr2[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};


        int[][] iarr3 = {arr1, arr2};
        System.out.println();
        for(int i = 0; i<iarr3.length; i++){

            for(int j = 0; j< iarr3[i].length; j++) {

                System.out.print(iarr3[i][j] + " ");
            }
            System.out.println();
        }







    }

}
