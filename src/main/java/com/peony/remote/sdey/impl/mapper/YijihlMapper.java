package com.peony.remote.sdey.impl.mapper;

import com.github.pagehelper.PageInfo;
import com.peony.remote.sdey.api.po.MenZhenLiang;
import com.peony.remote.sdey.api.po.YJHLInfo;
import com.peony.remote.sdey.api.po.YiJiInfo;
import com.peony.remote.sdey.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
public interface YijihlMapper extends Mapper<YJHLInfo> {
    List<YJHLInfo> getyjhl(ImportParam param);

    List<YJHLInfo> getInfoByBetweenDate(ImportParam param);
}
