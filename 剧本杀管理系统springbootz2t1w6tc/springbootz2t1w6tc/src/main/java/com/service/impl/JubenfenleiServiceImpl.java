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


import com.dao.JubenfenleiDao;
import com.entity.JubenfenleiEntity;
import com.service.JubenfenleiService;
import com.entity.vo.JubenfenleiVO;
import com.entity.view.JubenfenleiView;

@Service("jubenfenleiService")
public class JubenfenleiServiceImpl extends ServiceImpl<JubenfenleiDao, JubenfenleiEntity> implements JubenfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JubenfenleiEntity> page = this.selectPage(
                new Query<JubenfenleiEntity>(params).getPage(),
                new EntityWrapper<JubenfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JubenfenleiEntity> wrapper) {
		  Page<JubenfenleiView> page =new Query<JubenfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JubenfenleiVO> selectListVO(Wrapper<JubenfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JubenfenleiVO selectVO(Wrapper<JubenfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JubenfenleiView> selectListView(Wrapper<JubenfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JubenfenleiView selectView(Wrapper<JubenfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
