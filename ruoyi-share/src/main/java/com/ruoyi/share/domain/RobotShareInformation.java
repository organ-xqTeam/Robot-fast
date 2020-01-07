package com.ruoyi.share.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 共享资讯对象 robot_share_information
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
public class RobotShareInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 图片id或路径 */
    @Excel(name = "图片id或路径")
    private String picpath;

    /** 标题 */
    @Excel(name = "标题")
    private String titile;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /** 0 未删除 1已删除 */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPicpath(String picpath) 
    {
        this.picpath = picpath;
    }

    public String getPicpath() 
    {
        return picpath;
    }
    public void setTitile(String titile) 
    {
        this.titile = titile;
    }

    public String getTitile() 
    {
        return titile;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
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
            .append("picpath", getPicpath())
            .append("titile", getTitile())
            .append("content", getContent())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
