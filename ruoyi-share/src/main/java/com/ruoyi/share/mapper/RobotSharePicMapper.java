package com.ruoyi.share.mapper;

import com.ruoyi.share.domain.RobotSharePic;
import java.util.List;

/**
 * 共享图片Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
public interface RobotSharePicMapper 
{
    /**
     * 查询共享图片
     * 
     * @param id 共享图片ID
     * @return 共享图片
     */
    public RobotSharePic selectRobotSharePicById(Long id);

    /**
     * 查询共享图片列表
     * 
     * @param robotSharePic 共享图片
     * @return 共享图片集合
     */
    public List<RobotSharePic> selectRobotSharePicList(RobotSharePic robotSharePic);

    /**
     * 新增共享图片
     * 
     * @param robotSharePic 共享图片
     * @return 结果
     */
    public int insertRobotSharePic(RobotSharePic robotSharePic);

    /**
     * 修改共享图片
     * 
     * @param robotSharePic 共享图片
     * @return 结果
     */
    public int updateRobotSharePic(RobotSharePic robotSharePic);

    /**
     * 删除共享图片
     * 
     * @param id 共享图片ID
     * @return 结果
     */
    public int deleteRobotSharePicById(Long id);

    /**
     * 批量删除共享图片
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRobotSharePicByIds(String[] ids);
}
