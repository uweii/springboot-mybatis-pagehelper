package com.example.mybatisplus.demo.service.impl;

import com.example.mybatisplus.demo.mapper.primary.UserMapper;
import com.example.mybatisplus.demo.model.ResultPage;
import com.example.mybatisplus.demo.model.User;
import com.example.mybatisplus.demo.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @Author wuwei
 * @Date 2019/11/28 10:17 下午
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public ResultPage<User> getUserByPage(int pageNo, int pageSize) {
        //分页的主要方法, pageNo: 第几页  pageSize: 每页条数
        PageHelper.startPage(pageNo,pageSize);
        //创建condition
        Condition condition = new Condition(User.class);
        Example.Criteria criteria = condition.createCriteria();
        //条件类似于: select * from User where name = 'wuwei'
        criteria.andEqualTo("name", "wuwei");
        List<User> users = userMapper.selectByCondition(condition);
        PageInfo<User> pageInfo = new PageInfo(users);
        ResultPage<User> resultPage = new
                ResultPage(pageInfo.getList(),pageInfo.getPageNum(),pageInfo.getPageSize(),pageInfo.getPages());
        return resultPage;
    }
}
