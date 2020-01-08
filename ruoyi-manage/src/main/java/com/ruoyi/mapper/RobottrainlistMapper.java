package com.ruoyi.mapper;

import java.util.List;
import com.ruoyi.domain.Robottrainlist;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-08
 */
public interface RobottrainlistMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Robottrainlist selectRobottrainlistById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param robottrainlist 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Robottrainlist> selectRobottrainlistList(Robottrainlist robottrainlist);

    /**
     * 新增【请填写功能名称】
     * 
     * @param robottrainlist 【请填写功能名称】
     * @return 结果
     */
    public int insertRobottrainlist(Robottrainlist robottrainlist);

    /**
     * 修改【请填写功能名称】
     * 
     * @param robottrainlist 【请填写功能名称】
     * @return 结果
     */
    public int updateRobottrainlist(Robottrainlist robottrainlist);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteRobottrainlistById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobottrainlistByIds(String[] ids);
}
