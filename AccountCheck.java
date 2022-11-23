package com.bridgelabz.shahazad.oops;

import java.util.Scanner;

public class AccountCheck {

    public static void main(String[] args) {
        System.out.println("Enter the balance to mention in the account: ");
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(scanner.nextDouble());
        account.debit(account.balance);
    }
}
class Account {

    Scanner sc = new Scanner(System.in);
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void debit(double balance) {
        System.out.println("Enter amount for withdrawal: ");
        double withdraw = sc.nextDouble();
        if (withdraw > balance)
            System.out.println("Withdraw exceeding  the balance please enter the  correct amount");
        else
            balance = balance - withdraw;
        System.out.println("Remaining balance is: " + balance);

    }
}