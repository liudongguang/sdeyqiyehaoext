package com.peony.remote.sdey.impl.mapper;

import com.peony.remote.sdey.api.po.JBZDLiang;
import com.peony.remote.sdey.api.po.MenZhenLiang;
import com.peony.remote.sdey.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
public interface JBZDLiangMapper extends Mapper<JBZDLiang> {
    List<JBZDLiang> getjbzd(ImportParam param);
}
