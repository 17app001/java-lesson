package lesson_2;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入資料");
        System.out.println("請輸入姓名");
        String name1 = input.next();
        System.out.println("請輸入分數");
        float score1 = input.nextFloat();
        System.out.println("請輸入姓名");
        String name2 = input.next();
        System.out.println("請輸入分數");
        float score2 = input.nextFloat();
        System.out.println("請輸入姓名");
        String name3 = input.next();
        System.out.println("請輸入分數");
        float score3 = input.nextFloat();

        System.out.printf("%-10s%.2f\n", name1, score1);
        System.out.printf("%-10s%.2f\n", name2, score2);
        System.out.printf("%-10s%.2f\n", name3, score3);

        double total = score1 + score2 + score3;

        System.out.printf("總分為: %d分\n平均分為: %6.2f", (int) total, total / 3);

        input.close();
    }
}
