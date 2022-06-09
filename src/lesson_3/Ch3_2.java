
package lesson_3;

public class Ch3_2 {
    public static void main(String[] args) {
        int a = 0;
        int b = ++a;
        int c = a++;
        System.out.printf("a=%d,b=%d,c=%d\n", a, b, c);
        // a = a + 5;
        // c = c + a;
        // System.out.println(a + "," + c);
        c += a += 5;
        System.out.println(a + "," + c);
        c += b++ + a++;
        System.out.printf("%d,%d,%d", c, b, a);
    }
}
