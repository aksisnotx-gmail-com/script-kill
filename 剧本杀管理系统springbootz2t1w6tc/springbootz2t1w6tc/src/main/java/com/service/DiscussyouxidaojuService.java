package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxidaojuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxidaojuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxidaojuView;


/**
 * 游戏道具评论表
 *
 * @author 
 * @email 
 * @date 2024-12-18 00:18:55
 */
public interface DiscussyouxidaojuService extends IService<DiscussyouxidaojuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouxidaojuVO> selectListVO(Wrapper<DiscussyouxidaojuEntity> wrapper);
   	
   	DiscussyouxidaojuVO selectVO(@Param("ew") Wrapper<DiscussyouxidaojuEntity> wrapper);
   	
   	List<DiscussyouxidaojuView> selectListView(Wrapper<DiscussyouxidaojuEntity> wrapper);
   	
   	DiscussyouxidaojuView selectView(@Param("ew") Wrapper<DiscussyouxidaojuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxidaojuEntity> wrapper);

   	

}

