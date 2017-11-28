package com.peony.remote.sdey.impl.service;

import com.peony.remote.sdey.api.po.*;
import com.peony.remote.sdey.api.service.DataGetService;
import com.peony.remote.sdey.api.vo.ImportParam;
import com.peony.remote.sdey.impl.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
@Service
public class DataGetServiceImpl implements DataGetService {
    @Autowired
    private MenZhenLiangMapper menzhenLiangMapper;
    @Autowired
    private YuYueLiangMapper yuYueLiangMapper;
    @Autowired
    private JBZDLiangMapper jbzdLiangMapper;
    @Autowired
    private YijiMapper yijiMapper;//医技信息
    @Autowired
    private YijihlMapper yijihlMapper;//护理
    @Autowired
    private HzxxMapper hzxxMapper;//会诊信息
    @Autowired
    private ZybrMapper zybrMapper;//住院病人

    @Autowired
    private FYXXmenzhenchufangMapper fyxXmenzhenchufangMapper;//
    @Autowired
    private FYXXmenzhenyijiMapper fyxXmenzhenyijiMapper;//
    @Autowired
    private FYXXzhuyuanMapper fyxXzhuyuanMapper;//
    ///////////////////////
    @Autowired
    private ZYXXchuangweiMapper zyxXchuangweiMapper;//
    @Autowired
    private ZYXXzhuankeMapper zyxXzhuankeMapper;//
    @Autowired
    private ZYXXzhuyuanbrMapper zyxXzhuyuanbrMapper;//

    @Override
    public List<MenZhenLiang> getmzxx(ImportParam param) {
        return menzhenLiangMapper.getmzxx(param);
    }

    @Override
    public List<YuYueLiang> getyyl(ImportParam param) {
        return yuYueLiangMapper.getyyl(param);
    }

    @Override
    public List<JBZDLiang> getjbzd(ImportParam param) {
        return jbzdLiangMapper.getjbzd(param);
    }

    @Override
    public List<YiJiInfo> getyjxx(ImportParam param) {
        return yijiMapper.getyjxx(param);
    }

    @Override
    public List<YJHLInfo> getyjhl(ImportParam param) {
        return yijihlMapper.getyjhl(param);
    }

    @Override
    public List<HzxxInfo> gethzxx(ImportParam param) {
        return hzxxMapper.gethzxx(param);
    }

    @Override
    public List<ZybrInfo> getzybr(ImportParam param) {
        return zybrMapper.getzybr(param);
    }

    @Override
    public List<FYXXmenzhenchufang> getmenzhenfycf(ImportParam param) {
        return fyxXmenzhenchufangMapper.getInfoByBetweenDate(param);
    }

    @Override
    public List<FYXXmenzhenyiji> getmenzhenfyyj(ImportParam param) {
        return fyxXmenzhenyijiMapper.getInfoByBetweenDate(param);
    }

    @Override
    public List<FYXXzhuyuan> getzhuyuanfy(ImportParam param) {
        return fyxXzhuyuanMapper.getInfoByBetweenDate(param);
    }

    @Override
    public List<ZYXXchuangwei> getZYXXChuangwei(ImportParam param) {
        param.initStr();
        return zyxXchuangweiMapper.getInfoByBetweenDate(param);
    }

    @Override
    public List<ZYXXzhuanke> getZYXXZhuanke(ImportParam param) {
        return zyxXzhuankeMapper.getInfoByBetweenDate(param);
    }

    @Override
    public List<ZYXXzhuyuanbr> getZYXXBingren(ImportParam param) {
        return zyxXzhuyuanbrMapper.getInfoByBetweenDate(param);
    }
}
