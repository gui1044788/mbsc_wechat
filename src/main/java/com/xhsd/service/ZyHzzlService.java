package com.xhsd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhsd.dto.SpInGetPatInfoResDto;
import com.xhsd.dto.SpInSetPatInfoResDto;
import com.xhsd.entity.ZyHzzl;
import com.xhsd.form.SpInGetPatInfoForm;
import com.xhsd.form.SpInSetPatInfoForm;

/**
 * (com.xhsd.entity.ZyHzzl)表服务接口层
 *
 * @author guijun
 * @since 2023-05-29 16:30:52
 */
public interface ZyHzzlService extends IService<ZyHzzl> {

    SpInSetPatInfoResDto spInSetPatInfo(SpInSetPatInfoForm form);
    SpInGetPatInfoResDto spInGetPatInfo(SpInGetPatInfoForm form);

}

