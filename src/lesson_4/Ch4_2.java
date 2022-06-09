package lesson_4;

import java.util.Scanner;

public class Ch4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入分數:");
        int score = input.nextInt();

        if (score == 100) {
            System.out.println("A+");
        } else if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("E");
        }

        input.close();
    }
}
