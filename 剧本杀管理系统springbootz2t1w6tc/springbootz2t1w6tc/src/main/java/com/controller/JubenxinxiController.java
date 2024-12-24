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

import com.entity.JubenxinxiEntity;
import com.entity.view.JubenxinxiView;

import com.service.JubenxinxiService;
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
 * 剧本信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
@RestController
@RequestMapping("/jubenxinxi")
public class JubenxinxiController {
    @Autowired
    private JubenxinxiService jubenxinxiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JubenxinxiEntity jubenxinxi,
		HttpServletRequest request){
        EntityWrapper<JubenxinxiEntity> ew = new EntityWrapper<JubenxinxiEntity>();

		PageUtils page = jubenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jubenxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JubenxinxiEntity jubenxinxi, 
		HttpServletRequest request){
        EntityWrapper<JubenxinxiEntity> ew = new EntityWrapper<JubenxinxiEntity>();

		PageUtils page = jubenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jubenxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JubenxinxiEntity jubenxinxi){
       	EntityWrapper<JubenxinxiEntity> ew = new EntityWrapper<JubenxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jubenxinxi, "jubenxinxi")); 
        return R.ok().put("data", jubenxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JubenxinxiEntity jubenxinxi){
        EntityWrapper< JubenxinxiEntity> ew = new EntityWrapper< JubenxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jubenxinxi, "jubenxinxi")); 
		JubenxinxiView jubenxinxiView =  jubenxinxiService.selectView(ew);
		return R.ok("查询剧本信息成功").put("data", jubenxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JubenxinxiEntity jubenxinxi = jubenxinxiService.selectById(id);
        return R.ok().put("data", jubenxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JubenxinxiEntity jubenxinxi = jubenxinxiService.selectById(id);
        return R.ok().put("data", jubenxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        JubenxinxiEntity jubenxinxi = jubenxinxiService.selectById(id);
        if(type.equals("1")) {
        	jubenxinxi.setThumbsupnum(jubenxinxi.getThumbsupnum()+1);
        } else {
        	jubenxinxi.setCrazilynum(jubenxinxi.getCrazilynum()+1);
        }
        jubenxinxiService.updateById(jubenxinxi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JubenxinxiEntity jubenxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jubenxinxi);
        jubenxinxiService.insert(jubenxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JubenxinxiEntity jubenxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jubenxinxi);
        jubenxinxiService.insert(jubenxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JubenxinxiEntity jubenxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jubenxinxi);
        jubenxinxiService.updateById(jubenxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jubenxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
