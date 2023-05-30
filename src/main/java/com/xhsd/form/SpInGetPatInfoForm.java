package com.xhsd.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "查询住院登记信息请求form")
public class SpInGetPatInfoForm {

    @ApiModelProperty("患者姓名")
    private String patName;
    @ApiModelProperty("身份证号码")
    private String idCard;

}
