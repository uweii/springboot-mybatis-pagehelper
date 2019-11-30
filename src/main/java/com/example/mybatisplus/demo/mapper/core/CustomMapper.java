package com.example.mybatisplus.demo.mapper.core;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.select.SelectMapper;

/**
 * @Author wuwei
 * @Date 2019/11/27 10:57 上午
 */
public interface CustomMapper<T> extends
        IdsMapper<T>,
        ConditionMapper<T>,
        SelectMapper<T>,
        Mapper<T> {
}
