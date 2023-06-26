package com.xhsd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhsd.entity.HpadArticle;

/**
 * 推送文章表(HpadArticle)表数据库访问层
 *
 * @author guijun
 * @since 2023-06-25 15:06:02
 */
public interface HpadArticleMapper extends BaseMapper<HpadArticle> {

    int insertHpadArticle(HpadArticle record);

}

