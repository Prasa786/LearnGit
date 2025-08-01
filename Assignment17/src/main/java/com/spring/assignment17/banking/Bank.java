package com.spring.assignment17.banking;

public class Bank {
	private int balance;
    private String pin;
    private String accountHolderName;
    private String accountNumber;
    private String bankName;
    public Bank() {}
    public Bank(int initialBalance, String pin, String 
    		accountHolderName, String accountNumber, 
    		String bankName) {
        this.balance = initialBalance;
        this.pin = pin; 
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public void deposit(int amount, String enteredPin) {
        if (pin.equals(enteredPin)) {
            balance += amount;
            System.out.println("Ammount Credited.\tBalance: " + balance);
        } else {
            System.out.println("Invalid PIN.");
        }
    }

    public void withdraw(int amount, String enteredPin) {
        if (pin.equals(enteredPin)) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Ammount Debited.\tBalance: " + balance);
            } else {
                System.out.println("Insufficient Balance.");
            }
        } else {
            System.out.println("Invalid PIN.");
        }
    }

    public void changePin(String oldPin, String newPin) {
        if (pin.equals(oldPin)) {
            if (newPin.length() == 4) {
                pin = newPin;
                System.out.println("PIN changed successfuly!!!");
            } else {
                System.out.println("New PIN must be 4 digits.");
            }
        } else {
            System.out.println("Invalid old PIN.");
        }
    }

    public void showBalance(String enteredPin) {
        if (pin.equals(enteredPin)) {
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid PIN.");
        }
    }
}
