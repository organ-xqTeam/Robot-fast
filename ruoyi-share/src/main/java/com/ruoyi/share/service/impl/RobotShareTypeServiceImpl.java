package com.ruoyi.share.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.share.mapper.RobotShareTypeMapper;
import com.ruoyi.share.domain.RobotShareType;
import com.ruoyi.share.service.IRobotShareTypeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 共享类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
@Service
public class RobotShareTypeServiceImpl implements IRobotShareTypeService 
{
    @Autowired
    private RobotShareTypeMapper robotShareTypeMapper;

    /**
     * 查询共享类型
     * 
     * @param id 共享类型ID
     * @return 共享类型
     */
    @Override
    public RobotShareType selectRobotShareTypeById(Long id)
    {
        return robotShareTypeMapper.selectRobotShareTypeById(id);
    }

    /**
     * 查询共享类型列表
     * 
     * @param robotShareType 共享类型
     * @return 共享类型
     */
    @Override
    public List<RobotShareType> selectRobotShareTypeList(RobotShareType robotShareType)
    {
        return robotShareTypeMapper.selectRobotShareTypeList(robotShareType);
    }

    /**
     * 新增共享类型
     * 
     * @param robotShareType 共享类型
     * @return 结果
     */
    @Override
    public int insertRobotShareType(RobotShareType robotShareType)
    {
        return robotShareTypeMapper.insertRobotShareType(robotShareType);
    }

    /**
     * 修改共享类型
     * 
     * @param robotShareType 共享类型
     * @return 结果
     */
    @Override
    public int updateRobotShareType(RobotShareType robotShareType)
    {
        return robotShareTypeMapper.updateRobotShareType(robotShareType);
    }

    /**
     * 删除共享类型对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobotShareTypeByIds(String ids)
    {
        return robotShareTypeMapper.deleteRobotShareTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除共享类型信息
     * 
     * @param id 共享类型ID
     * @return 结果
     */
    @Override
    public int deleteRobotShareTypeById(Long id)
    {
        return robotShareTypeMapper.deleteRobotShareTypeById(id);
    }
}
