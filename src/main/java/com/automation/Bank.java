package com.automation;

import java.sql.SQLOutput;

public class Bank {

    static int currentBalance = 1000;

    public static void greetCustomer() {
        System.out.println("Hello, Welcome to the Banking application");

    }

    public void deposit(int amount) {
        currentBalance = currentBalance + amount;
    }

    public void withdrawl(int amount) {
        currentBalance = currentBalance - amount;
    }

    public static int getcurrentBalance() {
        return currentBalance;
    }

    //    deposit
//    withdrawl
//    getcurrentBalance
    public static void main(String[] args) {
        greetCustomer();
        Bank bank = new Bank();
        System.out.println(Bank.getcurrentBalance());
    }

}
