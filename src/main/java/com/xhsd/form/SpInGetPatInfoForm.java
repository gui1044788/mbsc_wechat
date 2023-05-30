package com.xhsd.form;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "查询住院登记信息请求form")
@XStreamAlias("root")
public class SpInGetPatInfoForm {

    @ApiModelProperty("患者姓名")
    private String brxm;
    @ApiModelProperty("身份证号码")
    private String sfzh;

}
