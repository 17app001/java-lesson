package lesson_12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lesson_11.Student;

public class Ch12_3 {
    public static void main(String[] args) {
        Map<Integer, Student> datas = new HashMap<>();

        datas.put(1, new Student("Jerry"));
        datas.put(2, new Student("Mary"));
        datas.put(3, new Student("Kevin"));

        System.out.println(datas);

        System.out.println(datas.get(1));

        System.out.println(datas.keySet());

        for (Object key : datas.keySet().toArray()) {
            System.out.println(datas.get(key));
        }

        Iterator iterator = datas.values().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(datas.isEmpty());

    }
}
