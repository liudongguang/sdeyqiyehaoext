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
}
