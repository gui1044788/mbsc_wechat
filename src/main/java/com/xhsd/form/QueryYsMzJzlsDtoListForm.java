package com.xhsd.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@ApiModel(description = "查询患者记信息请求form")
public class QueryYsMzJzlsDtoListForm {

    @ApiModelProperty("患者姓名")
    private String brxm;

    @ApiModelProperty(value = "身份证号码",required = true)
    @NotEmpty(message = "身份号不能为空")
    private String sfzh;

}
