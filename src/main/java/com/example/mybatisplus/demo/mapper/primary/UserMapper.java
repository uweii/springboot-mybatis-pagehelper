package com.example.mybatisplus.demo.mapper.primary;

import com.example.mybatisplus.demo.mapper.core.CustomMapper;
import com.example.mybatisplus.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author wuwei
 * @Date 2019/11/25 9:42 下午
 */
@Repository
public interface UserMapper extends CustomMapper<User> {

}
