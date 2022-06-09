package lesson_5;

public class Ch5_4 {
    public static void main(String[] args) {
        int[][] scores = {
                { 100, 99, 88 },
                { 77, 88, 65 },
                { 67, 89, 67 },
                { 99, 99, 66 },
        };

        System.out.println(scores.length);
        System.out.println(scores[0].length);
        System.out.println(scores[scores.length - 1][scores[scores.length - 1].length - 1]);

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + ",");
            }
            System.out.println();
        }

    }
}
