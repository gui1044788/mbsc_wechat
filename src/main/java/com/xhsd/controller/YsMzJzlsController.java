package com.xhsd.controller;

import com.xhsd.baseutils.currentlimiting.CurrentLimiting;
import com.xhsd.dto.YsMzJzlsDto;
import com.xhsd.form.QueryYsMzJzlsDtoListForm;
import com.xhsd.service.YsMzJzlsService;
import com.xhsd.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * (YsMzJzls)表服务控制层
 *
 * @author guijun
 * @since 2023-06-06 10:45:58
 */
@Api(tags = "门诊就诊信息接口")
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("ysMzJzls")
public class YsMzJzlsController {
    @Resource
    private final YsMzJzlsService ysMzJzlsService;


    /**
     * 根据患者姓名身份证号查询就诊信息
     */
    @RequestMapping(value = "/queryYsMzJzlsDtoListByNameId", method = RequestMethod.POST)
    @ApiOperation(value = "根据患者姓名身份证号查询就诊信息")
    @CurrentLimiting()
    public Result<List<YsMzJzlsDto>> queryYsMzJzlsDtoListByNameId(@RequestBody @Valid QueryYsMzJzlsDtoListForm form) {
        return ysMzJzlsService.queryYsMzJzlsDtoListByNameId(form);
    }



}

