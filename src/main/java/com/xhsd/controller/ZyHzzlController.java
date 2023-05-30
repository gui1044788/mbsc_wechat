package com.xhsd.controller;

import com.xhsd.dto.SpInGetPatInfoResDto;
import com.xhsd.form.SpInGetPatInfoForm;
import com.xhsd.form.SpPatInfoForm;
import com.xhsd.service.ZyHzzlService;
import com.xhsd.utils.Result;
import com.xhsd.utils.ReturnCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Objects;

/**
 * (com.xhsd.entity.ZyHzzl)表服务控制层
 *
 * @author guijun
 * @since 2023-05-29 16:30:52
 */
@Api(tags = "住院登记接口")
@RestController
@AllArgsConstructor
@RequestMapping("zyHzzl")
@Slf4j
public class ZyHzzlController {
    @Resource
    private final ZyHzzlService zyHzzlService;


    /**
     * 住院登记--新增
     */
    @RequestMapping(value = "/spInSetPatInfo",method = RequestMethod.POST)
    @ApiOperation(value = "住院登记--新增")
    public Result spInSetPatInfo(@Valid @RequestBody SpPatInfoForm form,BindingResult result) {
        if (result.hasErrors()){
            log.error("登记信息有误:{}:{}", Objects.requireNonNull(result.getFieldError().getField()),result.getFieldError().getDefaultMessage());
            return Result.failure(ReturnCode.OPERATION_ERROR,result.getAllErrors().get(0).getDefaultMessage());
        }
        return zyHzzlService.spInSetPatInfo(form);
    }

    /**
     * 住院登记--查询
     */
    @RequestMapping(value = "/spInGetPatInfo",method = RequestMethod.POST)
    @ApiOperation(value = "住院登记--查询")
    public Result<SpInGetPatInfoResDto> spInGetPatInfo(@RequestBody SpInGetPatInfoForm form) {
        return Result.success(zyHzzlService.spInGetPatInfo(form));
    }

}

