package com.xhsd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhsd.baseutils.utils.Result;
import com.xhsd.entity.HpadArticle;
import com.xhsd.form.AddArticleForm;
import com.xhsd.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 *
 *
 * @author guijun
 * @since 2023-06-25 15:06:02
 */
@Service
public class SimpleService{

    @Autowired
    private BaseMapper baseMapper;

    public BigDecimal getNextVal(String seq){
        return baseMapper.getNextVal(seq);
    };

}

