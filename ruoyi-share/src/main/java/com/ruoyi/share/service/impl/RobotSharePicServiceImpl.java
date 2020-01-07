package com.ruoyi.share.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.share.mapper.RobotSharePicMapper;
import com.ruoyi.share.domain.RobotSharePic;
import com.ruoyi.share.service.IRobotSharePicService;
import com.ruoyi.common.core.text.Convert;

/**
 * 共享图片Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
@Service
public class RobotSharePicServiceImpl implements IRobotSharePicService 
{
    @Autowired
    private RobotSharePicMapper robotSharePicMapper;

    /**
     * 查询共享图片
     * 
     * @param id 共享图片ID
     * @return 共享图片
     */
    @Override
    public RobotSharePic selectRobotSharePicById(Long id)
    {
        return robotSharePicMapper.selectRobotSharePicById(id);
    }

    /**
     * 查询共享图片列表
     * 
     * @param robotSharePic 共享图片
     * @return 共享图片
     */
    @Override
    public List<RobotSharePic> selectRobotSharePicList(RobotSharePic robotSharePic)
    {
        return robotSharePicMapper.selectRobotSharePicList(robotSharePic);
    }

    /**
     * 新增共享图片
     * 
     * @param robotSharePic 共享图片
     * @return 结果
     */
    @Override
    public int insertRobotSharePic(RobotSharePic robotSharePic)
    {
        return robotSharePicMapper.insertRobotSharePic(robotSharePic);
    }

    /**
     * 修改共享图片
     * 
     * @param robotSharePic 共享图片
     * @return 结果
     */
    @Override
    public int updateRobotSharePic(RobotSharePic robotSharePic)
    {
        return robotSharePicMapper.updateRobotSharePic(robotSharePic);
    }

    /**
     * 删除共享图片对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRobotSharePicByIds(String ids)
    {
        return robotSharePicMapper.deleteRobotSharePicByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除共享图片信息
     * 
     * @param id 共享图片ID
     * @return 结果
     */
    @Override
    public int deleteRobotSharePicById(Long id)
    {
        return robotSharePicMapper.deleteRobotSharePicById(id);
    }
}
