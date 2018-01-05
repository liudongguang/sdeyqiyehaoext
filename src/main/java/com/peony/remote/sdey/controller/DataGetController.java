package com.peony.remote.sdey.controller;

import com.github.pagehelper.PageInfo;
import com.peony.base.api.vo.ResultMsg;
import com.peony.remote.sdey.api.po.*;
import com.peony.remote.sdey.api.service.DataGetService;
import com.peony.remote.sdey.api.vo.ImportParam;
import com.peony.remote.sdey.api.vo.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
     * 获取处方
     * @param param
     * @return
     */
    @RequestMapping("/getchufang")
    @ResponseBody
    public ResultMsg getchufang(ImportParam param) {
        ResultMsg msg=new ResultMsg();
        List<FYXXmenzhenchufang> menzhenfycf=dataGetService.getmenzhenfycf(param);//获取门诊处方
        Map<String,Object> data=new HashMap<>();
        msg.setData(menzhenfycf);
        return msg;
    }
    /**
     *
     * 住院信息
     * @param param
     * @return
     */
    @RequestMapping("/getzyxx")
    @ResponseBody
    public ResultMsg getzyxx(ImportParam param) {
        ResultMsg msg=new ResultMsg();
        List<ZYXXchuangwei> chuangwei=dataGetService.getZYXXChuangwei(param);//床位情况
        List<ZYXXzhuanke> zhuangke=dataGetService.getZYXXZhuanke(param);//转科情况
        List<ZYXXzhuyuanbr> bingren=dataGetService.getZYXXBingren(param);//病人情况
        int zaiyuanNum=dataGetService.getZYXXzaiyuan();//在院人数
        Map<String,Object> data=new HashMap<>();
        data.put("chuangwei",chuangwei);
        data.put("zhuangke",zhuangke);
        data.put("bingren",bingren);
        data.put("zaiyuanNum",zaiyuanNum);
        msg.setData(data);
        return msg;
    }
    @RequestMapping("/getzhuyuanbingren")
    @ResponseBody
    public List<ZYXXzhuyuanbr> getzhuyuanbingren(ImportParam param) {
        List<ZYXXzhuyuanbr> bingren=dataGetService.getZYXXBingren(param);//病人情况
        return bingren;
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
        List<YiJiInfo> mzyiji = dataGetService.getyjxx_mz(param);
        List<YiJiInfo> zyyiji = dataGetService.getyjxx_zy(param);
        Map<String,Object> data=new HashMap<>();
        data.put("mzyiji",mzyiji);
        data.put("zyyiji",zyyiji);
        ResultMsg msg=new ResultMsg();
        msg.setData(data);
        return msg;
    }

    /**
     *
     * 一级护理信息
     * @param param
     * @return
     */
    @RequestMapping("/getyijihulixx")
    @ResponseBody
    public ResultMsg getyijihulixx(ImportParam param) {
        List<YJHLInfo> yjhl = dataGetService.getyjhl(param);
        Map<String,Object> data=new HashMap<>();
        data.put("yjhl",yjhl);
        ResultMsg msg=new ResultMsg();
        msg.setData(data);
        return msg;
    }

    /**
     * 一级护理 分页信息
     * @param param
     * @param pageParam
     * @return
     */
    @RequestMapping("/yijihuliPageInfo")
    @ResponseBody
    public Map<String,Object> yijihuliPageInfo(ImportParam param,PageParam pageParam) {
        PageInfo<YJHLInfo> yijihuili = dataGetService.getyijihuliPageInfo(param,pageParam);
        ResultMsg msg=new ResultMsg();
        Map<String,Object> data=new HashMap<>();
        data.put("list",yijihuili.getList());
        data.put("pageNum",yijihuili.getPageNum());
        data.put("pages",yijihuili.getPages());
        data.put("total",yijihuili.getTotal());
        msg.setData(data);
        return data;
    }
    /**
     * 患者档案-办卡
     * @param param
     * @return
     */
    @RequestMapping("/getHuanZheBankaxx")
    @ResponseBody
    public ResultMsg getHuanZheBankaxx(ImportParam param) {
        List<HuanzheInfo> bankaxx = dataGetService.getHuanzheBanKaXX(param);
        Map<String,Object> data=new HashMap<>();
        data.put("bankaxx",bankaxx);
        ResultMsg msg=new ResultMsg();
        msg.setData(data);
        return msg;
    }
    /**
     * 手术信息
     * @param param
     * @return
     */
    @RequestMapping("/getShouShuXX")
    @ResponseBody
    public ResultMsg getShouShuXX(ImportParam param) {
        List<SSXX_anpai> ssap = dataGetService.getShouShuAnPai(param);
        List<SSXX_info> ss = dataGetService.getShouShuXX(param);
        Map<String,Object> data=new HashMap<>();
        data.put("ssap",ssap);
        data.put("ss",ss);
        ResultMsg msg=new ResultMsg();
        msg.setData(data);
        return msg;
    }

    @RequestMapping("/getShouShuXX_One")
    @ResponseBody
    public Map<String,Object> getShouShuXX_One(ImportParam param,PageParam pageParam) {
        PageInfo<SSXX_anpai> ssap = dataGetService.getShouShuXX_One(param,pageParam);
        ResultMsg msg=new ResultMsg();
        Map<String,Object> data=new HashMap<>();
        data.put("list",ssap.getList());
        data.put("pageNum",ssap.getPageNum());
        data.put("pages",ssap.getPages());
        data.put("total",ssap.getTotal());
        msg.setData(data);
        return data;
    }

    /**
     * 会诊
     * @param param
     * @return
     */
    @RequestMapping("/gethzxx")
    @ResponseBody
    public ResultMsg gethzxx(ImportParam param) {
        List<HzxxInfo> shenqing = dataGetService.gethzxx_shenqing(param);
        List<HzxxInfo> jieshou = dataGetService.gethzxx_jieshou(param);
        ResultMsg msg=new ResultMsg();
        Map<String,Object> data=new HashMap<>();
        data.put("shenqing",shenqing);
        data.put("jieshou",jieshou);
        msg.setData(data);
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
    @RequestMapping("/getHisOffice")
    @ResponseBody
    public ResultMsg getHisOffice(ImportParam param) {
        List<YiJiInfo> hisOffice = dataGetService.getHisOffice(param);
        ResultMsg msg=new ResultMsg();
        msg.setData(hisOffice);
        return msg;
    }

}
