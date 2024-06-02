package com.ohgiraffers.level02.normal;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /* Question에 대한 답을 작성하는 클래스 입니다. */

        /* Question */

        /* Answer 답변을 기재해주세요. */

        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 영어 점수는 몇점입니까?");
        int num = sc.nextInt();
        System.out.println("당신의 수학 점수는 몇입니까?");
        int num1 = sc.nextInt();
        int sum;
        double average;
        sum = num + num1;
        average = sum / 2.0;
        if (average < 60){
            System.out.println("시험 불합격입니다.");
        } else if (num < 40 || num1 < 40) {
            System.out.println("한 과목 과락으로 불합격입니다.");
        } else{
            System.out.println("시험 합격입니다.");
        }

    }

}
