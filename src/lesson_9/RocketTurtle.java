package lesson_9;

public class RocketTurtle extends Monster {
    RocketTurtle(int type) {
        super(type);

        hp += 5;
        ap += 5;
        dp += 3;
        name = "火箭龜";
        System.out.println(getName() + "抽中.");
    }

    int ap() {
        System.out.println("火箭攻擊!");
        return ap;
    }
}