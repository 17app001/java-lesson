package lesson_2;

public class CharTest {
    public static void main(String[] args) {
        char a = '1';
        char b = 1;
        char c = 65;
        char d = '\n';
        boolean e = false;
        boolean f = true;

        System.out.println(a);
        System.out.println(a + b);
        System.out.println(c);
        System.out.print(d);
        System.out.println((int) c);
        System.out.println(e + "," + f);
        System.out.println(a == 49);
        System.out.println('\u0046');
        System.out.println('\101');
        System.out.println(10);
        System.out.println(0b1010);
        System.out.println(0x000a);
        System.out.println(0012);
    }
}
