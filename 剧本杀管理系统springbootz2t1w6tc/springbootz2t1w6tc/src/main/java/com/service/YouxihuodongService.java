package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxihuodongView;


/**
 * 游戏活动
 *
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public interface YouxihuodongService extends IService<YouxihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxihuodongVO> selectListVO(Wrapper<YouxihuodongEntity> wrapper);
   	
   	YouxihuodongVO selectVO(@Param("ew") Wrapper<YouxihuodongEntity> wrapper);
   	
   	List<YouxihuodongView> selectListView(Wrapper<YouxihuodongEntity> wrapper);
   	
   	YouxihuodongView selectView(@Param("ew") Wrapper<YouxihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxihuodongEntity> wrapper);

   	

}

