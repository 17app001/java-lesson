package lesson_13;

import java.util.*;
import java.util.Scanner;

public class Ch13_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入文字:");
        String word = input.nextLine();

        String[] words = word.split(" ");
        System.out.println(words);
        Set<String> set = new HashSet<String>();
        for (String w : words) {
            set.add(w);
        }

        System.out.println(set.size() + "\n" + set + "\n" + set.toArray());
        input.close();
    }

}
