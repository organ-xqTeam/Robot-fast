package com.ruoyi.share.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 机器设备申请对象 robot_device_apply
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
public class RobotDeviceApply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 申请名称 */
    @Excel(name = "申请名称")
    private String applyName;

    /** 公司信息 */
    @Excel(name = "公司信息")
    private String companyInfo;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 其他说明 */
    @Excel(name = "其他说明")
    private String explainContent;

    /** 申请表的id */
    @Excel(name = "申请表的id")
    private Long deviceId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /** 是否删除 0未删除 1已删除 */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setApplyName(String applyName) 
    {
        this.applyName = applyName;
    }

    public String getApplyName() 
    {
        return applyName;
    }
    public void setCompanyInfo(String companyInfo) 
    {
        this.companyInfo = companyInfo;
    }

    public String getCompanyInfo() 
    {
        return companyInfo;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setExplainContent(String explainContent) 
    {
        this.explainContent = explainContent;
    }

    public String getExplainContent() 
    {
        return explainContent;
    }
    public void setDeviceId(Long deviceId) 
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setUpdateDate(Date updateDate) 
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() 
    {
        return updateDate;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("applyName", getApplyName())
            .append("companyInfo", getCompanyInfo())
            .append("phone", getPhone())
            .append("explainContent", getExplainContent())
            .append("deviceId", getDeviceId())
            .append("userId", getUserId())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
