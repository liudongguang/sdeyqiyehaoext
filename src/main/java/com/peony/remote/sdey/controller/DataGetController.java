package com.peony.remote.sdey.controller;

import com.peony.base.api.vo.ResultMsg;
import com.peony.remote.sdey.api.po.MenZhenLiang;
import com.peony.remote.sdey.api.po.YuYueLiang;
import com.peony.remote.sdey.api.service.DataGetService;
import com.peony.remote.sdey.api.vo.ImportParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/data")
public class DataGetController {
    @Autowired
    private DataGetService dataGetService;

    /**
     * 获取门诊信息
     *
     * @return
     */
    @RequestMapping("/getmzxx")
    @ResponseBody
    public ResultMsg getmzxx(ImportParam param) {
        LocalDate start=LocalDate.of(2017,3,3);
        LocalDate end=LocalDate.of(2017,4,3);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdtstart = start.atStartOfDay(zoneId);
        ZonedDateTime zdtend = end.atStartOfDay(zoneId);
        param.setStarte(Date.from(zdtstart.toInstant()));
        param.setEnd(Date.from(zdtend.toInstant()));
        List<MenZhenLiang> rs = dataGetService.getmzxx(param);
        System.out.println(rs.size());
        return new ResultMsg();
    }

    /**
     * 预约量
     * @param param
     * @return
     */
    @RequestMapping("/getyyl")
    @ResponseBody
    public ResultMsg getyyl(ImportParam param) {
        LocalDate start=LocalDate.of(2017,3,3);
        LocalDate end=LocalDate.of(2017,4,3);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdtstart = start.atStartOfDay(zoneId);
        ZonedDateTime zdtend = end.atStartOfDay(zoneId);
        param.setStarte(Date.from(zdtstart.toInstant()));
        param.setEnd(Date.from(zdtend.toInstant()));
        List<YuYueLiang> rs = dataGetService.getyyl(param);
        System.out.println(rs.size());
        return new ResultMsg();
    }
}
