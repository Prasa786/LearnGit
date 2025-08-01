package com.spring.assignment17.banking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Bank bank = context.getBean(Bank.class);

            bank.deposit(1000, "456");
            bank.withdraw(1000, "456");
            bank.changePin("456", "5678");
            bank.showBalance("5678");
        }
    }
}

