package com.peony.remote.sdey.controller;

import com.peony.base.api.vo.ResultMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/data")
public class DataGetController {
    /**
     * 获取门诊信息
     * @return
     */
    @RequestMapping("getmzxx")
    @ResponseBody
    public ResultMsg getmzxx() {

        return new ResultMsg();
    }
}
