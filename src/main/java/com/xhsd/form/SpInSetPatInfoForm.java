package com.xhsd.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "住院登记信息请求form")
public class SpInSetPatInfoForm {
    @ApiModelProperty("资料ID")
    private BigDecimal zlid;
    @ApiModelProperty("患者姓名")
    private String brxm;
    @ApiModelProperty("患者性别")
    private BigDecimal brxb;
    @ApiModelProperty("出生年月")
    private String csny;
    @ApiModelProperty("身份证号")
    private String sfzh;
    @ApiModelProperty("国籍代码")
    private BigDecimal gjdm;
    @ApiModelProperty("民族代码")
    private BigDecimal mzdm;
    @ApiModelProperty("婚姻状况")
    private BigDecimal hyzk;
    @ApiModelProperty("职业代码")
    private BigDecimal zydm;
    @ApiModelProperty("籍贯名称")
    private String jgmc;
    @ApiModelProperty("籍贯代码_省")
    private BigDecimal jgdmSqs;
    @ApiModelProperty("籍贯代码_市")
    private BigDecimal jgdmS;
    @ApiModelProperty("户口地址")
    private String hkdz;
    @ApiModelProperty("户口地址_省")
    private BigDecimal hkdzSqs;
    @ApiModelProperty("户口地址_市")
    private BigDecimal hkdzS;
    @ApiModelProperty("户口地址_县")
    private BigDecimal hkdzX;
    @ApiModelProperty("户口地址_其他地址")
    private String hkdzQtdz;
    @ApiModelProperty("户口电话")
    private String hkdh;
    @ApiModelProperty("户口邮编")
    private String hkyb;
    @ApiModelProperty("出生地址")
    private String csd;
    @ApiModelProperty("出生地址_省")
    private BigDecimal csdSqs;
    @ApiModelProperty("出生地址_市")
    private BigDecimal csdS;
    @ApiModelProperty("出生地址_县")
    private BigDecimal csdX;
    @ApiModelProperty("现住址")
    private String xzz;
    @ApiModelProperty("现住址_省")
    private BigDecimal xzzSqs;
    @ApiModelProperty("现住址_市")
    private BigDecimal xzzS;
    @ApiModelProperty("现住址_县")
    private BigDecimal xzzX;
    @ApiModelProperty("现住址_其他地址")
    private String xzzQtdz;
    @ApiModelProperty("现住址_邮编")
    private String xzzYb;
    @ApiModelProperty("现住址_电话")
    private String xzzDh;
    @ApiModelProperty("工作单位")
    private String gzdw;
    @ApiModelProperty("工作单位电话")
    private String dwdh;
    @ApiModelProperty("工作单位邮编")
    private String dwyb;
    @ApiModelProperty("联系人名")
    private String lxrm;
    @ApiModelProperty("联系人关系")
    private BigDecimal lxgx;
    @ApiModelProperty("联系人地址")
    private String lxdz;
    @ApiModelProperty("联系人电话")
    private String lxdh;
    @ApiModelProperty("最后修改时间")
    private String zhxgsj;
    @ApiModelProperty("临时变量")
    private BigDecimal count;


}
