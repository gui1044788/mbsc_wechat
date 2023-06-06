package com.xhsd.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * (YsMzJzls)表实体类
 *
 * @author guijun
 * @since 2023-06-06 10:45:58
 */
@Data
@ApiModel(description = "")
public class YsMzJzlsDto {

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

    @ApiModelProperty("就诊类型:1住院病人 2新生儿 3门诊病人 4急诊病人 5留观病人 7核酸检测人  DICT901")
    private int jzlx;

    @ApiModelProperty("主要诊断名称")
    private String zdmc;

    @ApiModelProperty("初诊判别")
    private BigDecimal czpb;

    @ApiModelProperty("目前诊断")
    private String mqzd;

    @ApiModelProperty("1.是 0.否")
    private BigDecimal jzqjbz;

    @ApiModelProperty("1.是 0.否")
    private BigDecimal jzqjswbz;

    @ApiModelProperty("患者体重")
    private Double brtz;

    @ApiModelProperty("医保预结标志")
    private BigDecimal ybyj;

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

}

