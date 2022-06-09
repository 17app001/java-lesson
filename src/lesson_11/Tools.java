package lesson_11;

public class Tools {
    public static int div(int x, int y) throws ArithmeticException {
        return x / y;
    }

    public static float round(double number, int point) {
        float result = -1;

        try {
            point = point < 0 ? 0 : point;
            float hundreds = point == 0 ? 1 : (float) Math.pow(10, point);

            result = Math.round(number * hundreds) / hundreds;
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return result;
    }
}
