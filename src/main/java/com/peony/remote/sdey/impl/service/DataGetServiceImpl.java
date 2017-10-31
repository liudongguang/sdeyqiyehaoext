package com.peony.remote.sdey.impl.service;

import com.peony.remote.sdey.api.po.MenZhenLiang;
import com.peony.remote.sdey.api.po.YuYueLiang;
import com.peony.remote.sdey.api.service.DataGetService;
import com.peony.remote.sdey.api.vo.ImportParam;
import com.peony.remote.sdey.impl.mapper.MenZhenLiangMapper;
import com.peony.remote.sdey.impl.mapper.YuYueLiangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/31.
 */
@Service
public class DataGetServiceImpl implements DataGetService {
    @Autowired
    private MenZhenLiangMapper menzhenLiangMapper;
    @Autowired
    private YuYueLiangMapper yuYueLiangMapper;


    @Override
    public List<MenZhenLiang> getmzxx(ImportParam param) {
        return menzhenLiangMapper.getmzxx(param);
    }

    @Override
    public List<YuYueLiang> getyyl(ImportParam param) {
        return yuYueLiangMapper.getyyl(param);
    }
}
