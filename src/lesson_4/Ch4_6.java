package lesson_4;

import java.util.Scanner;

public class Ch4_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int price = 250;

        System.out.println("欣欣大戲院");
        System.out.println("全票一張:" + price);
        System.out.print("請選擇票種:(1)全票(2)優待票(3)敬老票(4)早場票:");
        int choice = input.nextInt();
        double pay = 0;
        boolean error = false;

        switch (choice) {
            case 1:
                pay = price;
                break;
            case 2:
                pay = price * 0.85;
                break;
            case 3:

            case 4:
                pay = price * 0.85 * 0.8;
                break;
            default:
                error = true;
        }

        if (error) {
            System.out.println("選擇錯誤!");
        } else {
            System.out.printf("你選擇%d 票價為:%d元", choice, (int) pay);
        }

        input.close();

    }
}
