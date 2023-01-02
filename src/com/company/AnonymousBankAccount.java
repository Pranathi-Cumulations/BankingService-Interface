package com.company;

public class AnonymousBankAccount {
    private String userName;
    private long contactNumber;
    private int balance;

    AnonymousBankAccount(String userName , long contactNumber , int initialDeposit){
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.balance = initialDeposit;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AnonymousBankAccount{" +
                "userName='" + userName + '\'' +
                ", contactNumber=" + contactNumber +
                ", balance=" + balance +
                '}';
    }
}
