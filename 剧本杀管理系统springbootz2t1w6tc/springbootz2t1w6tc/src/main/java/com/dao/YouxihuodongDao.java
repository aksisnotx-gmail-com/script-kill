package com.dao;

import com.entity.YouxihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxihuodongVO;
import com.entity.view.YouxihuodongView;


/**
 * 游戏活动
 * 
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public interface YouxihuodongDao extends BaseMapper<YouxihuodongEntity> {
	
	List<YouxihuodongVO> selectListVO(@Param("ew") Wrapper<YouxihuodongEntity> wrapper);
	
	YouxihuodongVO selectVO(@Param("ew") Wrapper<YouxihuodongEntity> wrapper);
	
	List<YouxihuodongView> selectListView(@Param("ew") Wrapper<YouxihuodongEntity> wrapper);

	List<YouxihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<YouxihuodongEntity> wrapper);

	
	YouxihuodongView selectView(@Param("ew") Wrapper<YouxihuodongEntity> wrapper);
	

}
