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
import com.entity.OrdersEntity;
import com.service.OrdersService;

import com.entity.YouxidaojuEntity;
import com.entity.view.YouxidaojuView;

import com.service.YouxidaojuService;
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
 * 游戏道具
 * 后端接口
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
@RestController
@RequestMapping("/youxidaoju")
public class YouxidaojuController {
    @Autowired
    private YouxidaojuService youxidaojuService;

    @Autowired
    private StoreupService storeupService;

    @Autowired
    private OrdersService ordersService;


    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouxidaojuEntity youxidaoju,
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<YouxidaojuEntity> ew = new EntityWrapper<YouxidaojuEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = youxidaojuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxidaoju), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouxidaojuEntity youxidaoju, 
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<YouxidaojuEntity> ew = new EntityWrapper<YouxidaojuEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = youxidaojuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxidaoju), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouxidaojuEntity youxidaoju){
       	EntityWrapper<YouxidaojuEntity> ew = new EntityWrapper<YouxidaojuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youxidaoju, "youxidaoju")); 
        return R.ok().put("data", youxidaojuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouxidaojuEntity youxidaoju){
        EntityWrapper< YouxidaojuEntity> ew = new EntityWrapper< YouxidaojuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youxidaoju, "youxidaoju")); 
		YouxidaojuView youxidaojuView =  youxidaojuService.selectView(ew);
		return R.ok("查询游戏道具成功").put("data", youxidaojuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YouxidaojuEntity youxidaoju = youxidaojuService.selectById(id);
		youxidaoju.setClicknum(youxidaoju.getClicknum()+1);
		youxidaoju.setClicktime(new Date());
		youxidaojuService.updateById(youxidaoju);
        youxidaoju = youxidaojuService.selectView(new EntityWrapper<YouxidaojuEntity>().eq("id", id));
        return R.ok().put("data", youxidaoju);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YouxidaojuEntity youxidaoju = youxidaojuService.selectById(id);
		youxidaoju.setClicknum(youxidaoju.getClicknum()+1);
		youxidaoju.setClicktime(new Date());
		youxidaojuService.updateById(youxidaoju);
        youxidaoju = youxidaojuService.selectView(new EntityWrapper<YouxidaojuEntity>().eq("id", id));
        return R.ok().put("data", youxidaoju);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        YouxidaojuEntity youxidaoju = youxidaojuService.selectById(id);
        if(type.equals("1")) {
        	youxidaoju.setThumbsupnum(youxidaoju.getThumbsupnum()+1);
        } else {
        	youxidaoju.setCrazilynum(youxidaoju.getCrazilynum()+1);
        }
        youxidaojuService.updateById(youxidaoju);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouxidaojuEntity youxidaoju, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(youxidaoju);
        youxidaojuService.insert(youxidaoju);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouxidaojuEntity youxidaoju, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(youxidaoju);
        youxidaojuService.insert(youxidaoju);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YouxidaojuEntity youxidaoju, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youxidaoju);
        youxidaojuService.updateById(youxidaoju);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youxidaojuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,YouxidaojuEntity youxidaoju, HttpServletRequest request,String pre){
        EntityWrapper<YouxidaojuEntity> ew = new EntityWrapper<YouxidaojuEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = youxidaojuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxidaoju), params), params));
        return R.ok().put("data", page);
    }


        /**
     * 协同算法（按用户购买推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,YouxidaojuEntity youxidaoju, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String goodtypeColumn = "daojufenlei";
        List<OrdersEntity> orders = ordersService.selectList(new EntityWrapper<OrdersEntity>().eq("userid", userId).eq("tablename", "youxidaoju").orderBy("addtime", false));
        List<String> goodtypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<YouxidaojuEntity> youxidaojuList = new ArrayList<YouxidaojuEntity>();
	//去重
    	List<OrdersEntity> ordersDist = new ArrayList<OrdersEntity>();
    	for(OrdersEntity o1 : orders) {
    		boolean addFlag = true;
    		for(OrdersEntity o2 : ordersDist) {
    			if(o1.getGoodid()==o2.getGoodid() || o1.getGoodtype().equals(o2.getGoodtype())) {
    				addFlag = false;
    				break;
    			}
    		}
    		if(addFlag) ordersDist.add(o1);
    	}
        if(ordersDist!=null && ordersDist.size()>0) {
                for(OrdersEntity o : ordersDist) {
                        youxidaojuList.addAll(youxidaojuService.selectList(new EntityWrapper<YouxidaojuEntity>().eq(goodtypeColumn, o.getGoodtype())));
                }
        }
        EntityWrapper<YouxidaojuEntity> ew = new EntityWrapper<YouxidaojuEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = youxidaojuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxidaoju), params), params));
        List<YouxidaojuEntity> pageList = (List<YouxidaojuEntity>)page.getList();
        if(youxidaojuList.size()<limit) {
                int toAddNum = (limit-youxidaojuList.size())<=pageList.size()?(limit-youxidaojuList.size()):pageList.size();
                for(YouxidaojuEntity o1 : pageList) {
                    boolean addFlag = true;
                    for(YouxidaojuEntity o2 : youxidaojuList) {
                        if(o1.getId().intValue()==o2.getId().intValue()) {
                            addFlag = false;
                            break;
                        }
                    }
                    if(addFlag) {
                        youxidaojuList.add(o1);
                        if(--toAddNum==0) break;
                    }   
                }
        } else if(youxidaojuList.size()>limit) {
            youxidaojuList = youxidaojuList.subList(0, limit);
        }
        page.setList(youxidaojuList);
        return R.ok().put("data", page);
    }








}
