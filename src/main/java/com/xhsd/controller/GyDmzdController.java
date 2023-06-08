package com.xhsd.controller;

import com.xhsd.baseutils.currentlimiting.CurrentLimiting;
import com.xhsd.dto.CommonResultDto;
import com.xhsd.dto.GyDmzdResDto;
import com.xhsd.form.SpPatInfoForm;
import com.xhsd.service.GyDmzdService;
import com.xhsd.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * (GyDmzd)表服务控制层
 *
 * @author guijun
 * @since 2023-05-31 11:06:56
 */
@Api(tags = "字典项接口")
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("gyDmzd")
public class GyDmzdController {
    @Resource
    private final GyDmzdService gyDmzdService;

    /**
     * 字典项--公共选项列表查询
     */
    @RequestMapping(value = "/queryCommonGyDmzdList", method = RequestMethod.POST)
    @ApiOperation(value = "字典项--公共选项列表查询")
    public Result<GyDmzdResDto> queryCommonGyDmzdList() {
        return gyDmzdService.queryCommonGyDmzdList();
    }


}

