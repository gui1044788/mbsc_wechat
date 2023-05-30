package com.xhsd.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * (com.xhsd.entity.ZyHzzl)表实体类
 *
 * @author guijun
 * @since 2023-05-29 16:30:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description = "")
@SuppressWarnings("serial")
public class ZyHzzl extends Model<ZyHzzl> implements Serializable {
    private static final long serialVersionUID = 213685817841694075L;

    @ApiModelProperty("")
    private BigDecimal zlid;

    @ApiModelProperty("")
    private String brxm;

    @ApiModelProperty("")
    private BigDecimal brxb;

    @ApiModelProperty("")
    private Date csny;

    @ApiModelProperty("")
    private String sfzh;

    @ApiModelProperty("")
    private BigDecimal gjdm;

    @ApiModelProperty("")
    private BigDecimal mzdm;

    @ApiModelProperty("")
    private BigDecimal hyzk;

    @ApiModelProperty("")
    private BigDecimal zydm;

    @ApiModelProperty("")
    private String jgmc;

    @ApiModelProperty("")
    private BigDecimal jgdmSqs;

    @ApiModelProperty("")
    private BigDecimal jgdmS;

    @ApiModelProperty("")
    private String hkdz;

    @ApiModelProperty("")
    private BigDecimal hkdzSqs;

    @ApiModelProperty("")
    private BigDecimal hkdzS;

    @ApiModelProperty("")
    private BigDecimal hkdzX;

    @ApiModelProperty("")
    private String hkdzQtdz;

    @ApiModelProperty("")
    private String hkdh;

    @ApiModelProperty("")
    private String hkyb;

    @ApiModelProperty("")
    private String csd;

    @ApiModelProperty("")
    private BigDecimal csdSqs;

    @ApiModelProperty("")
    private BigDecimal csdS;

    @ApiModelProperty("")
    private BigDecimal csdX;

    @ApiModelProperty("")
    private String xzz;

    @ApiModelProperty("")
    private BigDecimal xzzSqs;

    @ApiModelProperty("")
    private BigDecimal xzzS;

    @ApiModelProperty("")
    private BigDecimal xzzX;

    @ApiModelProperty("")
    private String xzzQtdz;

    @ApiModelProperty("")
    private String xzzYb;

    @ApiModelProperty("")
    private String xzzDh;

    @ApiModelProperty("")
    private String gzdw;

    @ApiModelProperty("")
    private String dwdh;

    @ApiModelProperty("")
    private String dwyb;

    @ApiModelProperty("")
    private String lxrm;

    @ApiModelProperty("")
    private BigDecimal lxgx;

    @ApiModelProperty("")
    private String lxdz;

    @ApiModelProperty("")
    private String lxdh;

    @ApiModelProperty("")
    private Date zhxgsj;
}

