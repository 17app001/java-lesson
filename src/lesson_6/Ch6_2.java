package lesson_6;

public class Ch6_2 {
    public static void main(String[] args) {
        int x = getSum(1, 100, 2);
        System.out.printf("x總合為:%d\n", x);
        // int y = getSum(1, 100, 2);
        // System.out.printf("y總合為:%d\n", y);
        // System.out.printf("x+y總合為:%d", x + y);
    }

    static int getSum(int start, int end, int step) {
        int total = 0;
        if (start > end) {
            System.out.println("數值錯誤..");
            return -1;
        }

        int i = start;
        // 包含終止值
        for (; i <= end; i += step) {
            total += i;
        }

        System.out.println(i);

        return total;
    }
}
