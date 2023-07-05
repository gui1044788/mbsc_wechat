package com.xhsd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhsd.dto.YsMzJzlsDto;
import com.xhsd.entity.YsMzJzls;
import com.xhsd.form.QueryYsMzJzlsDtoListForm;
import com.xhsd.mapper.datasource34.YsMzJzlsMapper;
import com.xhsd.service.YsMzJzlsService;
import com.xhsd.baseutils.utils.Result;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (YsMzJzls)表服务实现类
 *
 * @author guijun
 * @since 2023-06-06 10:45:58
 */
@Service
public class YsMzJzlsServiceImpl extends ServiceImpl<YsMzJzlsMapper, YsMzJzls> implements YsMzJzlsService {

    @Override
    public Result<List<YsMzJzlsDto>> queryYsMzJzlsDtoListByNameId(QueryYsMzJzlsDtoListForm form) {
        List<YsMzJzlsDto> list = baseMapper.queryYsMzJzlsDtoListByNameId(form);
        return Result.success(list);
    }
}

