package lesson_4;

public class Ch4_7 {
    public static void main(String[] args) {
        int i, j, total = 0;
        boolean count = true;

        for (i = 0, j = 0; count && i <= 100; i++, j += 2) {
            total += i;
            System.out.println(i);
        }

        System.out.println(total);
        System.out.println(i + "," + j);

    }
}
