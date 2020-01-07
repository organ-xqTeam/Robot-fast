package com.ruoyi.share.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.share.mapper.RobotShareInformationMapper;
import com.ruoyi.share.domain.RobotShareInformation;
import com.ruoyi.share.service.IRobotShareInformationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 共享资讯Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
@Service
public class RobotShareInformationServiceImpl implements IRobotShareInformationService 
{
    @Autowired
    private RobotShareInformationMapper robotShareInformationMapper;

    /**
     * 查询共享资讯
     * 
     * @param id 共享资讯ID
     * @return 共享资讯
     */
    @Override
    public RobotShareInformation selectRobotShareInformationById(Long id)
    {
        return robotShareInformationMapper.selectRobotShareInformationById(id);
    }

    /**
     * 查询共享资讯列表
     * 
     * @param robotShareInformation 共享资讯
     * @return 共享资讯
     */
    @Override
    public List<RobotShareInformation> selectRobotShareInformationList(RobotShareInformation robotShareInformation)
    {
        return robotShareInformationMapper.selectRobotShareInformationList(robotShareInformation);
    }

    /**
     * 新增共享资讯
     * 
     * @param robotShareInformation 共享资讯
     * @return 结果
     */
    @Override
    public int insertRobotShareInformation(RobotShareInformation robotShareInformation)
    {
        return robotShareInformationMapper.insertRobotShareInformation(robotShareInformation);
    }

    /**
     * 修改共享资讯
     * 
     * @param robotShareInformation 共享资讯
     * @return 结果
     */
    @Override
    public int updateRobotShareInformation(RobotShareInformation robotShareInformation)
    {
        return robotShareInformationMapper.updateRobotShareInformation(robotShareInformation);
    }

    /**
     * 删除共享资讯对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobotShareInformationByIds(String ids)
    {
        return robotShareInformationMapper.deleteRobotShareInformationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除共享资讯信息
     * 
     * @param id 共享资讯ID
     * @return 结果
     */
    @Override
    public int deleteRobotShareInformationById(Long id)
    {
        return robotShareInformationMapper.deleteRobotShareInformationById(id);
    }
}
