package com.xhsd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhsd.entity.HpadArticleBuff;
import com.xhsd.mapper.HpadArticleBuffMapper;
import com.xhsd.service.HpadArticleBuffService;
import org.springframework.stereotype.Service;

/**
 * 推送文章状态表(HpadArticleBuff)表服务实现类
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
@Service
public class HpadArticleBuffServiceImpl extends ServiceImpl<HpadArticleBuffMapper, HpadArticleBuff> implements HpadArticleBuffService {

    @Override
    public int insertHpadArticleBuff(HpadArticleBuff record) {
        return baseMapper.insertHpadArticleBuff(record);
    }
}

