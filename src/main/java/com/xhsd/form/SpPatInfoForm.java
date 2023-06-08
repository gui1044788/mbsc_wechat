package com.xhsd.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Size;

@Data
@ApiModel(description = "住院登记信息请求form")
@XStreamAlias("root")
public class SpPatInfoForm {
    @ApiModelProperty("患者姓名")
    private String brxm;

    @ApiModelProperty("患者性别")
    private String brxb;

    @ApiModelProperty("出生年月")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String csny;

    @ApiModelProperty("身份证号")
    private String sfzh;

    @ApiModelProperty("国籍代码")
    private String gjdm;

    @ApiModelProperty("民族代码")
    private String mzdm;

    @ApiModelProperty("婚姻状况")
    private String hyzk;

    @ApiModelProperty("职业代码")
    private String zydm;

    @ApiModelProperty("籍贯名称")
    private String jgmc;

    @ApiModelProperty("籍贯代码_省")
    @XStreamAlias("jgdm_sqs")
    private String jgdmSqs;

    @ApiModelProperty("籍贯代码_市")
    @XStreamAlias("jgdm_s")
    private String jgdmS;

    @ApiModelProperty("户口地址")
    private String hkdz;

    @ApiModelProperty("户口地址_省")
    @XStreamAlias("hkdz_sqs")
    private String hkdzSqs;

    @ApiModelProperty("户口地址_市")
    @XStreamAlias("hkdz_s")
    private String hkdzS;

    @ApiModelProperty("户口地址_县")
    @XStreamAlias("hkdz_x")
    private String hkdzX;

    @ApiModelProperty("户口地址_其他地址")
    @XStreamAlias("hkdz_qtdz")
    private String hkdzQtdz;

    @ApiModelProperty("户口电话")
    private String hkdh;

    @ApiModelProperty("户口邮编")
    private String hkyb;

    @ApiModelProperty("出生地址")
    private String csd;

    @ApiModelProperty("出生地址_省")
    @XStreamAlias("csd_sqs")
    private String csdSqs;

    @ApiModelProperty("出生地址_市")
    @XStreamAlias("csd_s")
    private String csdS;

    @ApiModelProperty("出生地址_县")
    @XStreamAlias("csd_x")
    private String csdX;

    @ApiModelProperty("现住址")
    private String xzz;

    @ApiModelProperty("现住址_省")
    @XStreamAlias("xzz_sqs")
    private String xzzSqs;

    @ApiModelProperty("现住址_市")
    @XStreamAlias("xzz_s")
    private String xzzS;

    @ApiModelProperty("现住址_县")
    @XStreamAlias("xzz_x")
    private String xzzX;

    @ApiModelProperty("现住址_街道")
    @XStreamAlias("xzz_jd")
    private String xzzJd;

    @ApiModelProperty("现住址_其他地址")
    @XStreamAlias("xzz_qtdz")
    private String xzzQtdz;

    @ApiModelProperty("现住址_邮编")
    @XStreamAlias("xzz_yb")
    private String xzzYb;

    @ApiModelProperty("现住址_电话")
    @XStreamAlias("xzz_dh")
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
    private String lxgx;

    @ApiModelProperty("联系人地址")
    private String lxdz;

    @ApiModelProperty("联系人电话")
    private String lxdh;


}
