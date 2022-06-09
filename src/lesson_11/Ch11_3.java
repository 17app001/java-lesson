package lesson_11;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ch11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s = new Student();
        System.out.println("請輸入姓名:");
        s.setName(scanner.next());
        double[] scores = new double[Student.SUBJECTS.length];

        // for (int i = 0; i < Student.SUBJECTS.length; i++) {
        // try {
        // System.out.printf("請輸入%s分數:", Student.SUBJECTS[i]);
        // scores[i] = scanner.nextDouble();
        // } catch (InputMismatchException ex) {
        // System.out.println("輸入錯誤..");
        // i--;
        // scanner.next();
        // }
        // }

        int count = 0;
        do {
            try {
                System.out.printf("請輸入%s分數:", Student.SUBJECTS[count]);
                scores[count] = scanner.nextDouble();
                count++;
            } catch (InputMismatchException ex) {
                System.out.println("輸入錯誤..");
                scanner.next();
            }

        } while (count < Student.SUBJECTS.length);

        s.setScores(scores);
        System.out.println(s);
        scanner.close();
    }
}