package com.peony.remote.sdey.impl.mapper;

import com.peony.remote.sdey.api.po.FYXXmenzhenyiji;
import com.peony.remote.sdey.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface FYXXmenzhenyijiMapper extends Mapper<FYXXmenzhenyiji> {
    List<FYXXmenzhenyiji> getInfoByBetweenDate(ImportParam param);
}
