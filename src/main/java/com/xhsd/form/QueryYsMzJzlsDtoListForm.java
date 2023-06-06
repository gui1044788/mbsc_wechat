package com.xhsd.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

@Data
@ApiModel(description = "查询患者记信息请求form")
public class QueryYsMzJzlsDtoListForm {

    @ApiModelProperty("患者姓名")
    @NonNull
    private String brxm;
    @ApiModelProperty("身份证号码")
    @NonNull
    private String sfzh;

}
