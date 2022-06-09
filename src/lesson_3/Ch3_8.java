package lesson_3;

public class Ch3_8 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 0;

        if (a > b) {
            c = a + b;
        } else {
            c = a - b;
        }

        System.out.println(c);

        c = a > b ? a + b : a - b;
    }
}
