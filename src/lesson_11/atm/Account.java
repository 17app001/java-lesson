package lesson_11.atm;

public class Account {
    private int balance;
    private String number;

    public Account(String number) {
        this.number = number;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // 存錢
    public void deposit(int amount) throws CheckAmountException {
        if (amount <= 0) {
            throw new CheckAmountException(amount);
        }

        balance += amount;
    }

    public void withdraw(int amount) throws WithDrawException, CheckAmountException {
        if (amount <= 0) {
            throw new CheckAmountException(amount);
        }

        if (amount > balance) {
            throw new WithDrawException(amount);
        }

        balance -= amount;
        System.out.println("提領==>" + amount);
    }

    @Override
    public String toString() {
        return String.format("帳號:%s 餘額:%d", number, balance);
    }

}