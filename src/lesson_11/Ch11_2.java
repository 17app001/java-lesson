package lesson_11;

import java.util.Scanner;

public class Ch11_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("請輸入被除數:");
            int num1 = in.nextInt();
            System.out.print("請輸入除數:");
            int num2 = in.nextInt();

            System.out.printf("%d / %d 結果為 %d", num1, num2, num1 / num2);
        } catch (java.util.InputMismatchException ex) {
            System.out.println(ex);
        } catch (java.lang.ArithmeticException ex) {
            System.out.println(ex);
        } finally {
            in.close();
        }

        System.out.println("程式執行完畢!");
    }
}
