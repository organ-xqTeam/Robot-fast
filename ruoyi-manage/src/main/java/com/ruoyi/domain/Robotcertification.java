package com.ruoyi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 robotcertification
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
public class Robotcertification extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 认证类型 */
    @Excel(name = "认证类型")
    private String type;
    
    /** logo */
    @Excel(name = "logo")
    private String logo;

    /** 认证标题 */
    @Excel(name = "认证标题")
    private String title;

    /** 认证标题2 */
    @Excel(name = "认证标题2")
    private String title2;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

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
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    
    public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setTitle2(String title2) 
    {
        this.title2 = title2;
    }

    public String getTitle2() 
    {
        return title2;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
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
            .append("type", getType())
            .append("title", getTitle())
            .append("title2", getTitle2())
            .append("content", getContent())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
