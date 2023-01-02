package com.company;


//supports those privileged account holders to withdraw amount more than there balance
public class PrivilegeBankServices implements BankServices{
    @Override
    public void credit(AnonymousBankAccount account, int amount) {
        account.setBalance(account.getBalance()+amount);
        System.out.println(account);
    }

    @Override
    public void debit(AnonymousBankAccount account, int amount) {
            account.setBalance(account.getBalance()-amount);
            System.out.println(account);
    }
}
