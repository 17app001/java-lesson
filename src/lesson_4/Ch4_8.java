package lesson_4;

public class Ch4_8 {
    public static void main(String[] args) {
        System.out.println("九九乘法表");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%-2dx %-2d=%2d|",
                        j, i, i * j);
            }
            System.out.println();
        }
    }
}
