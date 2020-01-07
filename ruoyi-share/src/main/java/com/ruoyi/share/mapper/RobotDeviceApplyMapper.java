package com.ruoyi.share.mapper;

import com.ruoyi.share.domain.RobotDeviceApply;
import java.util.List;

/**
 * 机器设备申请Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
public interface RobotDeviceApplyMapper 
{
    /**
     * 查询机器设备申请
     * 
     * @param id 机器设备申请ID
     * @return 机器设备申请
     */
    public RobotDeviceApply selectRobotDeviceApplyById(Long id);

    /**
     * 查询机器设备申请列表
     * 
     * @param robotDeviceApply 机器设备申请
     * @return 机器设备申请集合
     */
    public List<RobotDeviceApply> selectRobotDeviceApplyList(RobotDeviceApply robotDeviceApply);

    /**
     * 新增机器设备申请
     * 
     * @param robotDeviceApply 机器设备申请
     * @return 结果
     */
    public int insertRobotDeviceApply(RobotDeviceApply robotDeviceApply);

    /**
     * 修改机器设备申请
     * 
     * @param robotDeviceApply 机器设备申请
     * @return 结果
     */
    public int updateRobotDeviceApply(RobotDeviceApply robotDeviceApply);

    /**
     * 删除机器设备申请
     * 
     * @param id 机器设备申请ID
     * @return 结果
     */
    public int deleteRobotDeviceApplyById(Long id);

    /**
     * 批量删除机器设备申请
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobotDeviceApplyByIds(String[] ids);
}
