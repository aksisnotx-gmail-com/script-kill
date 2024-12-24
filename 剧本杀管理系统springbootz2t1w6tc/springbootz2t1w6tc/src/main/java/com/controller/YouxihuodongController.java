package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YouxihuodongEntity;
import com.entity.view.YouxihuodongView;

import com.service.YouxihuodongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 游戏活动
 * 后端接口
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
@RestController
@RequestMapping("/youxihuodong")
public class YouxihuodongController {
    @Autowired
    private YouxihuodongService youxihuodongService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouxihuodongEntity youxihuodong,
		HttpServletRequest request){
        EntityWrapper<YouxihuodongEntity> ew = new EntityWrapper<YouxihuodongEntity>();

		PageUtils page = youxihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxihuodong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouxihuodongEntity youxihuodong, 
		HttpServletRequest request){
        EntityWrapper<YouxihuodongEntity> ew = new EntityWrapper<YouxihuodongEntity>();

		PageUtils page = youxihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxihuodong), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouxihuodongEntity youxihuodong){
       	EntityWrapper<YouxihuodongEntity> ew = new EntityWrapper<YouxihuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youxihuodong, "youxihuodong")); 
        return R.ok().put("data", youxihuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouxihuodongEntity youxihuodong){
        EntityWrapper< YouxihuodongEntity> ew = new EntityWrapper< YouxihuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youxihuodong, "youxihuodong")); 
		YouxihuodongView youxihuodongView =  youxihuodongService.selectView(ew);
		return R.ok("查询游戏活动成功").put("data", youxihuodongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YouxihuodongEntity youxihuodong = youxihuodongService.selectById(id);
        return R.ok().put("data", youxihuodong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YouxihuodongEntity youxihuodong = youxihuodongService.selectById(id);
        return R.ok().put("data", youxihuodong);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        YouxihuodongEntity youxihuodong = youxihuodongService.selectById(id);
        if(type.equals("1")) {
        	youxihuodong.setThumbsupnum(youxihuodong.getThumbsupnum()+1);
        } else {
        	youxihuodong.setCrazilynum(youxihuodong.getCrazilynum()+1);
        }
        youxihuodongService.updateById(youxihuodong);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouxihuodongEntity youxihuodong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(youxihuodong);
        youxihuodongService.insert(youxihuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouxihuodongEntity youxihuodong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(youxihuodong);
        youxihuodongService.insert(youxihuodong);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YouxihuodongEntity youxihuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youxihuodong);
        youxihuodongService.updateById(youxihuodong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youxihuodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
