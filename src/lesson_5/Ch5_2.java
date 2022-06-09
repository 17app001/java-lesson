package lesson_5;

import java.util.Scanner;

public class Ch5_2 {
    public static void main(String[] args) {
        float[] score = new float[5];
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入5個分數:");
        for (int i = 0; i < score.length; i++) {
            while (!input.hasNextFloat()) {
                System.out.println("請輸入正確分數");
                input.next();
            }

            score[i] = input.nextFloat();
        }

        double total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        for (float s : score) {
            total += s;
        }

        System.out.printf("總合為:%.2f 平均分為:%.2f", total, total / score.length);
        input.close();
    }
}
