package lesson_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import lesson_11.Student;

public class Ch12_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("請輸入姓名:(-1:exit)");
            String name = scanner.next();

            if (name.equals("-1")) {
                break;
            }

            Student student = new Student();
            student.setName(name);

            double[] scores = new double[Student.SUBJECTS.length];
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

            student.setScores(scores);
            students.add(student);
        }

        System.out.printf("共有%d位同學%n", students.size());

        students.forEach(s -> {
            System.out.println(s.getName());
            System.out.println(Student.getAvg(s, 2));
        });

        System.out.println("成績排名如下:");

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return Student.getAvg(o1, 2) == Student.getAvg(o2, 2)
                        ? 0
                        : Student.getAvg(o1, 2) > Student.getAvg(o2, 2) ? 1 : -1;
            }
        });
        // Collections.sort(students);

        students.forEach(s -> {
            System.out.println(s.getName());
            System.out.println(Student.getAvg(s, 2));
        });

        // for (Object object : students.toArray()) {
        // System.out.println(object);
        // }

        // Student[] ss = students.toArray(Student[]::new);
        // System.out.println(ss);
        // students.addAll(Arrays.asList(ss));

        // students.forEach(s -> {
        // System.out.println(s.getName());
        // System.out.println(Student.getAvg(s, 2));
        // });

        // Iterator<Student> iterator = students.iterator();

        // while (iterator.hasNext()) {
        // Student s = iterator.next();
        // System.out.println(s);
        // }

        scanner.close();
    }
}
