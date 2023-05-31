package com.xhsd.mapper.datasource34;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhsd.entity.GyDmzd;

import java.util.List;

/**
 * (GyDmzd)表数据库访问层
 *
 * @author guijun
 * @since 2023-05-31 11:06:56
 */
public interface GyDmzdMapper extends BaseMapper<GyDmzd> {

    List<GyDmzd> selectGyDmzdByDmlb(long dmlb);

}

