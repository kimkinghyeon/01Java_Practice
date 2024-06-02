package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /* Question에 대한 답을 작성하는 클래스 입니다. */

        /* Question */

        /* Answer 답변을 기재해주세요. */
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력");
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }


        System.out.println();
    }

}
