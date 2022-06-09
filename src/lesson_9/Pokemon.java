package lesson_9;

import java.util.Scanner;
import java.util.Random;

class Pokemon {
    final int MONSTER_NUM = 15;
    Monster[] player;
    Monster[] computer;

    static Random rand = new Random();

    Pokemon() {
        System.out.println("歡迎來到神奇寶貝戰鬥場");
        player = new Monster[MONSTER_NUM];
        computer = new Monster[MONSTER_NUM];
    }

    public static Random getRand() {
        return rand;
    }

    Monster getSpecialMonster(int type) {
        // 1/3 (0,1,2)
        if (rand.nextInt(3) == 1) {
            return new FireDragon(type);
        }

        return new RocketTurtle(type);
    }

    void getCard() {
        System.out.println("開始抽卡...");

        for (int i = 0; i < MONSTER_NUM; i++) {
            player[i] = rand.nextInt(3) == 1 ? getSpecialMonster(Monster.PLAYER) : new Monster(Monster.PLAYER);
            computer[i] = rand.nextInt(3) == 1 ? getSpecialMonster(Monster.COMPUTER) : new Monster(Monster.COMPUTER);
        }

        System.out.println("抽卡完畢");
    }

    void getInfo() {
        System.out.println("玩家卡牌");
        int power = 0;

        for (Monster m : player) {
            m.getInfo();
            power += (m.hp + m.mp + m.ap + m.dp);
        }

        System.out.println("玩家總戰力:" + power);

        System.out.println("電腦卡牌");
        power = 0;
        for (Monster m : computer) {
            m.getInfo();
            power += (m.hp + m.mp + m.ap + m.dp);
        }

        System.out.println("電腦總戰力:" + power);
    }

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        pokemon.getCard();
        pokemon.getInfo();

        // pokemon.fight();

        Scanner input = new Scanner(System.in);
        System.out.print("是否開始戰鬥?(y/n)");
        if (input.next().toLowerCase().equals("y")) {
            pokemon.fight();
        }

        input.close();
    }

    void fight() {
        System.out.println("開始戰鬥！");
        boolean gameOver = false;
        int playerIndex = 0;
        int computerIndex = 0;
        // 取得第一隻角色
        Monster p = player[playerIndex];
        Monster c = computer[computerIndex];

        while (!gameOver) {
            while (p.alive) {
                System.out.println(p.getName() + "進行攻擊");
                // 電腦受到打擊
                c.beAttack(p.ap);
                // 電腦進行反擊
                if (c.alive) {
                    System.out.println(c.getName() + "進行反擊");
                    p.beAttack(c.ap);
                } else {
                    // 如果已經沒有敵人
                    if (++computerIndex >= computer.length) {
                        gameOver = true;
                        break;
                    }
                    // 下一位敵人
                    c = computer[computerIndex];
                }
            }

            if (!gameOver && !p.alive) {
                if (++playerIndex >= player.length) {
                    gameOver = true;
                    break;
                }
                p = player[playerIndex];
            }
        }

        System.out.println("遊戲結束");
        if (playerIndex >= player.length) {
            System.out.println("電腦勝利!");
        } else {
            System.out.println("玩家勝利!");
        }
    }
}