package lesson_3;

public class Timer {
    public static void main(String[] args) {
        long second = 3600 * 24;
        int minute = 0, hour = 0;

        minute = (int) (second / 60);
        hour = minute / 60;
        // 剩下的秒數跟分鐘數
        int lefSecond = (int) (second % 60);
        minute = minute % 60;

        System.out.printf("%d秒是%d小時:%d分:%d秒",
                second, hour, minute, lefSecond);
    }
}
