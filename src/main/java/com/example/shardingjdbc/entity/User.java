package com.example.shardingjdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yuemaz
 * @Date 2023/2/11 16:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    // private int id;
    // bigint 类型
    private Long id;
    private String name;
    private int age;

    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
