package com.peony.remote.sdey.impl.mapper;

import com.peony.remote.sdey.api.po.JBZDLiang;
import com.peony.remote.sdey.api.po.MenZhenLiang;
import com.peony.remote.sdey.api.po.YiJiInfo;
import com.peony.remote.sdey.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
public interface YijiMapper extends Mapper<YiJiInfo> {
    List<YiJiInfo> getyjxx(ImportParam param);
    List<YiJiInfo> getyjxx_zy(ImportParam param);
    List<YiJiInfo> getyjxx_mz(ImportParam param);
}
