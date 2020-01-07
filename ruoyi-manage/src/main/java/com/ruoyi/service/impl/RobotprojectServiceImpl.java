package com.ruoyi.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.domain.Robotproject;
import com.ruoyi.mapper.RobotprojectMapper;
import com.ruoyi.service.IRobotprojectService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-30
 */
@Service
public class RobotprojectServiceImpl implements IRobotprojectService 
{
    @Autowired
    private RobotprojectMapper robotprojectMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Robotproject selectRobotprojectById(Long id)
    {
        return robotprojectMapper.selectRobotprojectById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param robotproject 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Robotproject> selectRobotprojectList(Robotproject robotproject)
    {
        return robotprojectMapper.selectRobotprojectList(robotproject);
    }
    
    @Override
    public List<Robotproject> selectCount()
    {
        return robotprojectMapper.selectcount();
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param robotproject 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRobotproject(Robotproject robotproject)
    {
        return robotprojectMapper.insertRobotproject(robotproject);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param robotproject 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRobotproject(Robotproject robotproject)
    {
        return robotprojectMapper.updateRobotproject(robotproject);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobotprojectByIds(String ids)
    {
        return robotprojectMapper.deleteRobotprojectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteRobotprojectById(Long id)
    {
        return robotprojectMapper.deleteRobotprojectById(id);
    }
}
