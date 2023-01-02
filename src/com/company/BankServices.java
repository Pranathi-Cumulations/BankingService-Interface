package com.company;

public interface BankServices {
    void credit(AnonymousBankAccount account, int amount);

    void debit(AnonymousBankAccount account, int amount);
}
