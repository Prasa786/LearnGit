package com.spring.assignment17.employeePassport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Employee employee = context.getBean(Employee.class);
            Passport passport = context.getBean(Passport.class);

            System.out.println(employee);
            System.out.println(passport);

        }
    }
}