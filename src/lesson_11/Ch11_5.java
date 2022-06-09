package lesson_11;

import lesson_11.atm.*;

public class Ch11_5 {
    public static void main(String[] args) {
        Account account = new Account("A12345678");
        System.out.println(account);

        try {
            account.deposit(100);
            account.withdraw(99);
            account.deposit(-1);

        } catch (WithDrawException ex) {
            System.out.println(ex.getMessage());
            System.out.println("帳戶金額為:" + account.getBalance());
            System.out.println("提領金額為:" + ex.getAmount());
            System.out.println("不足金額為:" + (ex.getAmount() - account.getBalance()));
        } catch (CheckAmountException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println(account);
        }

    }
}
