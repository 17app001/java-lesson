package lesson_9;

import java.util.Random;

class Monster {
    // 玩家還是敵方
    public static final int PLAYER = 0;
    public static final int COMPUTER = 1;
    // 共用亂數物件
    static Random rand = new Random();

    // 敵我雙方
    int type;
    // 姓名
    String name;
    // 血量/魔法/攻擊力/閃避
    int hp, mp, ap, dp;
    // 是否存活
    boolean alive;

    Monster(int type) {
        this.type = type;
        name = "一般神奇寶貝";
        hp = 3 + rand.nextInt(4);
        mp = 2;
        ap = 1 + rand.nextInt(3);
        dp = 1 + rand.nextInt(2);
        alive = true;
    }

    int getAp() {
        return ap;
    }

    String getName() {
        if (type == PLAYER) {
            return "(玩家)" + name;
        }

        return "(電腦)" + name;
    }

    // 被攻擊
    void beAttack(int ap) {
        // 閃避值
        if (rand.nextInt(dp) != 0) {
            System.out.printf("==>%s 閃避成功!%n", getName());
            return;
        }
        // 紀錄目前HP
        int tempHp = hp;
        hp -= ap;
        if (hp <= 0) {
            hp = 0;
            alive = false;
            System.out.printf("==>%s hp=%d 受到%d攻擊 死亡 (hp=>%d)%n", getName(), tempHp, ap, hp);
        } else {
            System.out.printf("==>%s 受到%d攻擊 (%d=>%d)%n", getName(), ap, tempHp, hp);
        }
    }

    // 取得資訊
    void getInfo() {
        System.out.printf("%s hp=%d mp=%d ap=%d dp=%d%n",
                getName(), hp, mp, ap, dp);
    }
}
