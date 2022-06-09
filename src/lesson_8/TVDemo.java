package lesson_8;

import lesson_8.tv.TV;

public class TVDemo {
    public static void main(String[] args) {
        TV tv = new TV(5, 5);
        // tv.turnOn();
        tv.setChannel(1200);
        tv.setVolume(70);
        tv.setBrand("Samsung");

        System.out.printf("%s電視 目前頻道:%d 音量:%d%n",
                tv.getBrand(), tv.getChannel(), tv.getVolumnLevel());

    }
}
