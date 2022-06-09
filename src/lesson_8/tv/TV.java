package lesson_8.tv;

public class TV {
    final int MAX_CHANNEL = 120;
    final int MAX_VOLUME = 7;

    private int channel;
    private int volumeLevel;
    private boolean on;
    private String brand;

    public TV() {
        on = false;
        channel = 1;
        volumeLevel = 1;
        brand = "Sony";
    }

    public TV(int channel, int volumeLevel) {
        this();
        turnOn();
        setChannel(channel);
        setVolume(volumeLevel);
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumnLevel() {
        return volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        on = true;
        System.out.println("電視已經開機");
    }

    public void turnOff() {
        on = false;
        System.out.println("電視已經關機");
    }

    public void setChannel(int channel) {
        if (on && channel >= 0 && channel <= MAX_CHANNEL) {
            this.channel = channel;
        }
    }

    public void setVolume(int volumeLevel) {
        if (on && volumeLevel >= 0 && volumeLevel <= MAX_VOLUME) {
            this.volumeLevel = volumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < MAX_CHANNEL) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 0) {
            channel--;
        }
    }

    public void volumeUp() {
        if (on && volumeLevel < MAX_VOLUME) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 0) {
            volumeLevel--;
        }
    }

}
