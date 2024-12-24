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


import com.dao.DaojufenleiDao;
import com.entity.DaojufenleiEntity;
import com.service.DaojufenleiService;
import com.entity.vo.DaojufenleiVO;
import com.entity.view.DaojufenleiView;

@Service("daojufenleiService")
public class DaojufenleiServiceImpl extends ServiceImpl<DaojufenleiDao, DaojufenleiEntity> implements DaojufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaojufenleiEntity> page = this.selectPage(
                new Query<DaojufenleiEntity>(params).getPage(),
                new EntityWrapper<DaojufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaojufenleiEntity> wrapper) {
		  Page<DaojufenleiView> page =new Query<DaojufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DaojufenleiVO> selectListVO(Wrapper<DaojufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaojufenleiVO selectVO(Wrapper<DaojufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaojufenleiView> selectListView(Wrapper<DaojufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaojufenleiView selectView(Wrapper<DaojufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
