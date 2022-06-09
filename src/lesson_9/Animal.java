package lesson_9;

public class Animal {
    String name;
    double weight;

    public Animal() {
        System.out.println("i am animal!");
    }

    public Animal(String name, double weight) {
        this();
        this.name = name;
        this.weight = weight;
    }
}
