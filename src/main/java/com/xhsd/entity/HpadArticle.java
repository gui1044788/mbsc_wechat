package com.xhsd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 推送文章表(HpadArticle)表实体类
 *
 * @author guijun
 * @since 2023-06-25 15:06:02
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description = "")
@SuppressWarnings("serial")
public class HpadArticle extends Model<HpadArticle> implements Serializable {
    private static final long serialVersionUID = 933870769547271487L;

    @ApiModelProperty("序列号")
    private BigDecimal id;

    @ApiModelProperty("站点id")
    private String siteId;

    @ApiModelProperty("机构ID")
    private String orgId;

    @ApiModelProperty("栏目ID")
    private String channelId;

    @ApiModelProperty("内容类型")
    private String contentType;

    @ApiModelProperty("定时下线:Y:是,N:否")
    private String repealQuartz;

    @ApiModelProperty("文章类型")
    private String articleType;

    @ApiModelProperty("文章子类型")
    private String articleSubType;

    @ApiModelProperty("文章状态(0:已发布,1:已归档,5:待发布,10:草稿,11:待审核,12:审核中,20:已删除,21:已下线,22:已退回)")
    private String state;

    @ApiModelProperty("所属科室")
    private String department;

    @ApiModelProperty("置顶:Y:是,N:否")
    private String sticky;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("更新人")
    private String updateUser;

    @ApiModelProperty("更新时间")
    private String updateTime;
}

