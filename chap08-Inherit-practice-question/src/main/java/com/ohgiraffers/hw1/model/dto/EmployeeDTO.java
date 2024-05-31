package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {


    private int salary;
    private String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int salary, String dept) {
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "salary = " + salary + "dept = " + dept + "]";
    }
}
