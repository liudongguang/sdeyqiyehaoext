package com.peony.remote.sdey.impl.mapper;

import com.peony.remote.sdey.api.po.ZYXXzhuanke;
import com.peony.remote.sdey.api.po.ZYXXzhuyuanbr;
import com.peony.remote.sdey.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
public interface ZYXXzhuyuanbrMapper extends Mapper<ZYXXzhuyuanbr> {
    List<ZYXXzhuyuanbr> getInfoByBetweenDate(ImportParam param);

    int getZYXXzaiyuan();
}
