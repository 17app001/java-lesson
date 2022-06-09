package lesson_3;

public class Ch3_6 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        if (a > 1 && b++ >= 0) {
            System.out.println("1");
        }

        System.out.printf("a=%d,b=%d\n", a, b);

        if (a > 1 & b++ >= 0) {
            System.out.println("2");
        }

        System.out.printf("a=%d,b=%d\n", a, b);

        if (a == 0 || b++ >= 0) {
            System.out.println(a + "," + b);
        }

        if (a == 0 | b++ >= 0) {
            System.out.println(a + "," + b);
        }
    }
}
