package com.xhsd.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * (YsMzJzls)表实体类
 *
 * @author guijun
 * @since 2023-06-06 10:45:58
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description = "")
@SuppressWarnings("serial")
public class YsMzJzls extends Model<YsMzJzls> implements Serializable {
    private static final long serialVersionUID = 112622836935793544L;

    @ApiModelProperty("")
    private BigDecimal jzxh;

    @ApiModelProperty("")
    private BigDecimal ghxh;

    @ApiModelProperty("")
    private BigDecimal brbh;

    @ApiModelProperty("")
    private BigDecimal ksdm;

    @ApiModelProperty("")
    private String ysdm;

    @ApiModelProperty("")
    private BigDecimal zyzd;

    @ApiModelProperty("")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String kssj;

    @ApiModelProperty("")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String jssj;

    @ApiModelProperty("1 诊中 2 挂起 9 结束就诊")
    private BigDecimal jzzt;

    @ApiModelProperty("")
    private BigDecimal yyxh;

    @ApiModelProperty("")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String fzrq;

    @ApiModelProperty("")
    private BigDecimal ghfz;

    @ApiModelProperty("就诊类型:1住院病人 2新生儿 3门诊病人 4急诊病人 5留观病人 7核酸检测人  DICT901")
    private int jzlx;

    @ApiModelProperty("陪伴者姓名")
    private String pbzxm;

    @ApiModelProperty("陪伴者关系:取GY_DMZD.DMLB=4。")
    private BigDecimal pbzgx;

    @ApiModelProperty("陪伴者电话")
    private String pbzdh;

    @ApiModelProperty("陪伴者地址")
    private String pbzdz;

    @ApiModelProperty("陪伴者单位")
    private String pbzdw;

    @ApiModelProperty("主要诊断名称")
    private String zdmc;

    @ApiModelProperty("初诊判别")
    private BigDecimal czpb;

    @ApiModelProperty("目前诊断")
    private String mqzd;

    @ApiModelProperty("")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String blcjsj;

    @ApiModelProperty("1.是 0.否")
    private BigDecimal jzqjbz;

    @ApiModelProperty("1.是 0.否")
    private BigDecimal jzqjswbz;

    @ApiModelProperty("患者体重")
    private Double brtz;

    @ApiModelProperty("医保预结标志")
    private BigDecimal ybyj;

    @ApiModelProperty("")
    private String bzxx;

    @ApiModelProperty("")
    private BigDecimal ssy;

    @ApiModelProperty("")
    private BigDecimal szy;

    @ApiModelProperty("")
    private BigDecimal mb;

    @ApiModelProperty("")
    private BigInteger yqdybz;

    @ApiModelProperty("")
    private BigDecimal lstd;

    @ApiModelProperty("")
    private BigDecimal zqwjid;

    @ApiModelProperty("")
    private BigDecimal tzbs;

    @ApiModelProperty("")
    private String sylb;

    @ApiModelProperty("")
    private String sysslb;

    @ApiModelProperty("")
    private BigDecimal ldjlxh;
}

