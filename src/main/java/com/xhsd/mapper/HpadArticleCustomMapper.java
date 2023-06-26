package com.xhsd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhsd.entity.HpadArticleCustom;

/**
 * 文章定制表(HpadArticleCustom)表数据库访问层
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
public interface HpadArticleCustomMapper extends BaseMapper<HpadArticleCustom> {
    int insertHpadArticleCustom(HpadArticleCustom record);
}

