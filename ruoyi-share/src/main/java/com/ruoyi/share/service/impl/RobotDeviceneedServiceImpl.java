package com.ruoyi.share.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.share.mapper.RobotDeviceneedMapper;
import com.ruoyi.share.domain.RobotDeviceneed;
import com.ruoyi.share.service.IRobotDeviceneedService;
import com.ruoyi.common.core.text.Convert;

/**
 * 机器人需求Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
@Service
public class RobotDeviceneedServiceImpl implements IRobotDeviceneedService 
{
    @Autowired
    private RobotDeviceneedMapper robotDeviceneedMapper;

    /**
     * 查询机器人需求
     * 
     * @param id 机器人需求ID
     * @return 机器人需求
     */
    @Override
    public RobotDeviceneed selectRobotDeviceneedById(Long id)
    {
        return robotDeviceneedMapper.selectRobotDeviceneedById(id);
    }

    /**
     * 查询机器人需求列表
     * 
     * @param robotDeviceneed 机器人需求
     * @return 机器人需求
     */
    @Override
    public List<RobotDeviceneed> selectRobotDeviceneedList(RobotDeviceneed robotDeviceneed)
    {
        return robotDeviceneedMapper.selectRobotDeviceneedList(robotDeviceneed);
    }

    /**
     * 新增机器人需求
     * 
     * @param robotDeviceneed 机器人需求
     * @return 结果
     */
    @Override
    public int insertRobotDeviceneed(RobotDeviceneed robotDeviceneed)
    {
        return robotDeviceneedMapper.insertRobotDeviceneed(robotDeviceneed);
    }

    /**
     * 修改机器人需求
     * 
     * @param robotDeviceneed 机器人需求
     * @return 结果
     */
    @Override
    public int updateRobotDeviceneed(RobotDeviceneed robotDeviceneed)
    {
        return robotDeviceneedMapper.updateRobotDeviceneed(robotDeviceneed);
    }

    /**
     * 删除机器人需求对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobotDeviceneedByIds(String ids)
    {
        return robotDeviceneedMapper.deleteRobotDeviceneedByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除机器人需求信息
     * 
     * @param id 机器人需求ID
     * @return 结果
     */
    @Override
    public int deleteRobotDeviceneedById(Long id)
    {
        return robotDeviceneedMapper.deleteRobotDeviceneedById(id);
    }
}
