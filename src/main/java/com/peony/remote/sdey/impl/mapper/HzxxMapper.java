package com.peony.remote.sdey.impl.mapper;

import com.peony.remote.sdey.api.po.HzxxInfo;
import com.peony.remote.sdey.api.po.JBZDLiang;
import com.peony.remote.sdey.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
public interface HzxxMapper extends Mapper<HzxxInfo> {
    List<HzxxInfo> gethzxx_shenqing(ImportParam param);
    List<HzxxInfo> gethzxx_jieshou(ImportParam param);

}
