package com.xhsd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhsd.dto.GyDmzdResDto;
import com.xhsd.entity.GyDmzd;
import com.xhsd.mapper.datasource34.GyDmzdMapper;
import com.xhsd.service.GyDmzdService;
import com.xhsd.utils.Result;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * (GyDmzd)表服务实现类
 *
 * @author guijun
 * @since 2023-05-31 11:06:56
 */
@Service
public class GyDmzdServiceImpl extends ServiceImpl<GyDmzdMapper, GyDmzd> implements GyDmzdService {

    @Override
    public Result<GyDmzdResDto> queryCommonGyDmzdList() {
        GyDmzdResDto gyDmzdResDto = new GyDmzdResDto();
        List<GyDmzd> countrys = baseMapper.selectGyDmzdByDmlb(2);
        List<GyDmzd> nations = baseMapper.selectGyDmzdByDmlb(1);
        List<GyDmzd> relations = baseMapper.selectGyDmzdByDmlb(4);
        List<GyDmzd> jobs = baseMapper.selectGyDmzdByDmlb(14);
        List<GyDmzd> maritalStatus = baseMapper.selectGyDmzdByDmlb(5);
        gyDmzdResDto.setJobs(jobs);
        gyDmzdResDto.setNations(nations);
        gyDmzdResDto.setCountrys(countrys);
        gyDmzdResDto.setMaritalStatus(maritalStatus);
        gyDmzdResDto.setRelations(relations);
        return Result.success(gyDmzdResDto);
    }
}

