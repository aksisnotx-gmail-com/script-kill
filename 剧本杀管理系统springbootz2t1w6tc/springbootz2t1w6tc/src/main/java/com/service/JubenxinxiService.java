package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JubenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JubenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JubenxinxiView;


/**
 * 剧本信息
 *
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public interface JubenxinxiService extends IService<JubenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JubenxinxiVO> selectListVO(Wrapper<JubenxinxiEntity> wrapper);
   	
   	JubenxinxiVO selectVO(@Param("ew") Wrapper<JubenxinxiEntity> wrapper);
   	
   	List<JubenxinxiView> selectListView(Wrapper<JubenxinxiEntity> wrapper);
   	
   	JubenxinxiView selectView(@Param("ew") Wrapper<JubenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JubenxinxiEntity> wrapper);

   	

}

