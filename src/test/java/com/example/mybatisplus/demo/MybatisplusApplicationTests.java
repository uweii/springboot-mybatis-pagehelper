package com.example.mybatisplus.demo;

import com.example.mybatisplus.demo.mapper.primary.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

//@SpringBootTest
//@RunWith(SpringRunner.class)
class MybatisplusApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println("-----   selectAll method test  -----------");
//        List<User> users = userMapper.selectList(null);
//        Assert.assertEquals(5, users.size());
//        users.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }

}
