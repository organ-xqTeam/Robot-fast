package com.ruoyi.share.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.share.mapper.RobotDeviceMapper;
import com.ruoyi.share.domain.RobotDevice;
import com.ruoyi.share.service.IRobotDeviceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 机器人设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-31
 */
@Service
public class RobotDeviceServiceImpl implements IRobotDeviceService 
{
    @Autowired
    private RobotDeviceMapper robotDeviceMapper;

    /**
     * 查询机器人设备
     * 
     * @param id 机器人设备ID
     * @return 机器人设备
     */
    @Override
    public RobotDevice selectRobotDeviceById(Long id)
    {
        return robotDeviceMapper.selectRobotDeviceById(id);
    }

    /**
     * 查询机器人设备列表
     * 
     * @param robotDevice 机器人设备
     * @return 机器人设备
     */
    @Override
    public List<RobotDevice> selectRobotDeviceList(RobotDevice robotDevice)
    {
        return robotDeviceMapper.selectRobotDeviceList(robotDevice);
    }

    /**
     * 新增机器人设备
     * 
     * @param robotDevice 机器人设备
     * @return 结果
     */
    @Override
    public int insertRobotDevice(RobotDevice robotDevice)
    {
        return robotDeviceMapper.insertRobotDevice(robotDevice);
    }

    /**
     * 修改机器人设备
     * 
     * @param robotDevice 机器人设备
     * @return 结果
     */
    @Override
    public int updateRobotDevice(RobotDevice robotDevice)
    {
        return robotDeviceMapper.updateRobotDevice(robotDevice);
    }

    /**
     * 删除机器人设备对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobotDeviceByIds(String ids)
    {
        return robotDeviceMapper.deleteRobotDeviceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除机器人设备信息
     * 
     * @param id 机器人设备ID
     * @return 结果
     */
    @Override
    public int deleteRobotDeviceById(Long id)
    {
        return robotDeviceMapper.deleteRobotDeviceById(id);
    }
}
