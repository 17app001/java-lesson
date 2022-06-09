package lesson_3;

import java.util.Scanner;

public class TimerEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入秒數:");
        long second = input.nextLong();

        int minute = 0, hour = 0, day = 0;

        minute = (int) (second / 60);
        hour = minute / 60;
        // 剩下的秒數跟分鐘數
        int lefSecond = (int) (second % 60);
        minute = minute % 60;

        day = hour / 24;
        hour = hour % 24;

        System.out.printf("%d秒是%d天:%d小時:%d分:%d秒",
                second, day, hour, minute, lefSecond);

        input.close();
    }
}
