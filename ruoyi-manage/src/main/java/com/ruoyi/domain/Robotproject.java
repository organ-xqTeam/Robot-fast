package com.ruoyi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 robotproject
 * 
 * @author ruoyi
 * @date 2019-12-30
 */
public class Robotproject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 项目编号 */
    @Excel(name = "项目编号")
    private String num;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String name;

    /** 项目类型(大类) */
    @Excel(name = "项目类型(大类)")
    private String type1;

    /** 项目类型(小类) */
    @Excel(name = "项目类型(小类)")
    private String type2;
    
    private String type2_;
    
    public String getType2_() {
		return type2_;
	}

	public void setType2_(String type2_) {
		this.type2_ = type2_;
	}
	
    private String type3;
    
    public String getType3() {
		return type3;
	}

	public void setType3(String type3) {
		this.type3 = type3;
	}

	/** 项目状态 */
    @Excel(name = "项目状态")
    private String state;

    /** 审批时间 */
    @Excel(name = "审批时间")
    private String approvaltime;

    /** 审批状态：1未审批2通过3驳回 */
    @Excel(name = "审批状态：1未审批2通过3驳回")
    private String approvalstatus;

    /** 申请时间 */
    @Excel(name = "申请时间")
    private String applytime;

    /** 申请账号 */
    @Excel(name = "申请账号")
    private String applyid;

    /** 申请人 */
    @Excel(name = "申请人")
    private String applyperson;

    /** 公司信息 */
    @Excel(name = "公司信息")
    private String companyinfo;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String telephone;

    /** 其它说明 */
    @Excel(name = "其它说明")
    private String otherexplain;

    /** 申请表 */
    @Excel(name = "申请表")
    private String applyfile;

    /** $column.columnComment */
    @Excel(name = "申请表")
    private String applyfilename;

    /** 受理通知 */
    @Excel(name = "受理通知")
    private String acceptancefile;

    /** $column.columnComment */
    @Excel(name = "受理通知")
    private String acceptancefilename;

    /** 评价决定表 */
    @Excel(name = "评价决定表")
    private String evaluatefile;

    /** $column.columnComment */
    @Excel(name = "评价决定表")
    private String evaluatefilename;

    /** 证书 */
    @Excel(name = "证书")
    private String certificatefile;

    /** $column.columnComment */
    @Excel(name = "证书")
    private String certificatefilename;

    /** 评估资料 */
    @Excel(name = "评估资料")
    private String assessmentfile;

    /** $column.columnComment */
    @Excel(name = "评估资料")
    private String assessmentfilename;
    
    /** 是否更新 */
    @Excel(name = "是否更新")
    private String deleteFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNum(String num) 
    {
        this.num = num;
    }

    public String getNum() 
    {
        return num;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType1(String type1) 
    {
        this.type1 = type1;
    }

    public String getType1() 
    {
        return type1;
    }
    public void setType2(String type2) 
    {
        this.type2 = type2;
    }

    public String getType2() 
    {
        return type2;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setApprovaltime(String approvaltime) 
    {
        this.approvaltime = approvaltime;
    }

    public String getApprovaltime() 
    {
        return approvaltime;
    }
    public void setApprovalstatus(String approvalstatus) 
    {
        this.approvalstatus = approvalstatus;
    }

    public String getApprovalstatus() 
    {
        return approvalstatus;
    }
    public void setApplytime(String applytime) 
    {
        this.applytime = applytime;
    }

    public String getApplytime() 
    {
        return applytime;
    }
    public void setApplyid(String applyid) 
    {
        this.applyid = applyid;
    }

    public String getApplyid() 
    {
        return applyid;
    }
    public void setApplyperson(String applyperson) 
    {
        this.applyperson = applyperson;
    }

    public String getApplyperson() 
    {
        return applyperson;
    }
    public void setCompanyinfo(String companyinfo) 
    {
        this.companyinfo = companyinfo;
    }

    public String getCompanyinfo() 
    {
        return companyinfo;
    }
    public void setTelephone(String telephone) 
    {
        this.telephone = telephone;
    }

    public String getTelephone() 
    {
        return telephone;
    }
    public void setOtherexplain(String otherexplain) 
    {
        this.otherexplain = otherexplain;
    }

    public String getOtherexplain() 
    {
        return otherexplain;
    }
    public void setApplyfile(String applyfile) 
    {
        this.applyfile = applyfile;
    }

    public String getApplyfile() 
    {
        return applyfile;
    }
    public void setApplyfilename(String applyfilename) 
    {
        this.applyfilename = applyfilename;
    }

    public String getApplyfilename() 
    {
        return applyfilename;
    }
    public void setAcceptancefile(String acceptancefile) 
    {
        this.acceptancefile = acceptancefile;
    }

    public String getAcceptancefile() 
    {
        return acceptancefile;
    }
    public void setAcceptancefilename(String acceptancefilename) 
    {
        this.acceptancefilename = acceptancefilename;
    }

    public String getAcceptancefilename() 
    {
        return acceptancefilename;
    }
    public void setEvaluatefile(String evaluatefile) 
    {
        this.evaluatefile = evaluatefile;
    }

    public String getEvaluatefile() 
    {
        return evaluatefile;
    }
    public void setEvaluatefilename(String evaluatefilename) 
    {
        this.evaluatefilename = evaluatefilename;
    }

    public String getEvaluatefilename() 
    {
        return evaluatefilename;
    }
    public void setCertificatefile(String certificatefile) 
    {
        this.certificatefile = certificatefile;
    }

    public String getCertificatefile() 
    {
        return certificatefile;
    }
    public void setCertificatefilename(String certificatefilename) 
    {
        this.certificatefilename = certificatefilename;
    }

    public String getCertificatefilename() 
    {
        return certificatefilename;
    }
    
    public String getAssessmentfile() {
		return assessmentfile;
	}

	public void setAssessmentfile(String assessmentfile) {
		this.assessmentfile = assessmentfile;
	}

	public String getAssessmentfilename() {
		return assessmentfilename;
	}

	public void setAssessmentfilename(String assessmentfilename) {
		this.assessmentfilename = assessmentfilename;
	}

	public void setDeleteFlag(String deleteFlag) 
    {
        this.deleteFlag = deleteFlag;
    }

    public String getDeleteFlag() 
    {
        return deleteFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("num", getNum())
            .append("name", getName())
            .append("type1", getType1())
            .append("type2", getType2())
            .append("state", getState())
            .append("approvaltime", getApprovaltime())
            .append("approvalstatus", getApprovalstatus())
            .append("applytime", getApplytime())
            .append("applyid", getApplyid())
            .append("applyperson", getApplyperson())
            .append("companyinfo", getCompanyinfo())
            .append("telephone", getTelephone())
            .append("otherexplain", getOtherexplain())
            .append("applyfile", getApplyfile())
            .append("applyfilename", getApplyfilename())
            .append("acceptancefile", getAcceptancefile())
            .append("acceptancefilename", getAcceptancefilename())
            .append("evaluatefile", getEvaluatefile())
            .append("evaluatefilename", getEvaluatefilename())
            .append("certificatefile", getCertificatefile())
            .append("certificatefilename", getCertificatefilename())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
