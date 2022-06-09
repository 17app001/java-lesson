package lesson_1;

public class Bmi {
    public static void main(String[] args) {
        System.out.println("Jerry");
        System.out.println(165);
        System.out.println(59.5);
        System.out.println(165.0 / 100);
        // 需使用浮點數計算(否則只會取整數部分)
        System.out.println(59.5 / ((165.0 / 100) * (165.0 / 100)));
    }
}
