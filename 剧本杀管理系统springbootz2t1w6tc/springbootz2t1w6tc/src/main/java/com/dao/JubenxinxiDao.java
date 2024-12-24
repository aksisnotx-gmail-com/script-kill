package com.dao;

import com.entity.JubenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubenxinxiVO;
import com.entity.view.JubenxinxiView;


/**
 * 剧本信息
 * 
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public interface JubenxinxiDao extends BaseMapper<JubenxinxiEntity> {
	
	List<JubenxinxiVO> selectListVO(@Param("ew") Wrapper<JubenxinxiEntity> wrapper);
	
	JubenxinxiVO selectVO(@Param("ew") Wrapper<JubenxinxiEntity> wrapper);
	
	List<JubenxinxiView> selectListView(@Param("ew") Wrapper<JubenxinxiEntity> wrapper);

	List<JubenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JubenxinxiEntity> wrapper);

	
	JubenxinxiView selectView(@Param("ew") Wrapper<JubenxinxiEntity> wrapper);
	

}
