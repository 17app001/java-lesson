package lesson_4;

import java.util.Scanner;

public class CheckHasNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("請輸入整數:");
        while (!input.hasNextInt()) {
            System.out.println("輸入錯誤!");
            // 清除輸入
            input.next();
        }
        int number = input.nextInt();
        System.out.printf("你輸入的是:%d", number);
        input.close();
    }
}
