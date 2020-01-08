package com.ruoyi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.domain.Robottraincurriculum;
import com.ruoyi.mapper.RobottraincurriculumMapper;
import com.ruoyi.service.IRobottraincurriculumService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-08
 */
@Service
public class RobottraincurriculumServiceImpl implements IRobottraincurriculumService 
{
    @Autowired
    private RobottraincurriculumMapper robottraincurriculumMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Robottraincurriculum selectRobottraincurriculumById(Long id)
    {
        return robottraincurriculumMapper.selectRobottraincurriculumById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param robottraincurriculum 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Robottraincurriculum> selectRobottraincurriculumList(Robottraincurriculum robottraincurriculum)
    {
        return robottraincurriculumMapper.selectRobottraincurriculumList(robottraincurriculum);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param robottraincurriculum 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRobottraincurriculum(Robottraincurriculum robottraincurriculum)
    {
        return robottraincurriculumMapper.insertRobottraincurriculum(robottraincurriculum);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param robottraincurriculum 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRobottraincurriculum(Robottraincurriculum robottraincurriculum)
    {
        return robottraincurriculumMapper.updateRobottraincurriculum(robottraincurriculum);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobottraincurriculumByIds(String ids)
    {
        return robottraincurriculumMapper.deleteRobottraincurriculumByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteRobottraincurriculumById(Long id)
    {
        return robottraincurriculumMapper.deleteRobottraincurriculumById(id);
    }
}
