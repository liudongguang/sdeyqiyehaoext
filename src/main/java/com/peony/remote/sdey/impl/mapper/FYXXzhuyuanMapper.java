package com.peony.remote.sdey.impl.mapper;

import com.peony.remote.sdey.api.po.FYXXzhuyuan;
import com.peony.remote.sdey.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface FYXXzhuyuanMapper extends Mapper<FYXXzhuyuan> {
    List<FYXXzhuyuan> getInfoByBetweenDate(ImportParam param);
}
