package com.dao;

import com.entity.JubenfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubenfenleiVO;
import com.entity.view.JubenfenleiView;


/**
 * 剧本分类
 * 
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public interface JubenfenleiDao extends BaseMapper<JubenfenleiEntity> {
	
	List<JubenfenleiVO> selectListVO(@Param("ew") Wrapper<JubenfenleiEntity> wrapper);
	
	JubenfenleiVO selectVO(@Param("ew") Wrapper<JubenfenleiEntity> wrapper);
	
	List<JubenfenleiView> selectListView(@Param("ew") Wrapper<JubenfenleiEntity> wrapper);

	List<JubenfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JubenfenleiEntity> wrapper);

	
	JubenfenleiView selectView(@Param("ew") Wrapper<JubenfenleiEntity> wrapper);
	

}
