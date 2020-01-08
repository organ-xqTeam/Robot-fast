package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.Robottraincurriculum;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-01-08
 */
public interface IRobottraincurriculumService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Robottraincurriculum selectRobottraincurriculumById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param robottraincurriculum 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Robottraincurriculum> selectRobottraincurriculumList(Robottraincurriculum robottraincurriculum);

    /**
     * 新增【请填写功能名称】
     * 
     * @param robottraincurriculum 【请填写功能名称】
     * @return 结果
     */
    public int insertRobottraincurriculum(Robottraincurriculum robottraincurriculum);

    /**
     * 修改【请填写功能名称】
     * 
     * @param robottraincurriculum 【请填写功能名称】
     * @return 结果
     */
    public int updateRobottraincurriculum(Robottraincurriculum robottraincurriculum);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobottraincurriculumByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteRobottraincurriculumById(Long id);
}
