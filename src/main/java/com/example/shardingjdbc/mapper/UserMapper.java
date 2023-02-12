package com.example.shardingjdbc.mapper;

import com.example.shardingjdbc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author yuemaz
 * @Date 2023/2/11 16:14
 */
@Mapper
public interface UserMapper
{
    @Select("select * from user where id = #{id}")
    User getUserById(int id);

    //@Insert("insert into user(id, name, age) values(#{id}, #{name}, #{age})")
    @Insert("insert into user(name, age) values(#{name}, #{age})")
    int addUser(User user);

    @Select("select * from user where id between #{start} and #{end}")
    List<User> getUserListByIdRange(int start, int end);
}
