package lesson_9;

public class Rabbit extends Animal {
    public Rabbit() {
        System.out.println("i am rabbit!");
    }

    public Rabbit(String name, double weight) {
        // super(name, weight);
        System.out.println("my name is " + name);
        System.out.println(this.name);
    }
}
