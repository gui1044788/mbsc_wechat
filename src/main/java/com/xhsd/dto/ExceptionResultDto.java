package com.xhsd.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel(value = "异常键值返回DTO", description = "异常键值返回DTO")
public class ExceptionResultDto {

    @ApiModelProperty("错误编码")
    private String errorCode;
    @ApiModelProperty("错误信息")
    private String errorMsg;

}
