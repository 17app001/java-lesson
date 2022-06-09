package lesson_4;

import java.util.Scanner;

public class Ch4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        float score = 0.0f, total = 0.0f;
        do {
            System.out.printf("請輸入第%d位分數:", ++count);
            score = input.nextFloat();
            total += score;

            System.out.printf("是否繼續?(y/n)");
        } while (input.next().equals("y"));

        System.out.printf("總和為:%.2f 平均分為:%.2f", total, total / count);
        input.close();
    }
}
