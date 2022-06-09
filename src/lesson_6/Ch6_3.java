package lesson_6;

public class Ch6_3 {
    public static final float PI = 3.1415926f;

    public static void main(String[] args) {
        System.out.println(getArea(10.0f));
        System.out.println(getArea(10.0));
    }

    public static int getArea(float radius) {

        return Math.round(radius * radius * PI);
    }

    public static double getArea(double radius) {

        return radius * radius * PI;
    }
}
