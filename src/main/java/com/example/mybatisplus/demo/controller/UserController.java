package com.example.mybatisplus.demo.controller;

import com.example.mybatisplus.demo.mapper.primary.UserMapper;
import com.example.mybatisplus.demo.model.ResultPage;
import com.example.mybatisplus.demo.model.ResultResponse;
import com.example.mybatisplus.demo.model.User;
import com.example.mybatisplus.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author wuwei
 * @Date 2019/11/25 10:25 下午
 */
@RestController
@RequestMapping("/start")
public class UserController extends BaseController{
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    @RequestMapping("/mybatisplus")
    public ResultResponse<ResultPage<User>> getUSer(int pageNo, int pageSize){
        return handleResult(userService.getUserByPage(pageNo,pageSize));
    }



    @RequestMapping("/update")
    public List<User> update(User user){
//        int count = userMapper.updateById(user);
//        System.out.println("更新count = " + count);
//        return userMapper.selectList(null);
        return null;
    }

    @RequestMapping("/select/{id}")
    public List<User> select(@PathVariable String id){
        Condition condition = main();
        Example.Criteria criteria = condition.and();
        criteria.andEqualTo("id",id);
        return userMapper.selectByCondition(condition);
    }

    public  Condition main() {
        Condition condition = new Condition(User.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("email", "893702494@qq.com");
        return condition;
    }
}
