package com.ruoyi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 robottraincurriculum
 * 
 * @author ruoyi
 * @date 2020-01-08
 */
public class Robottraincurriculum extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 介绍 */
    @Excel(name = "介绍")
    private String introduce;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 价格 */
    @Excel(name = "价格")
    private String price;

    /** 是否线上 1线上2线下 */
    @Excel(name = "是否线上 1线上2线下")
    private String online;

    /** logo */
    @Excel(name = "logo")
    private String logo;

    /** 分类 */
    @Excel(name = "分类")
    private String type;

    /** 原文网址 */
    @Excel(name = "原文网址")
    private String url;

    /** 点赞 */
    @Excel(name = "点赞")
    private String praise;

    /** 浏览 */
    @Excel(name = "浏览")
    private String browse;

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
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setIntroduce(String introduce) 
    {
        this.introduce = introduce;
    }

    public String getIntroduce() 
    {
        return introduce;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setOnline(String online) 
    {
        this.online = online;
    }

    public String getOnline() 
    {
        return online;
    }
    public void setLogo(String logo) 
    {
        this.logo = logo;
    }

    public String getLogo() 
    {
        return logo;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setPraise(String praise) 
    {
        this.praise = praise;
    }

    public String getPraise() 
    {
        return praise;
    }
    public void setBrowse(String browse) 
    {
        this.browse = browse;
    }

    public String getBrowse() 
    {
        return browse;
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
            .append("title", getTitle())
            .append("introduce", getIntroduce())
            .append("content", getContent())
            .append("price", getPrice())
            .append("online", getOnline())
            .append("logo", getLogo())
            .append("type", getType())
            .append("url", getUrl())
            .append("praise", getPraise())
            .append("browse", getBrowse())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
