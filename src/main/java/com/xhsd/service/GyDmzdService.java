package com.xhsd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhsd.dto.GyDmzdResDto;
import com.xhsd.entity.GyDmzd;
import com.xhsd.baseutils.utils.Result;

/**
 * (GyDmzd)表服务接口层
 *
 * @author guijun
 * @since 2023-05-31 11:06:56
 */
public interface GyDmzdService extends IService<GyDmzd> {

    Result<GyDmzdResDto> queryCommonGyDmzdList();

}

