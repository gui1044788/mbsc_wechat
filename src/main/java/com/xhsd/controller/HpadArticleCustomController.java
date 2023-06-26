package com.xhsd.controller;

import com.xhsd.service.HpadArticleCustomService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 文章定制表(HpadArticleCustom)表服务控制层
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
@Api(tags = "文章定制表(HpadArticleCustom)")
@Validated
@RestController
@AllArgsConstructor
@RequestMapping("hpadArticleCustom")
public class HpadArticleCustomController {
    @Resource
    private final HpadArticleCustomService hpadArticleCustomService;

}

