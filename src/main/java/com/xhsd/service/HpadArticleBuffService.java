package com.xhsd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhsd.entity.HpadArticleBuff;


/**
 * 推送文章状态表(HpadArticleBuff)表服务接口层
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
public interface HpadArticleBuffService extends IService<HpadArticleBuff> {
    int insertHpadArticleBuff(HpadArticleBuff record);
}

