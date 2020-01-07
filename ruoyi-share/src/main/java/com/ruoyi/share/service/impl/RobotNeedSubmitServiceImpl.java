package com.ruoyi.share.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.share.mapper.RobotNeedSubmitMapper;
import com.ruoyi.share.domain.RobotNeedSubmit;
import com.ruoyi.share.service.IRobotNeedSubmitService;
import com.ruoyi.common.core.text.Convert;

/**
 * 需求信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
@Service
public class RobotNeedSubmitServiceImpl implements IRobotNeedSubmitService 
{
    @Autowired
    private RobotNeedSubmitMapper robotNeedSubmitMapper;

    /**
     * 查询需求信息
     * 
     * @param id 需求信息ID
     * @return 需求信息
     */
    @Override
    public RobotNeedSubmit selectRobotNeedSubmitById(Long id)
    {
        return robotNeedSubmitMapper.selectRobotNeedSubmitById(id);
    }

    /**
     * 查询需求信息列表
     * 
     * @param robotNeedSubmit 需求信息
     * @return 需求信息
     */
    @Override
    public List<RobotNeedSubmit> selectRobotNeedSubmitList(RobotNeedSubmit robotNeedSubmit)
    {
        return robotNeedSubmitMapper.selectRobotNeedSubmitList(robotNeedSubmit);
    }

    /**
     * 新增需求信息
     * 
     * @param robotNeedSubmit 需求信息
     * @return 结果
     */
    @Override
    public int insertRobotNeedSubmit(RobotNeedSubmit robotNeedSubmit)
    {
        return robotNeedSubmitMapper.insertRobotNeedSubmit(robotNeedSubmit);
    }

    /**
     * 修改需求信息
     * 
     * @param robotNeedSubmit 需求信息
     * @return 结果
     */
    @Override
    public int updateRobotNeedSubmit(RobotNeedSubmit robotNeedSubmit)
    {
        return robotNeedSubmitMapper.updateRobotNeedSubmit(robotNeedSubmit);
    }

    /**
     * 删除需求信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobotNeedSubmitByIds(String ids)
    {
        return robotNeedSubmitMapper.deleteRobotNeedSubmitByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除需求信息信息
     * 
     * @param id 需求信息ID
     * @return 结果
     */
    @Override
    public int deleteRobotNeedSubmitById(Long id)
    {
        return robotNeedSubmitMapper.deleteRobotNeedSubmitById(id);
    }
}
