package com.xhsd.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * (YsMzJzls)表实体类
 *
 * @author guijun
 * @since 2023-06-06 10:45:58
 */
@Data
@ApiModel(description = "")
public class YsMzJzlsDto {
    @ApiModelProperty("就诊序号")
    private String jzxh;
    @ApiModelProperty("就诊日期")
    private String kssj;
    @ApiModelProperty("就诊科室")
    private String ksmc;
    @ApiModelProperty("看诊医生")
    private String ygxm;
    @ApiModelProperty("门诊号码")
    private String mzhm;
    @ApiModelProperty("姓名")
    private String brxm;
}

