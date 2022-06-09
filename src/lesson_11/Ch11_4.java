package lesson_11;

public class Ch11_4 {
    public static void main(String[] args) {
        try {
            System.out.println(Tools.div(10, 0));
        } catch (ArithmeticException ex) {
            System.out.println("麻煩檢查一下數字歐!!");
        }

        System.out.println("計算結束!");
    }

}
