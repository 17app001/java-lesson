package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 參考資料
// https://iter01.com/561902.
// Scanner & BufferedReader差別

public class InputTest {
    public static void main(String[] args) {

        System.out.println("Scanner");
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入姓名:");
        String name = scanner.nextLine();
        System.out.println("請輸入年齡:");
        int age = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("請輸入年齡:");
            scanner.next();
        }

        age = scanner.nextInt();
        System.out.printf("姓名為:%s 年齡為:%d%n", name, age);

        System.out.println("BufferedReader");
        // 使用BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("請輸入姓名:");
            name = br.readLine();
            while (true) {
                try {
                    System.out.println("請輸入年齡:");
                    age = Integer.parseInt(br.readLine());
                    System.out.printf("姓名為:%s 年齡為:%d", name, age);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("請輸入正確數字!");
                }
            }

            br.close();

        } catch (IOException ex) {
            System.out.println(ex);

        }

        scanner.close();
    }

}
