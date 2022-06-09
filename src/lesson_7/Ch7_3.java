package lesson_7;

public class Ch7_3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append("123");
        System.out.println(sb.toString());

        boolean inState = false;
        int tuition = 5000;
        if (!inState) {
            tuition = 15000;
        }
        System.out.println("The tuition is " + tuition);

    }
}
