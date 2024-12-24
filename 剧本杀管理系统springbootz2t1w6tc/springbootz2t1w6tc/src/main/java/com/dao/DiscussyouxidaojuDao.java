package com.dao;

import com.entity.DiscussyouxidaojuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxidaojuVO;
import com.entity.view.DiscussyouxidaojuView;


/**
 * 游戏道具评论表
 * 
 * @author 
 * @email 
 * @date 2024-12-18 00:18:55
 */
public interface DiscussyouxidaojuDao extends BaseMapper<DiscussyouxidaojuEntity> {
	
	List<DiscussyouxidaojuVO> selectListVO(@Param("ew") Wrapper<DiscussyouxidaojuEntity> wrapper);
	
	DiscussyouxidaojuVO selectVO(@Param("ew") Wrapper<DiscussyouxidaojuEntity> wrapper);
	
	List<DiscussyouxidaojuView> selectListView(@Param("ew") Wrapper<DiscussyouxidaojuEntity> wrapper);

	List<DiscussyouxidaojuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxidaojuEntity> wrapper);

	
	DiscussyouxidaojuView selectView(@Param("ew") Wrapper<DiscussyouxidaojuEntity> wrapper);
	

}
