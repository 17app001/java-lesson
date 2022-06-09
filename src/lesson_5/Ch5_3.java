package lesson_5;

import java.util.Scanner;

public class Ch5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請問班級有幾位同學?");

        while (!input.hasNextInt()) {
            System.out.println("請輸入正確人數");
            input.next();
        }

        int count = input.nextInt();
        float[] score = new float[count];

        for (int i = 0; i < score.length; i++) {
            System.out.printf("請輸入第%d位分數:%n", i + 1);
            while (!input.hasNextFloat()) {
                System.out.println("請輸入正確分數");
                input.next();
            }

            score[i] = input.nextFloat();
        }

        double total = 0;
        for (float s : score) {
            total += s;
        }

        System.out.printf("共%d位同學 總合為:%.2f 平均分為:%.2f",
                count, total, total / score.length);
        input.close();
    }
}
