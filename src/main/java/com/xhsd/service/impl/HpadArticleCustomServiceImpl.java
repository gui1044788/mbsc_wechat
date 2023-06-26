package com.xhsd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhsd.entity.HpadArticleCustom;
import com.xhsd.mapper.HpadArticleCustomMapper;
import com.xhsd.service.HpadArticleCustomService;
import org.springframework.stereotype.Service;

/**
 * 文章定制表(HpadArticleCustom)表服务实现类
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
@Service
public class HpadArticleCustomServiceImpl extends ServiceImpl<HpadArticleCustomMapper, HpadArticleCustom> implements HpadArticleCustomService {

    @Override
    public int insertHpadArticleCustom(HpadArticleCustom record) {
        return baseMapper.insertHpadArticleCustom(record);
    }
}

