package com.xhsd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhsd.dto.YsMzJzlsDto;
import com.xhsd.entity.YsMzJzls;
import com.xhsd.form.QueryYsMzJzlsDtoListForm;
import com.xhsd.utils.Result;

import java.util.List;

/**
 * (YsMzJzls)表服务接口层
 *
 * @author guijun
 * @since 2023-06-06 10:45:58
 */
public interface YsMzJzlsService extends IService<YsMzJzls> {

    Result<List<YsMzJzlsDto>> queryYsMzJzlsDtoListByNameId(QueryYsMzJzlsDtoListForm form);


}

