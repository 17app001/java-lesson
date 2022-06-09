package lesson_5;

import java.util.Scanner;

public class Ch5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請問班級有幾位同學?");

        while (!input.hasNextInt()) {
            System.out.println("請輸入正確人數");
            input.next();
        }

        int count = input.nextInt();

        String[] subjects = { "國文", "英文", "數學" };
        float[][] scores = new float[count][subjects.length];
        String[] names = new String[count];

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("請輸入第%d位成績(姓名):%n", i + 1);
            names[i] = input.next();
            // 輸入分數
            for (int j = 0; j < subjects.length; j++) {
                System.out.printf("請輸入%s分數:", subjects[j]);
                while (!input.hasNextFloat()) {
                    System.out.println("請輸入正確分數");
                    input.next();
                }

                scores[i][j] = input.nextFloat();
            }
        }

        for (int i = 0; i < names.length; i++) {
            double total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            System.out.printf("%-10s 總分為:%6.2f 平均分為:%6.2f%n",
                    names[i], total, total / scores[i].length);
        }

        input.close();
    }
}
