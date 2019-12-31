package com.ruoyi.share.mapper;

import com.ruoyi.share.domain.RobotDevice;
import java.util.List;

/**
 * 机器人设备Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-31
 */
public interface RobotDeviceMapper 
{
    /**
     * 查询机器人设备
     * 
     * @param id 机器人设备ID
     * @return 机器人设备
     */
    public RobotDevice selectRobotDeviceById(Long id);

    /**
     * 查询机器人设备列表
     * 
     * @param robotDevice 机器人设备
     * @return 机器人设备集合
     */
    public List<RobotDevice> selectRobotDeviceList(RobotDevice robotDevice);

    /**
     * 新增机器人设备
     * 
     * @param robotDevice 机器人设备
     * @return 结果
     */
    public int insertRobotDevice(RobotDevice robotDevice);

    /**
     * 修改机器人设备
     * 
     * @param robotDevice 机器人设备
     * @return 结果
     */
    public int updateRobotDevice(RobotDevice robotDevice);

    /**
     * 删除机器人设备
     * 
     * @param id 机器人设备ID
     * @return 结果
     */
    public int deleteRobotDeviceById(Long id);

    /**
     * 批量删除机器人设备
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobotDeviceByIds(String[] ids);
}
