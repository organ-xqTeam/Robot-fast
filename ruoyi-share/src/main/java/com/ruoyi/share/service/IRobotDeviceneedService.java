package com.ruoyi.share.service;

import com.ruoyi.share.domain.RobotDeviceneed;
import java.util.List;

/**
 * 机器人需求Service接口
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
public interface IRobotDeviceneedService 
{
    /**
     * 查询机器人需求
     * 
     * @param id 机器人需求ID
     * @return 机器人需求
     */
    public RobotDeviceneed selectRobotDeviceneedById(Long id);

    /**
     * 查询机器人需求列表
     * 
     * @param robotDeviceneed 机器人需求
     * @return 机器人需求集合
     */
    public List<RobotDeviceneed> selectRobotDeviceneedList(RobotDeviceneed robotDeviceneed);

    /**
     * 新增机器人需求
     * 
     * @param robotDeviceneed 机器人需求
     * @return 结果
     */
    public int insertRobotDeviceneed(RobotDeviceneed robotDeviceneed);

    /**
     * 修改机器人需求
     * 
     * @param robotDeviceneed 机器人需求
     * @return 结果
     */
    public int updateRobotDeviceneed(RobotDeviceneed robotDeviceneed);

    /**
     * 批量删除机器人需求
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobotDeviceneedByIds(String ids);

    /**
     * 删除机器人需求信息
     * 
     * @param id 机器人需求ID
     * @return 结果
     */
    public int deleteRobotDeviceneedById(Long id);
}
