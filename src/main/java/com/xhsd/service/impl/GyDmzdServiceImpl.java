package com.xhsd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhsd.dto.GyDmzdDto;
import com.xhsd.dto.GyDmzdResDto;
import com.xhsd.entity.GyDmzd;
import com.xhsd.mapper.datasource34.GyDmzdMapper;
import com.xhsd.service.GyDmzdService;
import com.xhsd.baseutils.utils.Result;
import org.springframework.stereotype.Service;

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
        List<GyDmzdDto> countrys = baseMapper.selectGyDmzdByDmlb(2);
        List<GyDmzdDto> nations = baseMapper.selectGyDmzdByDmlb(1);
        List<GyDmzdDto> relations = baseMapper.selectGyDmzdByDmlb(4);
        List<GyDmzdDto> jobs = baseMapper.selectGyDmzdByDmlb(14);
        List<GyDmzdDto> maritalStatus = baseMapper.selectGyDmzdByDmlb(5);
        List<GyDmzdDto> formOfHospitalization = baseMapper.selectGyDmzdByDmlb(228);
        List<GyDmzdDto> gender = baseMapper.selectGyDmzdByDmlb(15);
        gyDmzdResDto.setJobs(jobs);
        gyDmzdResDto.setGender(gender);
        gyDmzdResDto.setNations(nations);
        gyDmzdResDto.setCountrys(countrys);
        gyDmzdResDto.setMaritalStatus(maritalStatus);
        gyDmzdResDto.setRelations(relations);
        gyDmzdResDto.setFormOfHospitalization(formOfHospitalization);
        return Result.success(gyDmzdResDto);
    }
}

