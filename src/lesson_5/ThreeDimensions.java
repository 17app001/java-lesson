package lesson_5;

public class ThreeDimensions {
    public static void main(String[] args) {
        String[] names = { "Jerry", "Mary", "Kevin" };

        double[][][] students = {
                // 三個學生 三個學期 三個分數
                { { 100, 87, 66 }, { 78, 65, 65 }, { 99, 99, 99 } },
                { { 88, 86, 56 }, { 100, 99, 78 }, { 66, 77, 89 } },
                { { 100, 100, 87 }, { 65, 65, 65 }, { 78, 56, 77 } },
        };

        double[] avgs = new double[names.length];
        double highAvg = 0;
        for (int i = 0; i < names.length; i++) {
            System.out.println("====================================");
            System.out.println(names[i]);
            System.out.println("====================================");
            // 學期
            double totalAvg = 0;
            for (int j = 0; j < students[i].length; j++) {
                System.out.printf("第%d個學期==>%n", j + 1);
                double total = 0, avg = 0;
                for (int k = 0; k < students[i][j].length; k++) {
                    total += students[i][j][k];
                    System.out.println(students[i][j][k]);
                }
                avg += total / students[i][j].length;
                totalAvg += avg;
                System.out.printf("總分%.2f 平均分:%.2f%n", total, avg);
            }
            System.out.println("------------------------------------");
            System.out.printf("總平均為:%.2f%n", totalAvg / students[i].length);
            avgs[i] = totalAvg / students[i].length;
            // 紀錄目前最高平均分
            if (avgs[i] > highAvg) {
                highAvg = avgs[i];
            }
        }

        System.out.println();
        for (int i = 0; i < avgs.length; i++) {
            if (avgs[i] == highAvg) {
                System.out.printf("第一名是%s 平均分為:%.2f", names[i], avgs[i]);
                break;
            }
        }
    }
}
