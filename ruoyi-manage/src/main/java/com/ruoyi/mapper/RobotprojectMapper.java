package com.ruoyi.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.domain.Robotproject;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-30
 */
public interface RobotprojectMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Robotproject selectRobotprojectById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param robotproject 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Robotproject> selectRobotprojectList(Robotproject robotproject);
    
    public List<Robotproject> selectcount();
    
    /**
     * 新增【请填写功能名称】
     * 
     * @param robotproject 【请填写功能名称】
     * @return 结果
     */
    public int insertRobotproject(Robotproject robotproject);

    /**
     * 修改【请填写功能名称】
     * 
     * @param robotproject 【请填写功能名称】
     * @return 结果
     */
    public int updateRobotproject(Robotproject robotproject);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteRobotprojectById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobotprojectByIds(String[] ids);
}
