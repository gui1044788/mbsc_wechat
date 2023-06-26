package com.xhsd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhsd.entity.HpadArticleBuff;

/**
 * 推送文章状态表(HpadArticleBuff)表数据库访问层
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
public interface HpadArticleBuffMapper extends BaseMapper<HpadArticleBuff> {
    int insertHpadArticleBuff(HpadArticleBuff record);
}

