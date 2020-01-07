package com.ruoyi.share.service;

import com.ruoyi.share.domain.RobotNeedSubmit;
import java.util.List;

/**
 * 需求信息Service接口
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
public interface IRobotNeedSubmitService 
{
    /**
     * 查询需求信息
     * 
     * @param id 需求信息ID
     * @return 需求信息
     */
    public RobotNeedSubmit selectRobotNeedSubmitById(Long id);

    /**
     * 查询需求信息列表
     * 
     * @param robotNeedSubmit 需求信息
     * @return 需求信息集合
     */
    public List<RobotNeedSubmit> selectRobotNeedSubmitList(RobotNeedSubmit robotNeedSubmit);

    /**
     * 新增需求信息
     * 
     * @param robotNeedSubmit 需求信息
     * @return 结果
     */
    public int insertRobotNeedSubmit(RobotNeedSubmit robotNeedSubmit);

    /**
     * 修改需求信息
     * 
     * @param robotNeedSubmit 需求信息
     * @return 结果
     */
    public int updateRobotNeedSubmit(RobotNeedSubmit robotNeedSubmit);

    /**
     * 批量删除需求信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobotNeedSubmitByIds(String ids);

    /**
     * 删除需求信息信息
     * 
     * @param id 需求信息ID
     * @return 结果
     */
    public int deleteRobotNeedSubmitById(Long id);
}
