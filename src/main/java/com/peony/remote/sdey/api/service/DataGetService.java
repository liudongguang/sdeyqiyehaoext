package com.peony.remote.sdey.api.service;

import com.peony.remote.sdey.api.po.MenZhenLiang;
import com.peony.remote.sdey.api.po.YuYueLiang;
import com.peony.remote.sdey.api.vo.ImportParam;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
public interface DataGetService {
    List<MenZhenLiang> getmzxx(ImportParam param);

    List<YuYueLiang> getyyl(ImportParam param);
}
