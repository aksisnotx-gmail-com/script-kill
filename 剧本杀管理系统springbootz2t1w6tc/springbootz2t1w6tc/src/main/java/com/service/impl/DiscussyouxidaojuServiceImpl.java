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


import com.dao.DiscussyouxidaojuDao;
import com.entity.DiscussyouxidaojuEntity;
import com.service.DiscussyouxidaojuService;
import com.entity.vo.DiscussyouxidaojuVO;
import com.entity.view.DiscussyouxidaojuView;

@Service("discussyouxidaojuService")
public class DiscussyouxidaojuServiceImpl extends ServiceImpl<DiscussyouxidaojuDao, DiscussyouxidaojuEntity> implements DiscussyouxidaojuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxidaojuEntity> page = this.selectPage(
                new Query<DiscussyouxidaojuEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxidaojuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxidaojuEntity> wrapper) {
		  Page<DiscussyouxidaojuView> page =new Query<DiscussyouxidaojuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyouxidaojuVO> selectListVO(Wrapper<DiscussyouxidaojuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxidaojuVO selectVO(Wrapper<DiscussyouxidaojuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxidaojuView> selectListView(Wrapper<DiscussyouxidaojuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxidaojuView selectView(Wrapper<DiscussyouxidaojuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
