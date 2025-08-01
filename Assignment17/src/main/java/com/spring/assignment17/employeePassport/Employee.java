package com.spring.assignment17.employeePassport;

public class Employee {
    private Integer empId;
    private String empName;
    private Passport passObj;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Passport getPassObj() {
        return passObj;
    }

    public void setPassObj(Passport passObj) {
        this.passObj = passObj;
    }

    @Override
    public String toString() {
        return "Employee [empId="+empId+",empName="+empName+",passObj="+passObj+"]";
    }
}
