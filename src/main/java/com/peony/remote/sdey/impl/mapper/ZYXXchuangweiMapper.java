package com.peony.remote.sdey.impl.mapper;

import com.peony.remote.sdey.api.po.ZYXXchuangwei;
import com.peony.remote.sdey.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
public interface ZYXXchuangweiMapper extends Mapper<ZYXXchuangwei> {
    List<ZYXXchuangwei> getInfoByBetweenDate(ImportParam param);

    List<ZYXXchuangwei> getHisOffice(ImportParam param);
}
