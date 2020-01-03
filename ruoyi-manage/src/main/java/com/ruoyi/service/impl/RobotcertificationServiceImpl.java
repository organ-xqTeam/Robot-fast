package com.ruoyi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.domain.Robotcertification;
import com.ruoyi.domain.Robotproject;
import com.ruoyi.mapper.RobotcertificationMapper;
import com.ruoyi.mapper.RobotprojectMapper;
import com.ruoyi.service.IRobotcertificationService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
@Service
public class RobotcertificationServiceImpl implements IRobotcertificationService 
{
    @Autowired
    private RobotcertificationMapper robotcertificationMapper;
    
    @Autowired
    private RobotprojectMapper robotprojectMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Robotcertification selectRobotcertificationById(Long id)
    {
        return robotcertificationMapper.selectRobotcertificationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param robotcertification 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Robotcertification> selectRobotcertificationList(Robotcertification robotcertification)
    {
        return robotcertificationMapper.selectRobotcertificationList(robotcertification);
    }
    
    /**
     * 新增【请填写功能名称】
     * 
     * @param robotcertification 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRobotcertification(Robotcertification robotcertification)
    {
        return robotcertificationMapper.insertRobotcertification(robotcertification);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param robotcertification 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRobotcertification(Robotcertification robotcertification)
    {
        return robotcertificationMapper.updateRobotcertification(robotcertification);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobotcertificationByIds(String ids)
    {
        return robotcertificationMapper.deleteRobotcertificationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteRobotcertificationById(Long id)
    {
        return robotcertificationMapper.deleteRobotcertificationById(id);
    }
}
