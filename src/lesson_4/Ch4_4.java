package lesson_4;

import java.util.Scanner;

public class Ch4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入消費金額:");
        int cost = input.nextInt();

        if (cost >= 10000) {
            if (cost >= 100000) {
                System.out.printf("消費金額:%d 折扣:%d折 金額為:%d",
                        cost, 75, (int) (cost * .75));
            } else if (cost >= 50000) {
                System.out.printf("消費金額:%d 折扣:%d折 金額為:%d",
                        cost, 85, (int) (cost * .85));
            } else if (cost >= 30000) {
                System.out.printf("消費金額:%d 折扣:%d折 金額為:%d",
                        cost, 9, (int) (cost * .9));
            } else {
                System.out.printf("消費金額:%d 折扣:%d折 金額為:%.0f",
                        cost, 95, cost * .95);
            }
        } else {
            System.out.printf("消費金額:%d(無折扣)", cost);
        }

        input.close();
    }
}
