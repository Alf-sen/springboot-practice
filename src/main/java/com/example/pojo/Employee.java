package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @auther lenovo
 * @date 2021/6/8 18:42
 */
@Data
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String lastName;
    private Integer gender; //0：女  1：男
    private String email;
    private Department department;
    private Date birth;

    public Employee(Integer id, String lastName, Integer gender, String email, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.department = department;
        this.birth = new Date();
    }
}
