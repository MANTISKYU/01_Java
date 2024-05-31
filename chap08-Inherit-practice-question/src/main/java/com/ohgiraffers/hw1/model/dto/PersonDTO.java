package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {

    public static PersonDTO person;
    protected String name;
    private int age;
    private double height;
    private double weight;
    public String information;

    public PersonDTO() {

//        System.out.println("기본생성자 호출함");

    }

    public PersonDTO(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

//        System.out.println("매개변수 있는 생성자 호출함");

    }

    public void person () {



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getInformation() {
        return "name : " + name + ", age : " + age + ", height : " + height + ", weight : " + weight;
    }


}
