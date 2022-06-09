package lesson_3;

public class Test {
    public static void main(String[] args) {
        int i, j;
        i = (j = 3) >> 1;
        System.out.println(i + "," + j);

        int a = 3, b = 5;
        System.out.println(a += b -= 2 - 2);

        System.out.println(a + "," + b);

        System.out.println(-5 % 2);
        i = 3;
        j = 3;
        i = --i + i + j-- + j;
        System.out.println(i + "," + j);
    }
}
