package com.example.bank.Models;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CheckingAccount extends Account{
    private final IntegerProperty transactionLimit;

    private CheckingAccount(String owner, String accountNumber, double balance, int tlimit) {
        super(owner, accountNumber, balance);
        transactionLimit = new SimpleIntegerProperty(this, "Transaction Limit", tlimit);
    }

    public IntegerProperty TransactionLimitProp(){return transactionLimit;}
}
