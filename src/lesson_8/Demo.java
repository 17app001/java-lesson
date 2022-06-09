package lesson_8;

import lesson_8.tv.TV;

public class Demo {
    int x = 25;
    TV v1;
    TV v2 = new TV();
    TV v3 = new TV(100, 5);

    void compare() {
        v1 = v2;
        v2 = v3;
        v3 = new TV();
        System.out.println(v1 + "," + v2 + "," + v3);
    }

    Demo() {
        int x = 1;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        // demo.compare();

        {
            int x = 5;
            System.out.println(x);
        }
        {
            int x = 50;
        }

        int x = 100;
        System.out.println(x);
        System.out.println(demo.x);
    }
}

// 1,5,100,25
