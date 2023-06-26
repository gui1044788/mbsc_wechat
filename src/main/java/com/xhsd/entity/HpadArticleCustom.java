package com.xhsd.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 文章定制表(HpadArticleCustom)表实体类
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description = "")
@SuppressWarnings("serial")
public class HpadArticleCustom extends Model<HpadArticleCustom> implements Serializable {
    private static final long serialVersionUID = 909134554925921273L;

    @ApiModelProperty("文章表id")
    private BigDecimal articleId;

    @ApiModelProperty("文章标题")
    private String title;

    @ApiModelProperty("文章副标题")
    private String subTitle;

    @ApiModelProperty("文章全标题")
    private String fullTitle;

    @ApiModelProperty("文章别称")
    private String alias;

    @ApiModelProperty("关键字")
    private String seoKeywords;

    @ApiModelProperty("摘要")
    private String seoDescription;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("编辑")
    private String editor;

    @ApiModelProperty("来源")
    private String source;

    @ApiModelProperty("封面图片")
    private String imageUrl;

    @ApiModelProperty("视频地址")
    private String videoUrl;

    @ApiModelProperty("视频时长")
    private String videoDuration;

    @ApiModelProperty("图片集")
    private String imageList;

    @ApiModelProperty("正文")
    private String textContent;
}

