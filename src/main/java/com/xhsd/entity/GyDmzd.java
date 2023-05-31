package com.xhsd.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (GyDmzd)表实体类
 *
 * @author guijun
 * @since 2023-05-31 11:06:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description = "")
@SuppressWarnings("serial")
public class GyDmzd extends Model<GyDmzd> implements Serializable {
    private static final long serialVersionUID = -53911019929737071L;

    @ApiModelProperty("标志不同类别的代码")
    private BigDecimal dmlb;

    @ApiModelProperty("代码识别序号, 大于0为代码识别序号, 小于等于0为代码类别说明")
    private String dmsb;

    @ApiModelProperty("")
    private String srdm;

    @ApiModelProperty("")
    private String dmmc;

    @ApiModelProperty("")
    private String bzbm;

    @ApiModelProperty("")
    private String mpicode;

    @ApiModelProperty("")
    private BigDecimal lxzt;

    @ApiModelProperty("")
    private BigDecimal zfpb;

    @ApiModelProperty("")
    private BigDecimal plxh;

    @ApiModelProperty("")
    private String bzxx;
}

