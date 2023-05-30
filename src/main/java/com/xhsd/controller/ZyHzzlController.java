package com.xhsd.controller;

import com.xhsd.dto.SpInGetPatInfoResDto;
import com.xhsd.dto.SpInSetPatInfoResDto;
import com.xhsd.form.SpInGetPatInfoForm;
import com.xhsd.form.SpInSetPatInfoForm;
import com.xhsd.service.ZyHzzlService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (com.xhsd.entity.ZyHzzl)表服务控制层
 *
 * @author guijun
 * @since 2023-05-29 16:30:52
 */
@Api(tags = "住院登记接口")
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("zyHzzl")
public class ZyHzzlController {
    @Resource
    private final ZyHzzlService zyHzzlService;

    /**
     * 住院登记--新增
     */
    @RequestMapping(value = "/spInSetPatInfo",method = RequestMethod.POST)
    @ApiOperation(value = "外出通行-验证")
    public SpInSetPatInfoResDto spInSetPatInfo(@RequestBody SpInSetPatInfoForm form) {
        return zyHzzlService.spInSetPatInfo(form);
    }

    /**
     * 住院登记--查询
     */
    @RequestMapping(value = "/spInGetPatInfo",method = RequestMethod.POST)
    @ApiOperation(value = "外出通行-查询")
    public SpInGetPatInfoResDto spInGetPatInfo(@RequestBody SpInGetPatInfoForm form) {
        return zyHzzlService.spInGetPatInfo(form);
    }

}

