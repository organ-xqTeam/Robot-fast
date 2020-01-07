package com.ruoyi.share.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 需求信息对象 robot_need_submit
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
public class RobotNeedSubmit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String name;

    /** 截止时间 */
    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String modelNumber;

    /** 预算 */
    @Excel(name = "预算")
    private String budgetMoney;

    /** 其他说明 */
    @Excel(name = "其他说明")
    private String contentInfo;

    /** 图片路径或id */
    @Excel(name = "图片路径或id")
    private String picpath;

    /** 是否通过审核 0 未通过 1通过 */
    @Excel(name = "是否通过审核 0 未通过 1通过")
    private String subFlag;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /** 是否删除 0未删除 1已删除 */
    private String delFlag;
    
    private Date endDateStr;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }
    public void setModelNumber(String modelNumber) 
    {
        this.modelNumber = modelNumber;
    }

    public String getModelNumber() 
    {
        return modelNumber;
    }
    public void setBudgetMoney(String budgetMoney) 
    {
        this.budgetMoney = budgetMoney;
    }

    public String getBudgetMoney() 
    {
        return budgetMoney;
    }
    public void setContentInfo(String contentInfo) 
    {
        this.contentInfo = contentInfo;
    }

    public String getContentInfo() 
    {
        return contentInfo;
    }
    public void setPicpath(String picpath) 
    {
        this.picpath = picpath;
    }

    public String getPicpath() 
    {
        return picpath;
    }
    public void setSubFlag(String subFlag) 
    {
        this.subFlag = subFlag;
    }

    public String getSubFlag() 
    {
        return subFlag;
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
    
    public Date getEndDateStr() {
		return endDateStr;
	}

	public void setEndDateStr(Date endDateStr) {
		this.endDateStr = endDateStr;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("endDate", getEndDate())
            .append("modelNumber", getModelNumber())
            .append("budgetMoney", getBudgetMoney())
            .append("contentInfo", getContentInfo())
            .append("picpath", getPicpath())
            .append("subFlag", getSubFlag())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
