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


import com.dao.YouxihuodongDao;
import com.entity.YouxihuodongEntity;
import com.service.YouxihuodongService;
import com.entity.vo.YouxihuodongVO;
import com.entity.view.YouxihuodongView;

@Service("youxihuodongService")
public class YouxihuodongServiceImpl extends ServiceImpl<YouxihuodongDao, YouxihuodongEntity> implements YouxihuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxihuodongEntity> page = this.selectPage(
                new Query<YouxihuodongEntity>(params).getPage(),
                new EntityWrapper<YouxihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxihuodongEntity> wrapper) {
		  Page<YouxihuodongView> page =new Query<YouxihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YouxihuodongVO> selectListVO(Wrapper<YouxihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxihuodongVO selectVO(Wrapper<YouxihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxihuodongView> selectListView(Wrapper<YouxihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxihuodongView selectView(Wrapper<YouxihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
