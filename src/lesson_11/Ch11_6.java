package lesson_11;

import lesson_11.atm.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ch11_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM("國泰世華銀行");
        System.out.print("請插卡...");
        // 按任一鍵
        scanner.nextLine();
        // 插卡
        atm.insertCard("A12345678");
        // 目前資訊
        atm.getInfo();
        int choice = -1;
        while (choice != 4) {
            // 選單
            atm.menu();
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        atm.deposit();
                        break;
                    case 2:
                        atm.withdraw();
                        break;
                    case 3:
                        atm.getInfo();
                        break;
                    case 4:
                        atm.close();
                        break;
                    default:
                        System.out.println("輸入選項不正確(1~4)");
                }

                pressAnyKeyToContinue();

            } catch (InputMismatchException ex) {
                System.out.println("輸入選項不正確.");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static void pressAnyKeyToContinue() {
        System.out.println("請按任一鍵...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
}
