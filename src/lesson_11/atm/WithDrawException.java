package lesson_11.atm;

public class WithDrawException extends Exception {
    private int amount;

    WithDrawException(int amount) {
        super("餘額不足!");
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}