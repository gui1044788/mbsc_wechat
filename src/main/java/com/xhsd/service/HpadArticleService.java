package com.xhsd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhsd.baseutils.utils.Result;
import com.xhsd.entity.HpadArticle;
import com.xhsd.form.AddArticleForm;


/**
 * 推送文章表(HpadArticle)表服务接口层
 *
 * @author guijun
 * @since 2023-06-25 15:06:02
 */
public interface HpadArticleService extends IService<HpadArticle> {

    public Result addArticle(AddArticleForm form);

}

