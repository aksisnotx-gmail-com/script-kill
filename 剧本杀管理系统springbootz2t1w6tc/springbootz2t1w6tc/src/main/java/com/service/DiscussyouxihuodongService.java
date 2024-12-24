package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxihuodongView;


/**
 * 游戏活动评论表
 *
 * @author
 * @email
 * @date 2024-12-18 00:18:55
 */
public interface DiscussyouxihuodongService extends IService<DiscussyouxihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<DiscussyouxihuodongVO> selectListVO(Wrapper<DiscussyouxihuodongEntity> wrapper);

   	DiscussyouxihuodongVO selectVO(@Param("ew") Wrapper<DiscussyouxihuodongEntity> wrapper);

   	List<DiscussyouxihuodongView> selectListView(Wrapper<DiscussyouxihuodongEntity> wrapper);

   	DiscussyouxihuodongView selectView(@Param("ew") Wrapper<DiscussyouxihuodongEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxihuodongEntity> wrapper);



}

