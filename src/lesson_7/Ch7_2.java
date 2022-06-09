package lesson_7;

import java.util.Arrays;

public class Ch7_2 {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(x);

        Integer x1 = x;
        System.out.println(x1.doubleValue());
        System.out.println(x1.compareTo(x));
        System.out.println(x1.toString());

        String s1 = "123";
        int x2 = Integer.valueOf(s1);
        System.out.println(x2);

        Double x3 = Double.valueOf("123.5");
        System.out.println(x3);

        double x4 = Double.parseDouble("123.5");
        System.out.println(x4);

        float[] a = { 1, 2, 3, 4, 5 };
        float[] b = { 1, 2, 3, 4, 5 };
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(Arrays.equals(a, b));

    }
}
