package com.ruoyi.share.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 共享图片对象 robot_share_pic
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
public class RobotSharePic extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 图片的名称 */
    @Excel(name = "图片的名称")
    private String name;

    /** 路径或id */
    @Excel(name = "路径或id")
    private String picpath;

    /** 创建日期 */
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 更新日期 */
    @Excel(name = "更新日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /** 是否删除0 未删除 1 删除 */
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
    public void setPicpath(String picpath) 
    {
        this.picpath = picpath;
    }

    public String getPicpath() 
    {
        return picpath;
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
            .append("picpath", getPicpath())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
