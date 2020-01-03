package com.ruoyi.mapper;

import java.util.List;
import com.ruoyi.domain.Robotcertification;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
public interface RobotcertificationMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Robotcertification selectRobotcertificationById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param robotcertification 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Robotcertification> selectRobotcertificationList(Robotcertification robotcertification);

    /**
     * 新增【请填写功能名称】
     * 
     * @param robotcertification 【请填写功能名称】
     * @return 结果
     */
    public int insertRobotcertification(Robotcertification robotcertification);

    /**
     * 修改【请填写功能名称】
     * 
     * @param robotcertification 【请填写功能名称】
     * @return 结果
     */
    public int updateRobotcertification(Robotcertification robotcertification);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteRobotcertificationById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobotcertificationByIds(String[] ids);
}
