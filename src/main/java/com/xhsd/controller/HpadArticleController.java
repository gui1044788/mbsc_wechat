package com.xhsd.controller;

import com.xhsd.baseutils.utils.Result;
import com.xhsd.form.AddArticleForm;
import com.xhsd.mapper.BaseMapper;
import com.xhsd.service.HpadArticleService;
import com.xhsd.service.SimpleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 推送文章表(HpadArticle)表服务控制层
 *
 * @author guijun
 * @since 2023-06-25 15:06:03
 */
@Api(tags = "推送文章表(HpadArticle)")
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("hpadArticle")
public class HpadArticleController {
    @Resource
    private final HpadArticleService hpadArticleService;

    /**
     * 新增文章
     */
    @RequestMapping(value = "/addArticle", method = RequestMethod.POST)
    @ApiOperation(value = "新增文章")
    public Result addArticle(@RequestBody AddArticleForm form) {
        return hpadArticleService.addArticle(form);
    }


}

