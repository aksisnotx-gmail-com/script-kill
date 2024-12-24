package com.dao;

import com.entity.DiscussyouxihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxihuodongVO;
import com.entity.view.DiscussyouxihuodongView;


/**
 * 游戏活动评论表
 * 
 * @author 
 * @email 
 * @date 2024-12-18 00:18:55
 */
public interface DiscussyouxihuodongDao extends BaseMapper<DiscussyouxihuodongEntity> {
	
	List<DiscussyouxihuodongVO> selectListVO(@Param("ew") Wrapper<DiscussyouxihuodongEntity> wrapper);
	
	DiscussyouxihuodongVO selectVO(@Param("ew") Wrapper<DiscussyouxihuodongEntity> wrapper);
	
	List<DiscussyouxihuodongView> selectListView(@Param("ew") Wrapper<DiscussyouxihuodongEntity> wrapper);

	List<DiscussyouxihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxihuodongEntity> wrapper);

	
	DiscussyouxihuodongView selectView(@Param("ew") Wrapper<DiscussyouxihuodongEntity> wrapper);
	

}
