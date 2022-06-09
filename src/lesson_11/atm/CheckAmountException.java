package lesson_11.atm;

public class CheckAmountException extends Exception {
    private double amount;

    CheckAmountException(int amount) {
        super("金額不正確");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
