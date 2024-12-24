package com.dao;

import com.entity.DiscussjubenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjubenxinxiVO;
import com.entity.view.DiscussjubenxinxiView;


/**
 * 剧本信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-12-18 00:18:55
 */
public interface DiscussjubenxinxiDao extends BaseMapper<DiscussjubenxinxiEntity> {
	
	List<DiscussjubenxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjubenxinxiEntity> wrapper);
	
	DiscussjubenxinxiVO selectVO(@Param("ew") Wrapper<DiscussjubenxinxiEntity> wrapper);
	
	List<DiscussjubenxinxiView> selectListView(@Param("ew") Wrapper<DiscussjubenxinxiEntity> wrapper);

	List<DiscussjubenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjubenxinxiEntity> wrapper);

	
	DiscussjubenxinxiView selectView(@Param("ew") Wrapper<DiscussjubenxinxiEntity> wrapper);
	

}
