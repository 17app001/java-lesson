package lesson_2;

public class StringFormat {
    public static void main(String[] args) {
        final float PI = 3.1415926f;
        float radius = 5.5f;
        double area = Math.pow(radius, 2) * PI;
        double perimeter = radius * 2 * PI;

        System.out.println("半徑為:" + radius);
        System.out.println("園面積為:" + area);
        System.out.println("圓周長為:" + perimeter);

        System.out.printf("半徑為:%f 圓周長:%.0f 園面積:%6.2f\n",
                radius, perimeter, area);

        float x = 3.3f;
        System.out.println(3.3 == x);
        System.out.printf("%.50f\n", x);

        System.out.println('\u0097');
        System.out.println('\u0098');
        System.out.println('\u0099');

        System.out.println();
    }
}
