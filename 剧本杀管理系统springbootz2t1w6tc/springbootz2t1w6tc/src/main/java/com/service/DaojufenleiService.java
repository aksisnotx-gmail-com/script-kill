package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaojufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaojufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaojufenleiView;


/**
 * 道具分类
 *
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public interface DaojufenleiService extends IService<DaojufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaojufenleiVO> selectListVO(Wrapper<DaojufenleiEntity> wrapper);
   	
   	DaojufenleiVO selectVO(@Param("ew") Wrapper<DaojufenleiEntity> wrapper);
   	
   	List<DaojufenleiView> selectListView(Wrapper<DaojufenleiEntity> wrapper);
   	
   	DaojufenleiView selectView(@Param("ew") Wrapper<DaojufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaojufenleiEntity> wrapper);

   	

}

