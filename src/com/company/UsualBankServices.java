package com.company;

public class UsualBankServices implements BankServices {
     @Override
     public void credit(AnonymousBankAccount account, int amount){
         account.setBalance(account.getBalance()+amount);
         System.out.println(account);
     }

     @Override
     public void debit(AnonymousBankAccount account, int amount){
         if(account.getBalance()-amount>0){
             account.setBalance(account.getBalance()-amount);
             System.out.println(account);
         }

     }
}
