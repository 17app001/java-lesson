package lesson_11.atm;

import java.util.Scanner;

public class ATM {
    private String name;
    private Account account;

    private Scanner scanner;

    public ATM(String name) {
        this.name = name;
        System.out.println(toString());
    }

    public void insertCard(String number) {
        account = new Account(number);
        System.out.println("插卡成功!");
        scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("請選擇功能");
        System.out.println("[1]存錢");
        System.out.println("[2]領錢");
        System.out.println("[3]餘額");
        System.out.println("[4]離開");
    }

    // 存錢
    public void deposit() {
        System.out.printf("請輸入存錢金額:");
        try {
            int amount = scanner.nextInt();

            try {
                account.deposit(amount);
                System.out.println("存錢成功!");
                System.out.println(account);

            } catch (CheckAmountException e) {
                System.out.println(e.getMessage());
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("金額輸入不正確");
        }
    }

    public void withdraw() {
        System.out.printf("請輸入領錢金額:");
        try {
            int amount = scanner.nextInt();
            try {
                account.withdraw(amount);
                System.out.println("領錢成功!");
                System.out.println(account);
            } catch (WithDrawException | CheckAmountException e) {
                System.out.println(e.getMessage());

            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("金額輸入不正確");
        }
    }

    public void getInfo() {
        if (account != null) {
            System.out.println(account.toString());
            return;
        }

        System.out.println("尚未插卡..");
    }

    public void close() {
        account = null;
        scanner.close();
        System.out.println("感謝您的使用..");
    }

    @Override
    public String toString() {
        return String.format("歡迎使用(%s)ATM櫃員機", name);
    }

}
