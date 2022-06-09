package lesson_5;

import java.util.Random;

class RandomDemo {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10) + 1);
        System.out.println((int) (Math.random() * (100 - 10 + 1)) + 1);

        int[][] lotto = new int[5][6];
        Random random = new Random();
        // 樂透號碼
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto[i].length; j++) {
                // lotto[i][j] = (int) (Math.random() * 49) + 1;
                lotto[i][j] = random.nextInt(49) + 1;
            }
        }

        for (int[] i : lotto) {
            for (int j : i) {
                System.out.printf("%2d|", j);
            }
            System.out.println();
        }
    }
}