package com.dao;

import com.entity.DaojufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaojufenleiVO;
import com.entity.view.DaojufenleiView;


/**
 * 道具分类
 * 
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public interface DaojufenleiDao extends BaseMapper<DaojufenleiEntity> {
	
	List<DaojufenleiVO> selectListVO(@Param("ew") Wrapper<DaojufenleiEntity> wrapper);
	
	DaojufenleiVO selectVO(@Param("ew") Wrapper<DaojufenleiEntity> wrapper);
	
	List<DaojufenleiView> selectListView(@Param("ew") Wrapper<DaojufenleiEntity> wrapper);

	List<DaojufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<DaojufenleiEntity> wrapper);

	
	DaojufenleiView selectView(@Param("ew") Wrapper<DaojufenleiEntity> wrapper);
	

}
