package com.peony.remote.sdey.api.service;

import com.peony.remote.sdey.api.po.*;
import com.peony.remote.sdey.api.vo.ImportParam;

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
}
