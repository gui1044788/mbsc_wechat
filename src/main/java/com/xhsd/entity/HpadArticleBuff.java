package com.xhsd.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 推送文章状态表(HpadArticleBuff)表实体类
 *
 * @author guijun
 * @since 2023-06-25 15:19:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description = "")
@SuppressWarnings("serial")
public class HpadArticleBuff extends Model<HpadArticleBuff> implements Serializable {
    private static final long serialVersionUID = -29834160731933344L;

    @ApiModelProperty("文章表id")
    private BigDecimal articleId;

    @ApiModelProperty("阅读次数")
    private String views;

    @ApiModelProperty("阅读次数(天)")
    private String dayViews;

    @ApiModelProperty("阅读次数(周)")
    private String weekViews;

    @ApiModelProperty("阅读次数(月)")
    private String monthViews;

    @ApiModelProperty("发布时间")
    private String onlineDate;

    @ApiModelProperty("下线时间")
    private String offlineDate;

    @ApiModelProperty("置顶时间")
    private String stickyDate;
}

