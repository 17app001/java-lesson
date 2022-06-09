package lesson_7;

public class Ch7_1 {
    public static void main(String[] args) {
        String s1 = "Java!";
        String s2 = "Java!";
        System.out.println(s1 == s2);

        String s3 = new String("Java!");
        System.out.println(s1 == s3);

        String s4 = new String(s1.toCharArray());
        System.out.println(s1 == s4);

        for (char c : s4.toCharArray()) {
            System.out.println(c);
        }

        for (int i = 0; i < s4.length(); i++) {
            System.out.println(s4.charAt(i));
        }

        String s5 = " 123 ";
        if (s5.isEmpty()) {
            System.out.println("s5 is empty!");
        } else {
            System.out.println(s5.trim());
        }

    }
}
