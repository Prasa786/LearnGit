package com.spring.assignment17.banking;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.assignment17.banking")
public class AppConfig {

    @Bean
    public Bank bank() {
        Bank bank = new Bank();
        bank.setBalance(1000);
        bank.setPin("456");
        bank.setAccountHolderName("Abisheak");
        bank.setAccountNumber("1234567890");
        bank.setBankName("Kiot Bank");
        return bank;
    }
}
