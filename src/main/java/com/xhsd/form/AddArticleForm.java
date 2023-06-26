package com.xhsd.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel(description = "新增文章Form")
public class AddArticleForm {
    @ApiModelProperty("站点id")
    private String siteId;

    @ApiModelProperty("机构ID")
    private String orgId;

    @ApiModelProperty("栏目ID")
    private String channelId;

    @ApiModelProperty("文章标题")
    private String title;

    @ApiModelProperty("文章副标题")
    private String subTitle;

    @ApiModelProperty("文章别称")
    private String alias;

    @ApiModelProperty("关键字")
    private String seoKeywords;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("编辑")
    private String editor;

    @ApiModelProperty("来源")
    private String source;

    @ApiModelProperty("封面图片")
    private String imageUrl;

    @ApiModelProperty("图片集")
    private String imageList;

    @ApiModelProperty("视频地址")
    private String videoUrl;

    @ApiModelProperty("正文")
    private String textContent;

    @ApiModelProperty("内容类型")
    private String contentType;

    @ApiModelProperty("定时下线:Y:是,N:否")
    private String repealQuartz;

    @ApiModelProperty("文章类型")
    private String articleType;

    @ApiModelProperty("文章子类型")
    private String articleSubType;

    @ApiModelProperty("所属科室")
    private String department;

    @ApiModelProperty("创建人")
    private String createUser;
}
