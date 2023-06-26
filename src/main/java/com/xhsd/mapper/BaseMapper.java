package com.xhsd.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * 文章定制表(HpadArticleCustom)表数据库访问层
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */

@Mapper
public interface BaseMapper {
    BigDecimal getNextVal (String seqName);
}

