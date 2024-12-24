package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjubenxinxiDao;
import com.entity.DiscussjubenxinxiEntity;
import com.service.DiscussjubenxinxiService;
import com.entity.vo.DiscussjubenxinxiVO;
import com.entity.view.DiscussjubenxinxiView;

@Service("discussjubenxinxiService")
public class DiscussjubenxinxiServiceImpl extends ServiceImpl<DiscussjubenxinxiDao, DiscussjubenxinxiEntity> implements DiscussjubenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjubenxinxiEntity> page = this.selectPage(
                new Query<DiscussjubenxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjubenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjubenxinxiEntity> wrapper) {
		  Page<DiscussjubenxinxiView> page =new Query<DiscussjubenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussjubenxinxiVO> selectListVO(Wrapper<DiscussjubenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjubenxinxiVO selectVO(Wrapper<DiscussjubenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjubenxinxiView> selectListView(Wrapper<DiscussjubenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjubenxinxiView selectView(Wrapper<DiscussjubenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
