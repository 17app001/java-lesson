package lesson_2;

import java.util.Scanner;

public class BmiCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入姓名:");
        String name = input.nextLine();
        System.out.println("請輸入身高:");
        double height = input.nextDouble();
        System.out.println("請輸入體重:");
        float weight = input.nextFloat();

        double bmi = weight / Math.pow(height / 100, 2);

        System.out.printf("姓名:%s 身高為:%.2f 體重為%.2f bmi:%.2f",
                name,
                height,
                weight,
                bmi);

        input.close();
    }
}
