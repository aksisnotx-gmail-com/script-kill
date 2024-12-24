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


import com.dao.JubenxinxiDao;
import com.entity.JubenxinxiEntity;
import com.service.JubenxinxiService;
import com.entity.vo.JubenxinxiVO;
import com.entity.view.JubenxinxiView;

@Service("jubenxinxiService")
public class JubenxinxiServiceImpl extends ServiceImpl<JubenxinxiDao, JubenxinxiEntity> implements JubenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JubenxinxiEntity> page = this.selectPage(
                new Query<JubenxinxiEntity>(params).getPage(),
                new EntityWrapper<JubenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JubenxinxiEntity> wrapper) {
		  Page<JubenxinxiView> page =new Query<JubenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JubenxinxiVO> selectListVO(Wrapper<JubenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JubenxinxiVO selectVO(Wrapper<JubenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JubenxinxiView> selectListView(Wrapper<JubenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JubenxinxiView selectView(Wrapper<JubenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
