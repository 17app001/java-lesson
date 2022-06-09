package lesson_4;

import java.util.Scanner;

public class Ch4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        float score = 0.0f, total = 0.0f;
        while (true) {
            System.out.printf("請輸入第%d位分數:", ++count);
            score = input.nextFloat();
            total += score;

            System.out.printf("是否離開?(y/n)");
            if (input.next().toLowerCase().equals("y")) {
                break;
            }
        }

        System.out.printf("總和為:%.2f 平均分為:%.2f", total, total / count);
        input.close();
    }
}
