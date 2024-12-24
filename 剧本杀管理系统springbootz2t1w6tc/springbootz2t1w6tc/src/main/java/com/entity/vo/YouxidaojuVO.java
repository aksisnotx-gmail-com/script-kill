package com.entity.vo;

import com.entity.YouxidaojuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 游戏道具
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public class YouxidaojuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 道具分类
	 */
	
	private String daojufenlei;
		
	/**
	 * 适玩人群
	 */
	
	private String shiwanrenqun;
		
	/**
	 * 上架时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangjiashijian;
		
	/**
	 * 详情内容
	 */
	
	private String xiangqingneirong;
		
	/**
	 * 游戏介绍
	 */
	
	private String youxijieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Double price;
		
	/**
	 * 会员价
	 */
	
	private Double vipprice;
				
	
	/**
	 * 设置：名称
	 */
	 
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：道具分类
	 */
	 
	public void setDaojufenlei(String daojufenlei) {
		this.daojufenlei = daojufenlei;
	}
	
	/**
	 * 获取：道具分类
	 */
	public String getDaojufenlei() {
		return daojufenlei;
	}
				
	
	/**
	 * 设置：适玩人群
	 */
	 
	public void setShiwanrenqun(String shiwanrenqun) {
		this.shiwanrenqun = shiwanrenqun;
	}
	
	/**
	 * 获取：适玩人群
	 */
	public String getShiwanrenqun() {
		return shiwanrenqun;
	}
				
	
	/**
	 * 设置：上架时间
	 */
	 
	public void setShangjiashijian(Date shangjiashijian) {
		this.shangjiashijian = shangjiashijian;
	}
	
	/**
	 * 获取：上架时间
	 */
	public Date getShangjiashijian() {
		return shangjiashijian;
	}
				
	
	/**
	 * 设置：详情内容
	 */
	 
	public void setXiangqingneirong(String xiangqingneirong) {
		this.xiangqingneirong = xiangqingneirong;
	}
	
	/**
	 * 获取：详情内容
	 */
	public String getXiangqingneirong() {
		return xiangqingneirong;
	}
				
	
	/**
	 * 设置：游戏介绍
	 */
	 
	public void setYouxijieshao(String youxijieshao) {
		this.youxijieshao = youxijieshao;
	}
	
	/**
	 * 获取：游戏介绍
	 */
	public String getYouxijieshao() {
		return youxijieshao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Double getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：会员价
	 */
	 
	public void setVipprice(Double vipprice) {
		this.vipprice = vipprice;
	}
	
	/**
	 * 获取：会员价
	 */
	public Double getVipprice() {
		return vipprice;
	}
			
}
