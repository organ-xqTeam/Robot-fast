package com.ruoyi.share.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 机器人设备对象 robot_device
 * 
 * @author ruoyi
 * @date 2019-12-31
 */
public class RobotDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    /** 型号 */
    @Excel(name = "型号")
    private String model;

    /** 地区 */
    @Excel(name = "地区")
    private String area;

    /** 图片路径 */
    @Excel(name = "图片路径")
    private String picpath;

    /** 详细内容 */
    @Excel(name = "详细内容")
    private String content;

    /** 应用行业 */
    @Excel(name = "应用行业")
    private String apply;

    /** 功能描述 */
    @Excel(name = "功能描述")
    private String functionText;

    /** 租金 */
    @Excel(name = "租金")
    private String rentMoney;

    /** 有线电话 */
    @Excel(name = "有线电话")
    private String wirePhone;

    /** 联系人 */
    @Excel(name = "联系人")
    private String liaisonPeople;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setPicpath(String picpath) 
    {
        this.picpath = picpath;
    }

    public String getPicpath() 
    {
        return picpath;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setApply(String apply) 
    {
        this.apply = apply;
    }

    public String getApply() 
    {
        return apply;
    }
    public void setFunctionText(String functionText) 
    {
        this.functionText = functionText;
    }

    public String getFunctionText() 
    {
        return functionText;
    }
    public void setRentMoney(String rentMoney) 
    {
        this.rentMoney = rentMoney;
    }

    public String getRentMoney() 
    {
        return rentMoney;
    }
    public void setWirePhone(String wirePhone) 
    {
        this.wirePhone = wirePhone;
    }

    public String getWirePhone() 
    {
        return wirePhone;
    }
    public void setLiaisonPeople(String liaisonPeople) 
    {
        this.liaisonPeople = liaisonPeople;
    }

    public String getLiaisonPeople() 
    {
        return liaisonPeople;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
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
            .append("name", getName())
            .append("type", getType())
            .append("brand", getBrand())
            .append("model", getModel())
            .append("area", getArea())
            .append("picpath", getPicpath())
            .append("content", getContent())
            .append("apply", getApply())
            .append("functionText", getFunctionText())
            .append("rentMoney", getRentMoney())
            .append("wirePhone", getWirePhone())
            .append("liaisonPeople", getLiaisonPeople())
            .append("phone", getPhone())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
