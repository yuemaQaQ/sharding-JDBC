package com.example.shardingjdbc;

import com.example.shardingjdbc.entity.User;
import com.example.shardingjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShardingJdbcApplicationTests {

    @Resource
    private UserMapper mapper;

    @Test
    void contextLoads() {
        for (int i = 0; i < 10; i++) {
            //mapper.addUser(new User(i, "test", 10));
        }
    }

    @Test
    void contextLoads1() {
        System.out.println(mapper.getUserById(0));
        System.out.println(mapper.getUserById(1));
    }

    @Test
    void contextLoads2() {
        System.out.println(mapper.getUserListByIdRange(0, 2));
    }

    @Test
    void contextLoads3() {
        for (int i = 0; i < 10; i++) {
            mapper.addUser(new User("test", 10));
        }
    }

}
