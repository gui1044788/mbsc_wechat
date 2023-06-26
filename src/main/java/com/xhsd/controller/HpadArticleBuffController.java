package com.xhsd.controller;

import com.xhsd.service.HpadArticleBuffService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 推送文章状态表(HpadArticleBuff)表服务控制层
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
@Api(tags = "推送文章状态表(HpadArticleBuff)")
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("hpadArticleBuff")
public class HpadArticleBuffController {
    @Resource
    private final HpadArticleBuffService hpadArticleBuffService;

}

