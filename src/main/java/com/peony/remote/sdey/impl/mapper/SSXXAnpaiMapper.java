package com.peony.remote.sdey.impl.mapper;

import com.peony.remote.sdey.api.po.HzxxInfo;
import com.peony.remote.sdey.api.po.SSXX_anpai;
import com.peony.remote.sdey.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
public interface SSXXAnpaiMapper extends Mapper<SSXX_anpai> {
    List<SSXX_anpai> getInfoByBetweenDate(ImportParam param);
}
