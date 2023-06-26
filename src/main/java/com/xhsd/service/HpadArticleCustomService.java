package com.xhsd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhsd.entity.HpadArticleCustom;

/**
 * 文章定制表(HpadArticleCustom)表服务接口层
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
public interface HpadArticleCustomService extends IService<HpadArticleCustom> {
    int insertHpadArticleCustom(HpadArticleCustom record);
}

