package com.example.mybatisplus.demo.service;

import com.example.mybatisplus.demo.model.ResultPage;
import com.example.mybatisplus.demo.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author wuwei
 * @Date 2019/11/28 10:16 下午
 */
public interface UserService {
    ResultPage<User> getUserByPage(int pageNo, int pageSize);
}
