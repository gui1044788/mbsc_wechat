package com.xhsd.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;

@Data
@ApiModel(description = "住院登记信息请求form")
@XStreamAlias("root")
public class SpPatInfoForm {
    @ApiModelProperty("患者姓名")
    @Max(40)
    private String brxm;

    @ApiModelProperty("患者性别")
    @Max(4)
    private String brxb;

    @ApiModelProperty("出生年月")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String csny;

    @ApiModelProperty("身份证号")
    @Max(20)
    private String sfzh;

    @ApiModelProperty("国籍代码")
    @Max(4)
    private String gjdm;

    @ApiModelProperty("民族代码")
    @Max(4)
    private String mzdm;

    @ApiModelProperty("婚姻状况")
    @Max(4)
    private String hyzk;

    @ApiModelProperty("职业代码")
    @Max(4)
    private String zydm;

    @ApiModelProperty("籍贯名称")
    @Max(30)
    private String jgmc;

    @ApiModelProperty("籍贯代码_省")
    @Max(18)
    @XStreamAlias("jgdm_sqs")
    private String jgdmSqs;

    @ApiModelProperty("籍贯代码_市")
    @Max(18)
    @XStreamAlias("jgdm_s")
    private String jgdmS;

    @ApiModelProperty("户口地址")
    @Max(300)
    private String hkdz;

    @ApiModelProperty("户口地址_省")
    @Max(18)
    @XStreamAlias("hkdz_sqs")
    private String hkdzSqs;

    @ApiModelProperty("户口地址_市")
    @Max(18)
    @XStreamAlias("hkdz_s")
    private String hkdzS;

    @ApiModelProperty("户口地址_县")
    @Max(18)
    @XStreamAlias("hkdz_x")
    private String hkdzX;

    @ApiModelProperty("户口地址_其他地址")
    @Max(150)
    @XStreamAlias("hkdz_qtdz")
    private String hkdzQtdz;

    @ApiModelProperty("户口电话")
    @Max(20)
    private String hkdh;

    @ApiModelProperty("户口邮编")
    @Max(6)
    private String hkyb;

    @ApiModelProperty("出生地址")
    @Max(300)
    private String csd;

    @ApiModelProperty("出生地址_省")
    @Max(18)
    @XStreamAlias("csd_sqs")
    private String csdSqs;

    @ApiModelProperty("出生地址_市")
    @Max(18)
    @XStreamAlias("csd_s")
    private String csdS;

    @ApiModelProperty("出生地址_县")
    @Max(18)
    @XStreamAlias("csd_x")
    private String csdX;

    @ApiModelProperty("现住址")
    @Max(300)
    private String xzz;

    @ApiModelProperty("现住址_省")
    @Max(18)
    @XStreamAlias("xzz_sqs")
    private String xzzSqs;

    @ApiModelProperty("现住址_市")
    @Max(18)
    @XStreamAlias("xzz_s")
    private String xzzS;

    @ApiModelProperty("现住址_县")
    @Max(18)
    @XStreamAlias("xzz_x")
    private String xzzX;

    @ApiModelProperty("现住址_其他地址")
    @Max(150)
    @XStreamAlias("xzz_qtdz")
    private String xzzQtdz;

    @ApiModelProperty("现住址_邮编")
    @Max(6)
    @XStreamAlias("xzz_yb")
    private String xzzYb;

    @ApiModelProperty("现住址_电话")
    @Max(20)
    @XStreamAlias("xzz_dh")
    private String xzzDh;

    @ApiModelProperty("工作单位")
    @Max(300)
    private String gzdw;

    @ApiModelProperty("工作单位电话")
    @Max(20)
    private String dwdh;

    @ApiModelProperty("工作单位邮编")
    @Max(6)
    private String dwyb;

    @ApiModelProperty("联系人名")
    @Max(30)
    private String lxrm;

    @ApiModelProperty("联系人关系")
    @Max(4)
    private String lxgx;

    @ApiModelProperty("联系人地址")
    @Max(300)
    private String lxdz;

    @ApiModelProperty("联系人电话")
    @Max(20)
    private String lxdh;


}
