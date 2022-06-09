package lesson_11;

import java.util.Scanner;

public class Ch11_1 {
    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5 };
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(10 / 0);
        System.out.println(n[n.length]);
        input.close();
    }
}
