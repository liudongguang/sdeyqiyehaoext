package com.peony.remote.sdey.controller;

import com.peony.base.api.vo.ResultMsg;
import com.peony.remote.sdey.api.po.*;
import com.peony.remote.sdey.api.service.DataGetService;
import com.peony.remote.sdey.api.vo.ImportParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.transform.Result;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//        LocalDate start = LocalDate.of(2017, 3, 3);
//        LocalDate end = LocalDate.of(2017, 4, 3);
//        ZoneId zoneId = ZoneId.systemDefault();
//        ZonedDateTime zdtstart = start.atStartOfDay(zoneId);
//        ZonedDateTime zdtend = end.atStartOfDay(zoneId);
//        param.setStarte(Date.from(zdtstart.toInstant()));
//        param.setEnd(Date.from(zdtend.toInstant()));
        List<MenZhenLiang> rs = dataGetService.getmzxx(param);
        ResultMsg msg=new ResultMsg();
        msg.setData(rs);
        return msg;
    }

    /**
     * 预约量
     *
     * @param param
     * @return
     */
    @RequestMapping("/getyyl")
    @ResponseBody
    public ResultMsg getyyl(ImportParam param) {
//        LocalDate start = LocalDate.of(2017, 3, 3);
//        LocalDate end = LocalDate.of(2017, 4, 3);
//        ZoneId zoneId = ZoneId.systemDefault();
//        ZonedDateTime zdtstart = start.atStartOfDay(zoneId);
//        ZonedDateTime zdtend = end.atStartOfDay(zoneId);
//        param.setStarte(Date.from(zdtstart.toInstant()));
//        param.setEnd(Date.from(zdtend.toInstant()));
        List<YuYueLiang> rs = dataGetService.getyyl(param);
        ResultMsg msg=new ResultMsg();
        msg.setData(rs);
        return msg;
    }

    /**
     *
     * 疾病诊断
     * @param param
     * @return
     */
    @RequestMapping("/getjbzd")
    @ResponseBody
    public ResultMsg getjbzd(ImportParam param) {
//        LocalDate start = LocalDate.of(2017, 3, 3);
//        LocalDate end = LocalDate.of(2017, 4, 3);
//        ZoneId zoneId = ZoneId.systemDefault();
//        ZonedDateTime zdtstart = start.atStartOfDay(zoneId);
//        ZonedDateTime zdtend = end.atStartOfDay(zoneId);
//        param.setStarte(Date.from(zdtstart.toInstant()));
//        param.setEnd(Date.from(zdtend.toInstant()));
        List<JBZDLiang> rs = dataGetService.getjbzd(param);
        ResultMsg msg=new ResultMsg();
        msg.setData(rs);
        return msg;
    }

    /**
     *
     * 费用信息
     * @param param
     * @return
     */
    @RequestMapping("/getfyxx")
    @ResponseBody
    public ResultMsg getfyxx(ImportParam param) {
        ResultMsg msg=new ResultMsg();
        List<FYXXmenzhenchufang> menzhenfycf=dataGetService.getmenzhenfycf(param);//获取门诊处方
        List<FYXXmenzhenyiji> menzhenfyyj=dataGetService.getmenzhenfyyj(param);//获取门诊医技
        List<FYXXzhuyuan> zhuyuanfy=dataGetService.getzhuyuanfy(param);//获取住院费用
        Map<String,Object> data=new HashMap<>();
        data.put("menzhenfycf",menzhenfycf);
        data.put("menzhenfyyj",menzhenfyyj);
        data.put("zhuyuanfy",zhuyuanfy);
        msg.setData(data);
        return msg;
    }

    /**
     *
     * 医技信息
     * @param param
     * @return
     */
    @RequestMapping("/getyjxx")
    @ResponseBody
    public ResultMsg getyjxx(ImportParam param) {
        LocalDate start = LocalDate.of(2017, 3, 3);
        LocalDate end = LocalDate.of(2017, 4, 3);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdtstart = start.atStartOfDay(zoneId);
        ZonedDateTime zdtend = end.atStartOfDay(zoneId);
        param.setStarte(Date.from(zdtstart.toInstant()));
        param.setEnd(Date.from(zdtend.toInstant()));
        List<YiJiInfo> rs = dataGetService.getyjxx(param);
        ResultMsg msg=new ResultMsg();
        msg.setData(rs);
        return msg;
    }

    /**
     *
     * 医技护理信息
     * @param param
     * @return
     */
    @RequestMapping("/getyjhl")
    @ResponseBody
    public ResultMsg getyjhl(ImportParam param) {
        LocalDate start = LocalDate.of(2017, 3, 3);
        LocalDate end = LocalDate.of(2017, 4, 3);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdtstart = start.atStartOfDay(zoneId);
        ZonedDateTime zdtend = end.atStartOfDay(zoneId);
        param.setStarte(Date.from(zdtstart.toInstant()));
        param.setEnd(Date.from(zdtend.toInstant()));
        List<YJHLInfo> rs = dataGetService.getyjhl(param);
        ResultMsg msg=new ResultMsg();
        msg.setData(rs);
        return msg;
    }

    /**
     * 会诊
     * @param param
     * @return
     */
    @RequestMapping("/gethzxx")
    @ResponseBody
    public ResultMsg gethzxx(ImportParam param) {
        LocalDate start = LocalDate.of(2017, 3, 3);
        LocalDate end = LocalDate.of(2017, 4, 3);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdtstart = start.atStartOfDay(zoneId);
        ZonedDateTime zdtend = end.atStartOfDay(zoneId);
        param.setStarte(Date.from(zdtstart.toInstant()));
        param.setEnd(Date.from(zdtend.toInstant()));
        List<HzxxInfo> rs = dataGetService.gethzxx(param);
        ResultMsg msg=new ResultMsg();
        msg.setData(rs);
        return msg;
    }

    /**
     * 病人
     * @param param
     * @return
     */
    @RequestMapping("/getzybr")
    @ResponseBody
    public ResultMsg getzybr(ImportParam param) {
        LocalDate start = LocalDate.of(2017, 3, 3);
        LocalDate end = LocalDate.of(2017, 4, 3);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdtstart = start.atStartOfDay(zoneId);
        ZonedDateTime zdtend = end.atStartOfDay(zoneId);
        param.setStarte(Date.from(zdtstart.toInstant()));
        param.setEnd(Date.from(zdtend.toInstant()));
        List<ZybrInfo> rs = dataGetService.getzybr(param);
        ResultMsg msg=new ResultMsg();
        msg.setData(rs);
        return msg;
    }

}
