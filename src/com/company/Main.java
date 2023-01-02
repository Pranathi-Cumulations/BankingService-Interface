package com.company;

public class Main {

    public static void main(String[] args) {
        AnonymousBankAccount bankAccount =
                new AnonymousBankAccount("Pranathi",1234567,1000);
        UsualBankServices bankService = new UsualBankServices();
        bankService.credit(bankAccount,1000);
        bankService.debit(bankAccount,200);


        PrivilegeBankServices privilegeBankService = new PrivilegeBankServices();
        privilegeBankService.debit(bankAccount,2000);


    }
}
