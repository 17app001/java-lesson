package lesson_6;

import java.util.Arrays;

public class Ch6_4 {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40 };
        int[] b = new int[a.length];

        System.arraycopy(a, 0, b, 0, a.length);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println(a == b);
        System.out.println(a + "," + b);

        int[] c = a;
        System.out.println(a == c);
        System.out.println(a + "," + c);

        a[0] = 11;
        System.out.println(Arrays.toString(c));

        c = copy(a);
        System.out.println(c == a);

        c = reverse(a);
        System.out.println(Arrays.toString(c));

        System.out.println(sum(1, 2, 3, 4, 5, 6));

        System.out.println(max(10, 20));
        System.out.println(max(10, new int[] { 10, 11, 12, 13, 14, 15 }));
        System.out.println(max(10, 1, 2, 3, 4, 5));
    }

    public static int[] copy(int[] source) {
        int[] dest = new int[source.length];
        int count = 0;
        for (int i : source) {
            dest[count++] = i;
        }

        return dest;
    }

    public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        int count = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[count++] = a[i];
        }

        for (int i = 0, j = a.length - 1; i < b.length; i++) {
            b[i] = a[j--];
        }

        return b;
    }

    public static double sum(double... nums) {
        System.out.println(Arrays.toString(nums));
        double total = 0;
        for (double i : nums) {
            total += i;
        }

        return total;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    // public static int max(int a, int[] b) {
    // int bigger = a;
    // for (int i : b) {
    // if (i > bigger) {
    // bigger = i;
    // }
    // }

    // return bigger;
    // }

    public static int max(int a, int... b) {
        int bigger = a;
        for (int i : b) {
            if (i > bigger) {
                bigger = i;
            }
        }

        return bigger;
    }

    public static int getSum(int... nums) {
        int total = 0, start = 0, stop = 0, step = 1;
        int size = nums.length;

        if (size == 1) {
            stop = nums[0];
        } else if (size == 2) {
            start = nums[0];
            stop = nums[1];
        } else {
            start = nums[0];
            stop = nums[1];
            step = nums[2];
        }

        for (int i = start; i <= stop; i += step) {
            total += i;
        }

        return total;
    }
}
