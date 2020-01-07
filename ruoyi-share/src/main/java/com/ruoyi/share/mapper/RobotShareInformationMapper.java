package com.ruoyi.share.mapper;

import com.ruoyi.share.domain.RobotShareInformation;
import java.util.List;

/**
 * 共享资讯Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
public interface RobotShareInformationMapper 
{
    /**
     * 查询共享资讯
     * 
     * @param id 共享资讯ID
     * @return 共享资讯
     */
    public RobotShareInformation selectRobotShareInformationById(Long id);

    /**
     * 查询共享资讯列表
     * 
     * @param robotShareInformation 共享资讯
     * @return 共享资讯集合
     */
    public List<RobotShareInformation> selectRobotShareInformationList(RobotShareInformation robotShareInformation);

    /**
     * 新增共享资讯
     * 
     * @param robotShareInformation 共享资讯
     * @return 结果
     */
    public int insertRobotShareInformation(RobotShareInformation robotShareInformation);

    /**
     * 修改共享资讯
     * 
     * @param robotShareInformation 共享资讯
     * @return 结果
     */
    public int updateRobotShareInformation(RobotShareInformation robotShareInformation);

    /**
     * 删除共享资讯
     * 
     * @param id 共享资讯ID
     * @return 结果
     */
    public int deleteRobotShareInformationById(Long id);

    /**
     * 批量删除共享资讯
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobotShareInformationByIds(String[] ids);
}
