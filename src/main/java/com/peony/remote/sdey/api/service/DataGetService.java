package com.peony.remote.sdey.api.service;

import com.github.pagehelper.PageInfo;
import com.peony.remote.sdey.api.po.*;
import com.peony.remote.sdey.api.vo.ImportParam;
import com.peony.remote.sdey.api.vo.PageParam;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
public interface DataGetService {
    List<MenZhenLiang> getmzxx(ImportParam param);

    List<YuYueLiang> getyyl(ImportParam param);

    List<JBZDLiang> getjbzd(ImportParam param);

    List<YiJiInfo> getyjxx(ImportParam param);

    List<YJHLInfo> getyjhl(ImportParam param);

    List<HzxxInfo> gethzxx(ImportParam param);

    List<ZybrInfo> getzybr(ImportParam param);

    /**
     * 费用门诊处方
     * @param param
     * @return
     */
    List<FYXXmenzhenchufang> getmenzhenfycf(ImportParam param);

    /**
     * 费用门诊医技
     * @param param
     * @return
     */
    List<FYXXmenzhenyiji> getmenzhenfyyj(ImportParam param);

    /**
     * 住院费用
     * @param param
     * @return
     */
    List<FYXXzhuyuan> getzhuyuanfy(ImportParam param);

    /**
     * 床位
     * @param param
     * @return
     */
    List<ZYXXchuangwei> getZYXXChuangwei(ImportParam param);

    /**
     * 转科
     * @param param
     * @return
     */
    List<ZYXXzhuanke> getZYXXZhuanke(ImportParam param);

    /**
     * 病人情况
     * @param param
     * @return
     */
    List<ZYXXzhuyuanbr> getZYXXBingren(ImportParam param);

    /**
     * 获取在院信息
     * @return
     */
    int getZYXXzaiyuan();

    /**
     * 门诊医技
     * @param param
     * @return
     */
    List<YiJiInfo> getyjxx_mz(ImportParam param);

    /**
     * 住院医技
     * @param param
     * @return
     */
    List<YiJiInfo> getyjxx_zy(ImportParam param);

    /**
     * 患者档案
     * @param param
     * @return
     */
    List<HuanzheInfo> getHuanzheBanKaXX(ImportParam param);

    /**
     * 手术安排
     * @param param
     * @return
     */
    List<SSXX_anpai> getShouShuAnPai(ImportParam param);

    /**
     * 实际手术
     * @param param
     * @return
     */
    List<SSXX_info> getShouShuXX(ImportParam param);

    PageInfo<SSXX_anpai> getShouShuXX_One(ImportParam param, PageParam pageParam);
}
