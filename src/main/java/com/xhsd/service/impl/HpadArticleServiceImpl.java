package com.xhsd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhsd.baseutils.utils.CopyUtils;
import com.xhsd.baseutils.utils.Result;
import com.xhsd.entity.HpadArticle;
import com.xhsd.entity.HpadArticleBuff;
import com.xhsd.entity.HpadArticleCustom;
import com.xhsd.form.AddArticleForm;
import com.xhsd.mapper.HpadArticleMapper;
import com.xhsd.service.HpadArticleBuffService;
import com.xhsd.service.HpadArticleCustomService;
import com.xhsd.service.HpadArticleService;
import com.xhsd.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * 推送文章表(HpadArticle)表服务实现类
 *
 * @author guijun
 * @since 2023-06-25 15:06:02
 */
@Service
public class HpadArticleServiceImpl extends ServiceImpl<HpadArticleMapper, HpadArticle> implements HpadArticleService {

    @Autowired
    private HpadArticleCustomService customService;

    @Autowired
    private HpadArticleBuffService buffService;

    @Autowired
    private SimpleService simpleService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addArticle(AddArticleForm form) {
        HpadArticle hpadArticle = new HpadArticle();
        HpadArticleCustom custom = new HpadArticleCustom();
        HpadArticleBuff buff = new HpadArticleBuff();
        try {
            //获取主表主键
            BigDecimal seq = simpleService.getNextVal("hpad_article_seq");
            //copy主表数据
            CopyUtils.Copy(form,hpadArticle);
            hpadArticle.setId(seq);
            baseMapper.insertHpadArticle(hpadArticle);
            CopyUtils.Copy(form,custom);
            custom.setArticleId(seq);
            customService.insertHpadArticleCustom(custom);
            buff.setArticleId(seq);
            buffService.insertHpadArticleBuff(buff);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Result.success();
    }


}

