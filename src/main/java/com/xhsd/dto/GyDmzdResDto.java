package com.xhsd.dto;

import com.xhsd.entity.GyDmzd;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


@Data
@ApiModel(description = "公共字典项统一返回DTO")
public class GyDmzdResDto {
    @ApiModelProperty("国籍列表")
    private List<GyDmzd> countrys;
    @ApiModelProperty("民族列表")
    private List<GyDmzd> nations;
    @ApiModelProperty("关系列表")
    private List<GyDmzd> relations;
    @ApiModelProperty("职业列表")
    private List<GyDmzd> jobs;
    @ApiModelProperty("婚姻状态")
    private List<GyDmzd> maritalStatus;
}
