package lesson_4;

import java.util.Scanner;

public class Ch4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int total = 0;
        boolean go = true;

        while (go) {
            System.out.print("請輸入分數:");
            score = input.nextInt();
            total += score;

            System.out.printf("是否繼續?(y/n)");
            go = input.next().equals("y") ? true : false;
        }

        System.out.println("總和為:" + total);
        input.close();
    }
}
