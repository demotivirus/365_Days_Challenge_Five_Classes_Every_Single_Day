package com.demotivirus.Day_015;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        User user = new User("Mikel", new Money(65000));
        User user1 = new User("Kim", new Money(87744.3));

        bank.addUserAmount(user);
        bank.addUserAmount(user1);
        System.out.println(bank.getUser_amounts());

        bank.addMoneyToAmount(user, 5000);
        System.out.println(bank);
    }
}
