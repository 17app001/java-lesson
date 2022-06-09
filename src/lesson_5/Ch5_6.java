package lesson_5;

import java.util.Arrays;

public class Ch5_6 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        System.out.println(a);
        int[] b = a;
        System.out.println(b);
        System.out.println(a == b);

        // 同記憶體位置修改
        a[0] = 10;
        System.out.println(a[0] + "," + b[0]);
        // 進行釋放
        a = null;
        System.out.println(a + "," + b);

        a = new int[b.length];
        // 完整複製方式
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }

        // 記憶體位置
        System.out.println(a == b);
        boolean equal = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                equal = false;
            }
        }
        System.out.println(equal ? "兩個相等" : "不相等");
        a[0] = 30;
        System.out.println(Arrays.equals(a, b) ? "兩個相等" : "不相等");
    }
}
