package lesson_11;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    public static final String[] SUBJECTS = { "國文", "英文", "數學" };
    String name;
    double[] scores;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getScores() {
        return this.scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return String.format("name:%s scores=%s", name, Arrays.toString(scores));
    }

    public static float getAvg(Student s, int point) {
        double total = 0;
        for (double score : s.getScores()) {
            total += score;
        }

        return Tools.round((total / s.getScores().length), point);
    }

    @Override
    public int compareTo(Student o) {
        return getAvg(this, 2) == getAvg(o, 2)
                ? 0
                : getAvg(this, 2) > getAvg(o, 2) ? 1 : -1;
    }
}
