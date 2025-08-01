package com.spring.assignment17.employeePassport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;

@Configuration
public class AppConfig {

    @Bean
    public Passport passport() {
        Passport passport = new Passport();
        passport.setPassNum(9090909);
        passport.setDateOfIssue(LocalDate.now());
        passport.setDateOfExpiry(LocalDate.now().plusDays(84));  
        return passport;
    }

    @Bean
    public Employee employee() {
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName("Abisheak");
        employee.setPassObj(passport());
        return employee;
    }
}
