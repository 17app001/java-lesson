package lesson_4;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            System.out.println("請輸入數字:");
            int number = input.nextInt();
            short count = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }

                if (count > 2) {
                    break;
                }
            }

            if (count == 2) {
                System.out.printf("%d 是質數%n", number);
            } else {
                System.out.printf("%d 不是質數%n", number);
            }
        }

        input.close();
    }
}
