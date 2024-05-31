package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Arrays;

public class Application {


    public static void main(String[] args) {

        StudentDTO student1 = new StudentDTO(1, "정보시스템공학과");
        StudentDTO student2 = new StudentDTO(2, "경영학과");
        StudentDTO student3 = new StudentDTO(4, "정보통신공학과");
        EmployeeDTO employee1 = new EmployeeDTO(1000000, "영업부");
        EmployeeDTO employee2 = new EmployeeDTO(2000000, "기획부");
//        PersonDTO personDTO = new PersonDTO();

        PersonDTO.person = new PersonDTO();

        PersonDTO person1 = new PersonDTO("홍길동", 20, 178.2, 70.0, student1.information);
        PersonDTO person2 = new PersonDTO("김말똥", 21, 187.3, 80.0, student2.information);
        PersonDTO person3 = new PersonDTO("강개순", 23, 167.0, 45.0, student3.information);

//        String[] mungchoong =


        String[] babo = {(person1.getInformation() + student1.getInformation()), (person2.getInformation() + student2.getInformation()), (person3.getInformation() + student3.getInformation())};

        for (String s : babo) {

            System.out.println(s);
        }


    }

}
