package lesson_9;

public class FireDragon extends Monster {

    FireDragon(int type) {
        super(type);
        hp += 10;
        ap += 10;
        dp += 1;

        name = "小火龍";
        System.out.println(getName() + "抽中.");
    }

    int ap() {
        System.out.println("噴火攻擊!");
        return ap;
    }
}
