package com.ruoyi.share.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 共享类型对象 robot_share_type
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
public class RobotShareType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 类型名称 */
    @Excel(name = "类型名称")
    private String name;

    /** 类型 1类别 2品牌 3型号 4地区 */
    @Excel(name = "类型 1类别 2品牌 3型号 4地区")
    private String type;

    /** 创建日期 */
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 更新日期 */
    @Excel(name = "更新日期", width = 30, dateFormat = "yyyy-MM-dd")
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
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
