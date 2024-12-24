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


import com.dao.DiscussyouxihuodongDao;
import com.entity.DiscussyouxihuodongEntity;
import com.service.DiscussyouxihuodongService;
import com.entity.vo.DiscussyouxihuodongVO;
import com.entity.view.DiscussyouxihuodongView;

@Service("discussyouxihuodongService")
public class DiscussyouxihuodongServiceImpl extends ServiceImpl<DiscussyouxihuodongDao, DiscussyouxihuodongEntity> implements DiscussyouxihuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxihuodongEntity> page = this.selectPage(
                new Query<DiscussyouxihuodongEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxihuodongEntity> wrapper) {
		  Page<DiscussyouxihuodongView> page =new Query<DiscussyouxihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyouxihuodongVO> selectListVO(Wrapper<DiscussyouxihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxihuodongVO selectVO(Wrapper<DiscussyouxihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxihuodongView> selectListView(Wrapper<DiscussyouxihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxihuodongView selectView(Wrapper<DiscussyouxihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
