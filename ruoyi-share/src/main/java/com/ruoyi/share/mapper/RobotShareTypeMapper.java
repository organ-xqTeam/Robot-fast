package com.ruoyi.share.mapper;

import com.ruoyi.share.domain.RobotShareType;
import java.util.List;

/**
 * 共享类型Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
public interface RobotShareTypeMapper 
{
    /**
     * 查询共享类型
     * 
     * @param id 共享类型ID
     * @return 共享类型
     */
    public RobotShareType selectRobotShareTypeById(Long id);

    /**
     * 查询共享类型列表
     * 
     * @param robotShareType 共享类型
     * @return 共享类型集合
     */
    public List<RobotShareType> selectRobotShareTypeList(RobotShareType robotShareType);

    /**
     * 新增共享类型
     * 
     * @param robotShareType 共享类型
     * @return 结果
     */
    public int insertRobotShareType(RobotShareType robotShareType);

    /**
     * 修改共享类型
     * 
     * @param robotShareType 共享类型
     * @return 结果
     */
    public int updateRobotShareType(RobotShareType robotShareType);

    /**
     * 删除共享类型
     * 
     * @param id 共享类型ID
     * @return 结果
     */
    public int deleteRobotShareTypeById(Long id);

    /**
     * 批量删除共享类型
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobotShareTypeByIds(String[] ids);
}
