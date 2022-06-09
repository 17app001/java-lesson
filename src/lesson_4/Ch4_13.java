package lesson_4;

public class Ch4_13 {
    public static void main(String[] args) {
        int i = 0;
        A: {

            for (i = 0; i < 10; i++) {
                if (i == 5)
                    break A;
            }
        }

        System.out.println(i);
    }
}
