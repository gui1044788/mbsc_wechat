package com.xhsd.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Data
@ApiModel(description = "住院登记信息请求form")
@XStreamAlias("root")
public class SpPatInfoForm {
    @ApiModelProperty("患者姓名")
    @Size(max = 40,message = "患者姓名长度不能超过40")
    private String brxm;

    @ApiModelProperty("患者性别")
    @Size(max = 4,message = "患者性别长度不能超过4")
    private String brxb;

    @ApiModelProperty("出生年月")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String csny;

    @ApiModelProperty("身份证号")
    @Size(max = 20,message = "身份证号长度不能超过20")
    private String sfzh;

    @ApiModelProperty("国籍代码")
    @Size(max = 4,message = "国籍代码长度不能超过4")
    private String gjdm;

    @ApiModelProperty("民族代码")
    @Size(max = 4,message = "民族代码长度不能超过4")
    private String mzdm;

    @ApiModelProperty("婚姻状况")
    @Size(max = 4,message = "民族代码长度不能超过4")
    private String hyzk;

    @ApiModelProperty("职业代码")
    @Size(max = 4,message = "职业代码长度不能超过4")
    private String zydm;

    @ApiModelProperty("籍贯名称")
    @Size(max = 30,message = "籍贯名称长度不能超过30")
    private String jgmc;

    @ApiModelProperty("籍贯代码_省")
    @Size(max = 18,message = "籍贯代码_省长度不能超过18")
    @XStreamAlias("jgdm_sqs")
    private String jgdmSqs;

    @ApiModelProperty("籍贯代码_市")
    @Size(max = 18,message = "籍贯代码_市长度不能超过18")
    @XStreamAlias("jgdm_s")
    private String jgdmS;

    @ApiModelProperty("户口地址")
    @Size(max = 300,message = "户口地址长度不能超过300")
    private String hkdz;

    @ApiModelProperty("户口地址_省")
    @Size(max = 18,message = "户口地址_省长度不能超过18")
    @XStreamAlias("hkdz_sqs")
    private String hkdzSqs;

    @ApiModelProperty("户口地址_市")
    @Size(max = 18,message = "户口地址_市长度不能超过18")
    @XStreamAlias("hkdz_s")
    private String hkdzS;

    @ApiModelProperty("户口地址_县")
    @Size(max = 18,message = "户口地址_县长度不能超过18")
    @XStreamAlias("hkdz_x")
    private String hkdzX;

    @ApiModelProperty("户口地址_其他地址")
    @Size(max = 150,message = "户口地址_其他地址长度不能超过150")
    @XStreamAlias("hkdz_qtdz")
    private String hkdzQtdz;

    @ApiModelProperty("户口电话")
    @Size(max = 20,message = "户口电话长度不能超过20")
    private String hkdh;

    @ApiModelProperty("户口邮编")
    @Size(max = 6,message = "户口邮编长度不能超过6")
    private String hkyb;

    @ApiModelProperty("出生地址")
    @Size(max = 300,message = "出生地址长度不能超过300")
    private String csd;

    @ApiModelProperty("出生地址_省")
    @Size(max = 18,message = "出生地址_省长度不能超过18")
    @XStreamAlias("csd_sqs")
    private String csdSqs;

    @ApiModelProperty("出生地址_市")
    @Size(max = 18,message = "出生地址_市长度不能超过18")
    @XStreamAlias("csd_s")
    private String csdS;

    @ApiModelProperty("出生地址_县")
    @Size(max = 18,message = "出生地址_县长度不能超过18")
    @XStreamAlias("csd_x")
    private String csdX;

    @ApiModelProperty("现住址")
    @Size(max = 300,message = "现住址长度不能超过300")
    private String xzz;

    @ApiModelProperty("现住址_省")
    @Size(max = 18,message = "现住址_省长度不能超过18")
    @XStreamAlias("xzz_sqs")
    private String xzzSqs;

    @ApiModelProperty("现住址_市")
    @Size(max = 18,message = "现住址_市长度不能超过18")
    @XStreamAlias("xzz_s")
    private String xzzS;

    @ApiModelProperty("现住址_县")
    @Size(max = 18,message = "现住址_县长度不能超过18")
    @XStreamAlias("xzz_x")
    private String xzzX;

    @ApiModelProperty("现住址_其他地址")
    @Size(max = 150,message = "现住址_其他地址长度不能超过150")
    @XStreamAlias("xzz_qtdz")
    private String xzzQtdz;

    @ApiModelProperty("现住址_邮编")
    @Size(max = 6,message = "现住址_邮编长度不能超过6")
    @XStreamAlias("xzz_yb")
    private String xzzYb;

    @ApiModelProperty("现住址_电话")
    @Size(max = 20,message = "现住址_电话长度不能超过20")
    @XStreamAlias("xzz_dh")
    private String xzzDh;

    @ApiModelProperty("工作单位")
    @Size(max = 300,message = "工作单位长度不能超过300")
    private String gzdw;

    @ApiModelProperty("工作单位电话")
    @Size(max = 20,message = "工作单位长度不能超过20")
    private String dwdh;

    @ApiModelProperty("工作单位邮编")
    @Size(max = 6,message = "工作单位邮编长度不能超过6")
    private String dwyb;

    @ApiModelProperty("联系人名")
    @Size(max = 30,message = "联系人名长度不能超过30")
    private String lxrm;

    @ApiModelProperty("联系人关系")
    @Size(max = 4,message = "联系人关系长度不能超过4")
    private String lxgx;

    @ApiModelProperty("联系人地址")
    @Size(max = 300,message = "联系人地址长度不能超过300")
    private String lxdz;

    @ApiModelProperty("联系人电话")
    @Size(max = 20,message = "联系人地址长度不能超过20")
    private String lxdh;


}
