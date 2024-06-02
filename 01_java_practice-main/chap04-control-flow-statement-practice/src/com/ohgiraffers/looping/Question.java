package com.ohgiraffers.looping;

import javax.swing.*;
import java.util.Scanner;

public class Question {

    /* 1부터 10까지의 숫자를 출력하는 프로그램 */
    public void first() {
        System.out.println("1~10");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }

    }

    /* 10부터 1까지의 숫자를 역순으로 출력하는 프로그램 */

    public void first2() {
        System.out.println();
        System.out.println("10~1");
        for (int i = 10; i > 1; i--) {
            System.out.print(i);
        }
    }

    /* 구구단 7단을 출력하는 프로그램 */
    public void guguDan() {
        System.out.println();
        System.out.println("2~7단");

        for (int dan = 2; dan < 8; dan++) {
            System.out.println(dan + "단 입니다.");

            System.out.println();

            for (int su = 1; su < 10; su++) {
                if (su > 10) {
                    break;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */

    public void first3() {
        System.out.println();
        System.out.println("1~100 짝수");
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }

    }

    /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
     *   팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6
     * */
    public void first4() {

        System.out.println();
        System.out.println("팩토리얼");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
            System.out.print(n + " * " + i);
        }
        System.out.println(" = " + sum);

    }

    /* 0시 0분에서 23시 59분 까지 출력하는 프로그램을 작성해보자 */

    public void first5() {
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                System.out.println(i + "시" + j + "분");
            }
        }
    }


    /* 별 만들기 게임
     *   *
     *   **
     *   ***
     *   ****
     *   *****
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */
    public void star01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄의 수를 입력하세여.");
        int row = sc.nextInt();
        System.out.println("계단");

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /* 별 만들기 게임
     *      *
     *     ***
     *    *****
     *   *******
     *
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */
    public void star02() {
        System.out.println();
        System.out.println("피라미드");
        for (int i = 1; i < 10; i += 2) {
            for (int j = 9; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }



    /* 별 만들기 게임
     *       *
     *     ***
     *    ****
     *   *****
     *
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */

    public void star03() {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("역방향");

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}



