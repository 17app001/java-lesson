package lesson_3;

import java.util.Scanner;

public class Ch3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("請輸入兩個數字(空白區隔)");
        int a = in.nextInt(), b = in.nextInt();

        boolean c = a > b;
        if (c) {
            System.out.printf("a=%d b=%d 數字%d比較大", a, b, a);
        } else {
            System.out.printf("a=%d b=%d 數字%d比較小", a, b, a);

        }

        in.close();
    }
}
