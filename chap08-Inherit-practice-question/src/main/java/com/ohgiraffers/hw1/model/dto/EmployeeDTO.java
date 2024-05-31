package com.ohgiraffers.hw1.model.dto;

import java.util.Scanner;

public class EmployeeDTO extends PersonDTO {


    public static EmployeeDTO employee;
    private int salary;
    private String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(name, age, height, weight);
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
        return   ", salary = " + salary + ", dept = [" + dept + "]";
    }


}

