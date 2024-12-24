package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjubenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjubenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjubenxinxiView;


/**
 * 剧本信息评论表
 *
 * @author
 * @email
 * @date 2024-12-18 00:18:55
 */
public interface DiscussjubenxinxiService extends IService<DiscussjubenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<DiscussjubenxinxiVO> selectListVO(Wrapper<DiscussjubenxinxiEntity> wrapper);

   	DiscussjubenxinxiVO selectVO(@Param("ew") Wrapper<DiscussjubenxinxiEntity> wrapper);

   	List<DiscussjubenxinxiView> selectListView(Wrapper<DiscussjubenxinxiEntity> wrapper);

   	DiscussjubenxinxiView selectView(@Param("ew") Wrapper<DiscussjubenxinxiEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjubenxinxiEntity> wrapper);



}

