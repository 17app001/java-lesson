package lesson_2;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "\nabc";
        String str3 = new String("ABC");

        System.out.println(str1 + str2);
        System.out.println(str1 == "ABC");
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());

        String a = new String("Jerry");
        String b = a;
        String c = "Jerry";
        String d = "Jerry";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(c == d);
    }

}
