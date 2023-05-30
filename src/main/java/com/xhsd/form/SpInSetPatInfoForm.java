package com.xhsd.form;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "新增住院登记信息请求form")
public class SpInSetPatInfoForm {

    @ApiModelProperty("")
    private String msgBody;
    @ApiModelProperty("")
    private String retValue;
    @ApiModelProperty("")
    private String retDesc;

}
