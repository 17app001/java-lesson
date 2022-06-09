package lesson_2;

import java.util.Scanner;

public class TaxiPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入公里數:");
        float km = input.nextFloat();

        int pay = (int) ((km - 1) * 20 + 70);

        System.out.printf("里程數為:%.2f\t費用為:%d元(原始費用:%.2f)", km, pay,
                (km - 1) * 20 + 70);
        input.close();
    }
}
