package lesson_8;

public class SimpleCircle {
    double radius;

    SimpleCircle() {

    }

    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public float gePerimeter() {
        return (float) (radius * 2 * Math.PI);
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public static void main(String[] args) {
        SimpleCircle s1 = null;
        SimpleCircle s2 = new SimpleCircle();
        SimpleCircle s3 = new SimpleCircle(5.5);

        // System.out.println(s1.getArea());
        System.out.println(s2.getArea());
        System.out.println(s3.getArea());
        System.out.println(s3.gePerimeter());
    }
}
