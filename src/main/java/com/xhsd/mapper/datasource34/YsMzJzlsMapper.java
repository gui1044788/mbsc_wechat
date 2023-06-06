package com.xhsd.mapper.datasource34;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhsd.dto.YsMzJzlsDto;
import com.xhsd.entity.YsMzJzls;
import com.xhsd.form.QueryYsMzJzlsDtoListForm;

import java.util.List;

/**
 * (YsMzJzls)表数据库访问层
 *
 * @author guijun
 * @since 2023-06-06 10:45:58
 */
public interface YsMzJzlsMapper extends BaseMapper<YsMzJzls> {

    List<YsMzJzlsDto> queryYsMzJzlsDtoListByNameId(QueryYsMzJzlsDtoListForm form);

}

