package com.xhsd.dto;

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
@Data
@ApiModel(description = "")
public class GyDmzdDto{

    @ApiModelProperty("标志不同类别的代码")
    private BigDecimal dmlb;

    @ApiModelProperty("代码识别序号, 大于0为代码识别序号, 小于等于0为代码类别说明")
    private String dmsb;

    @ApiModelProperty("输入代码")
    private String srdm;

    @ApiModelProperty("代码名称")
    private String dmmc;

    @ApiModelProperty("备注编码")
    private String bzbm;

}

