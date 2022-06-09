package lesson_4;

import java.util.Scanner;

public class Ch4_5_Ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入消費金額:");
        int cost = input.nextInt();
        float discount = 1.0f;

        if (cost >= 10000) {
            if (cost >= 100000) {
                discount = .75f;
            } else if (cost >= 50000) {
                discount = .85f;
            } else if (cost >= 30000) {
                discount = .9f;
            } else {
                discount = .95f;
            }
            System.out.println(cost * discount);
            System.out.println(Math.round(cost * discount));
            System.out.println(Math.ceil(cost * discount));
            System.out.println(Math.floor(cost * discount));
            System.out.println(Math.round(cost * discount * 10.0) / 10.0);

            System.out.printf("消費金額:%d 折扣:%d折 金額為:%d",
                    cost, (int) (discount * 100), Math.round(cost * discount));
        } else {
            System.out.printf("消費金額:%d(無折扣)", cost);
        }

        input.close();
    }
}
