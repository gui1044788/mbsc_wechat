package com.xhsd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhsd.dto.SpInGetPatInfoResDto;
import com.xhsd.entity.ZyHzzl;
import com.xhsd.form.SpInGetPatInfoForm;
import com.xhsd.form.SpPatInfoForm;
import com.xhsd.utils.Result;

/**
 * (com.xhsd.entity.ZyHzzl)表服务接口层
 *
 * @author guijun
 * @since 2023-05-29 16:30:52
 */
public interface ZyHzzlService extends IService<ZyHzzl> {

    Result spInSetPatInfo(SpPatInfoForm form);
    SpInGetPatInfoResDto spInGetPatInfo(SpInGetPatInfoForm form);

}

