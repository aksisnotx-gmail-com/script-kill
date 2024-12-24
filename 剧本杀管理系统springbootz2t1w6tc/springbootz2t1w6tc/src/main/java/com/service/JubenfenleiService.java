package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JubenfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JubenfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JubenfenleiView;


/**
 * 剧本分类
 *
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public interface JubenfenleiService extends IService<JubenfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JubenfenleiVO> selectListVO(Wrapper<JubenfenleiEntity> wrapper);
   	
   	JubenfenleiVO selectVO(@Param("ew") Wrapper<JubenfenleiEntity> wrapper);
   	
   	List<JubenfenleiView> selectListView(Wrapper<JubenfenleiEntity> wrapper);
   	
   	JubenfenleiView selectView(@Param("ew") Wrapper<JubenfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JubenfenleiEntity> wrapper);

   	

}

