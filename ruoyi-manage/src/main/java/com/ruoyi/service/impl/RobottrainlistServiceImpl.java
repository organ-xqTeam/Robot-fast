package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.domain.Robottrainlist;
import com.ruoyi.mapper.RobottrainlistMapper;
import com.ruoyi.service.IRobottrainlistService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-08
 */
@Service
public class RobottrainlistServiceImpl implements IRobottrainlistService 
{
    @Autowired
    private RobottrainlistMapper robottrainlistMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Robottrainlist selectRobottrainlistById(Long id)
    {
        return robottrainlistMapper.selectRobottrainlistById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param robottrainlist 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Robottrainlist> selectRobottrainlistList(Robottrainlist robottrainlist)
    {
        return robottrainlistMapper.selectRobottrainlistList(robottrainlist);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param robottrainlist 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRobottrainlist(Robottrainlist robottrainlist)
    {
        return robottrainlistMapper.insertRobottrainlist(robottrainlist);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param robottrainlist 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRobottrainlist(Robottrainlist robottrainlist)
    {
        return robottrainlistMapper.updateRobottrainlist(robottrainlist);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobottrainlistByIds(String ids)
    {
        return robottrainlistMapper.deleteRobottrainlistByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteRobottrainlistById(Long id)
    {
        return robottrainlistMapper.deleteRobottrainlistById(id);
    }
}
