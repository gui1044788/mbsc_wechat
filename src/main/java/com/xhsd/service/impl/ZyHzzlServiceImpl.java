package com.xhsd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhsd.dto.SpInGetPatInfoResDto;
import com.xhsd.dto.SpInSetPatInfoResDto;
import com.xhsd.entity.ZyHzzl;
import com.xhsd.form.SpInGetPatInfoForm;
import com.xhsd.form.SpInSetPatInfoForm;
import com.xhsd.mapper.datasource34.ZyHzzlMapper;
import com.xhsd.service.ZyHzzlService;
import org.springframework.stereotype.Service;

/**
 * (com.xhsd.entity.ZyHzzl)表服务实现类
 *
 * @author guijun
 * @since 2023-05-29 16:30:52
 */
@Service
public class ZyHzzlServiceImpl extends ServiceImpl<ZyHzzlMapper, ZyHzzl> implements ZyHzzlService {

    @Override
    public SpInSetPatInfoResDto spInSetPatInfo(SpInSetPatInfoForm form) {
        return baseMapper.spInSetPatInfo(form);
    }

    @Override
    public SpInGetPatInfoResDto spInGetPatInfo(SpInGetPatInfoForm form) {
        return baseMapper.spInGetPatInfo(form);
    }
}

