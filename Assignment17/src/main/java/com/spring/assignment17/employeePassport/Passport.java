package com.spring.assignment17.employeePassport;

import java.time.LocalDate;

public class Passport {
    private Integer passNum;
    private LocalDate dateOfIssue;
    private LocalDate dateOfExpiry;

    public Integer getPassNum() {
        return passNum;
    }
	public void setPassNum(Integer passNum) {
        this.passNum = passNum;
    }
    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }
    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfIssue.plusDays(84);
    }
    public void setDateOfExpiry(LocalDate dateOfExpiry) {
    	this.dateOfExpiry = dateOfExpiry;
    }
    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }
    @Override
    public String toString() {
        return "Passport [passNum="+passNum+",dateOfIssue="+dateOfIssue+",dateOfExpiry="+dateOfExpiry+"]";
    }
}
