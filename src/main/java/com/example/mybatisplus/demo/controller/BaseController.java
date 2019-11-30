package com.example.mybatisplus.demo.controller;

import com.example.mybatisplus.demo.model.ResultResponse;

import java.util.List;

/**
 * @Author wuwei
 * @Date 2019/11/28 10:49 下午
 */
public class BaseController<T> {
    protected ResultResponse<T> handleResult(List<T> data){
        return handleResult(data, 0, "OK");
    }

    protected ResultResponse<T> handleResult(T data){
        ResultResponse resultResponse = new ResultResponse();
        resultResponse.setData(data);
        resultResponse.setMsg("OK");
        resultResponse.setCode(0);
        return resultResponse;
    }

    private ResultResponse<T> handleResult(List<T> data, int code, String msg){
        ResultResponse resultResponse = new ResultResponse();
        resultResponse.setData(data);
        resultResponse.setCode(code);
        resultResponse.setMsg(msg);
        return resultResponse;
    }
}
