package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

//        PersonDTO person;
//        String name;
//        PersonDTO age;
//        PersonDTO height;
//        PersonDTO weight;
//        PersonDTO information;



//        StudentDTO student1 = new StudentDTO(1, "정보시스템공학과");
//        StudentDTO student2 = new StudentDTO(2, "경영학과");
//        StudentDTO student3 = new StudentDTO(4, "정보통신공학과");
//        EmployeeDTO employee1 = new EmployeeDTO(1000000, "영업부");
//        EmployeeDTO employee2 = new EmployeeDTO(2000000, "기획부");
//        PersonDTO personDTO = new PersonDTO();

        PersonDTO.person = new PersonDTO();
        EmployeeDTO.employee = new EmployeeDTO();

        PersonDTO person1 = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        PersonDTO person2 = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        PersonDTO person3 = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
//
//        PersonDTO officeman1 = new PersonDTO("박보검", 26, 180.3, 72.0, employee1.information);
//        PersonDTO officeman2 = new PersonDTO("강동원", 38, 182.0, 76.0, employee2.information);

        PersonDTO officeman1 = new EmployeeDTO("박보검", 26, 180.3, 72.0,100000, "영업부");
        PersonDTO officeman2 = new EmployeeDTO("강동원", 38, 182.0, 76.0,200000, "기획부");
//        PersonDTO officeman = new EmployeeDTO()

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

//        String[] babo = {(person1.getInformation() + student1.getInformation()), (person2.getInformation() + student2.getInformation()), (person3.getInformation() + student3.getInformation())};
//
//        for (String s : babo) {
//
//            System.out.println(s);
//        }
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        PersonDTO[] employees = new EmployeeDTO[10];
        employees[0] = officeman1;
        employees[1] = officeman2;

        while() {


            for (int i = 2; i < employees.length; i++) {

                System.out.println();
                System.out.println("이름을 입력해주세요");
                String name = sc.nextLine();
                PersonDTO emp1 = new EmployeeDTO();
                emp1.setName(name);

                System.out.println();
                System.out.println("나이를 입력해주세요");
                int age = sc.nextInt();
                PersonDTO emp2 = new EmployeeDTO();
                emp2.setAge(age);

                System.out.println();
                System.out.println("키를 입력해주세요");
                int height = sc.nextInt();
                PersonDTO emp3 = new EmployeeDTO();
                emp3.setHeight(height);

                System.out.println();
                System.out.println("몸무게를 입력해주세요");
                int weight = sc.nextInt();
                PersonDTO emp4 = new EmployeeDTO();
                emp4.setWeight(weight);

                System.out.println();
                System.out.println("연봉을 입력해주세요");
                int salary = sc.nextInt();
                PersonDTO emp5 = new EmployeeDTO();
                emp5.setSalary(salary);


            }
        }



//        String[] mungchoong = {(officeman1.getInformation() + employee1.getInformation()), (officeman2.getInformation() + employee2.getInformation()),
//                (PersonDTO.person.getInformation()) + EmployeeDTO.employee.getInformation()};




//        System.out.println();
//        System.out.println("이름을 입력해주세요");
//        String name = sc.nextLine();
//        PersonDTO emp1 = new EmployeeDTO();
//        emp1.setName(name);



//        for (String s : mungchoong) {
//
//            System.out.println(s);
//        }




    }

}
