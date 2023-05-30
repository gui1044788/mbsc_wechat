package com.xhsd.mapper.datasource34;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhsd.dto.SpInGetPatInfoResDto;
import com.xhsd.entity.ZyHzzl;
import com.xhsd.form.SpInSetPatInfoForm;

/**
 * (com.xhsd.entity.ZyHzzl)表数据库访问层
 *
 * @author guijun
 * @since 2023-05-29 16:30:52
 */
public interface ZyHzzlMapper extends BaseMapper<ZyHzzl> {

    SpInSetPatInfoForm spInSetPatInfo(SpInSetPatInfoForm form);
    SpInGetPatInfoResDto spInGetPatInfo(String form);

}

