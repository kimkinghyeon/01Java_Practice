package com.ohgiraffers.level03.hard;

import java.util.Scanner;

public class Question {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("키 입력");
        double height = sc.nextDouble();
        System.out.println("몸무게 입력");
        double weight = sc.nextDouble();

        double bmi = weight / (height/100 * height/100);

        bmi = (int)(bmi * 100)/100;

        if(bmi < 20){
            System.out.println("키" + height + "몸무게" + weight);
            System.out.println("bmi=" + bmi + " 저체중");

        } else if (bmi < 24) {
            System.out.println("키" + height + "몸무게" + weight);
            System.out.println("bmi=" + bmi + " 정상");

        } else if (bmi < 29) {
            System.out.println("키" + height + "몸무게" + weight);
            System.out.println("bmi=" + bmi + " 과체중");

        } else {
            System.out.println("키" + height + "몸무게" + weight);
            System.out.println("bmi=" + bmi + " 비만");

        }


    }

}
