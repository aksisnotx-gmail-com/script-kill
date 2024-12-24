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

import com.entity.DaojufenleiEntity;
import com.entity.view.DaojufenleiView;

import com.service.DaojufenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 道具分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
@RestController
@RequestMapping("/daojufenlei")
public class DaojufenleiController {
    @Autowired
    private DaojufenleiService daojufenleiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaojufenleiEntity daojufenlei,
		HttpServletRequest request){
        EntityWrapper<DaojufenleiEntity> ew = new EntityWrapper<DaojufenleiEntity>();

		PageUtils page = daojufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daojufenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaojufenleiEntity daojufenlei, 
		HttpServletRequest request){
        EntityWrapper<DaojufenleiEntity> ew = new EntityWrapper<DaojufenleiEntity>();

		PageUtils page = daojufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daojufenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaojufenleiEntity daojufenlei){
       	EntityWrapper<DaojufenleiEntity> ew = new EntityWrapper<DaojufenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daojufenlei, "daojufenlei")); 
        return R.ok().put("data", daojufenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaojufenleiEntity daojufenlei){
        EntityWrapper< DaojufenleiEntity> ew = new EntityWrapper< DaojufenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daojufenlei, "daojufenlei")); 
		DaojufenleiView daojufenleiView =  daojufenleiService.selectView(ew);
		return R.ok("查询道具分类成功").put("data", daojufenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaojufenleiEntity daojufenlei = daojufenleiService.selectById(id);
        return R.ok().put("data", daojufenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaojufenleiEntity daojufenlei = daojufenleiService.selectById(id);
        return R.ok().put("data", daojufenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaojufenleiEntity daojufenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(daojufenlei);
        daojufenleiService.insert(daojufenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaojufenleiEntity daojufenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(daojufenlei);
        daojufenleiService.insert(daojufenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DaojufenleiEntity daojufenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daojufenlei);
        daojufenleiService.updateById(daojufenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daojufenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
