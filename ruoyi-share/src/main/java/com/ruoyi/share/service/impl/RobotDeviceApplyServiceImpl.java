package com.ruoyi.share.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.share.mapper.RobotDeviceApplyMapper;
import com.ruoyi.share.domain.RobotDeviceApply;
import com.ruoyi.share.service.IRobotDeviceApplyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 机器设备申请Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
@Service
public class RobotDeviceApplyServiceImpl implements IRobotDeviceApplyService 
{
    @Autowired
    private RobotDeviceApplyMapper robotDeviceApplyMapper;

    /**
     * 查询机器设备申请
     * 
     * @param id 机器设备申请ID
     * @return 机器设备申请
     */
    @Override
    public RobotDeviceApply selectRobotDeviceApplyById(Long id)
    {
        return robotDeviceApplyMapper.selectRobotDeviceApplyById(id);
    }

    /**
     * 查询机器设备申请列表
     * 
     * @param robotDeviceApply 机器设备申请
     * @return 机器设备申请
     */
    @Override
    public List<RobotDeviceApply> selectRobotDeviceApplyList(RobotDeviceApply robotDeviceApply)
    {
        return robotDeviceApplyMapper.selectRobotDeviceApplyList(robotDeviceApply);
    }

    /**
     * 新增机器设备申请
     * 
     * @param robotDeviceApply 机器设备申请
     * @return 结果
     */
    @Override
    public int insertRobotDeviceApply(RobotDeviceApply robotDeviceApply)
    {
        return robotDeviceApplyMapper.insertRobotDeviceApply(robotDeviceApply);
    }

    /**
     * 修改机器设备申请
     * 
     * @param robotDeviceApply 机器设备申请
     * @return 结果
     */
    @Override
    public int updateRobotDeviceApply(RobotDeviceApply robotDeviceApply)
    {
        return robotDeviceApplyMapper.updateRobotDeviceApply(robotDeviceApply);
    }

    /**
     * 删除机器设备申请对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobotDeviceApplyByIds(String ids)
    {
        return robotDeviceApplyMapper.deleteRobotDeviceApplyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除机器设备申请信息
     * 
     * @param id 机器设备申请ID
     * @return 结果
     */
    @Override
    public int deleteRobotDeviceApplyById(Long id)
    {
        return robotDeviceApplyMapper.deleteRobotDeviceApplyById(id);
    }
}
