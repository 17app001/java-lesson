package lesson_6;

public class Ch6_1 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        if (args.length >= 2) {
            sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } else {
            sum(10, 20);
        }
    }

    public static void sum(int x, int y) {
        int total = x + y;
        System.out.println("總合為:" + total);
    }
}
