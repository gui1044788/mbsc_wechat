package com.xhsd.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel(value = "公共键值返回DTO", description = "公共键值返回DTO")
public class CommonResultDto {

    @ApiModelProperty("编码")
    private String code;
    @ApiModelProperty("信息")
    private String msg;

}
