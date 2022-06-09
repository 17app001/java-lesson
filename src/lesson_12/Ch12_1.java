package lesson_12;

import java.util.ArrayList;

public class Ch12_1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Jerry");
        names.add("Mary");
        names.add("Kevin");
        names.add("Tom");
        System.out.println(names.size());
        System.out.println(names.get(0));

        System.out.println("---------------------------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("---------------------------");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("---------------------------");
        names.forEach(name -> System.out.println(name));

    }

}