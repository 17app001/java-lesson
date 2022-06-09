package lesson_4;

import java.util.Scanner;

public class Ch4_11_Ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        float score = 0.0f, total = 0.0f;
        boolean hasFour = false;
        while (true) {
            if (count + 1 == 4) {
                count++;
                hasFour = true;
                continue;
            }

            System.out.printf("請輸入第%d位分數(-1:exit):", count + 1);
            score = input.nextFloat();
            if (score == -1) {
                break;
            }

            total += score;
            count++;
        }

        if (hasFour) {
            count--;
        }

        System.out.printf("共輸入%d位同學 總和為:%.2f 平均分為:%.2f",
                count, total, total / count);
        input.close();
    }
}
