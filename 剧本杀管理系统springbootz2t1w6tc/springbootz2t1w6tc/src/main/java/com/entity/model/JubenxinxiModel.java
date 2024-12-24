package com.entity.model;

import com.entity.JubenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 剧本信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
public class JubenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 剧本分类
	 */
	
	private String jubenfenlei;
		
	/**
	 * 剧本封面
	 */
	
	private String jubenfengmian;
		
	/**
	 * 剧本简介
	 */
	
	private String jubenjianjie;
		
	/**
	 * 参与人数
	 */
	
	private Integer canyurenshu;
		
	/**
	 * 背景故事
	 */
	
	private String beijinggushi;
		
	/**
	 * 游戏规则
	 */
	
	private String youxiguize;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：剧本分类
	 */
	 
	public void setJubenfenlei(String jubenfenlei) {
		this.jubenfenlei = jubenfenlei;
	}
	
	/**
	 * 获取：剧本分类
	 */
	public String getJubenfenlei() {
		return jubenfenlei;
	}
				
	
	/**
	 * 设置：剧本封面
	 */
	 
	public void setJubenfengmian(String jubenfengmian) {
		this.jubenfengmian = jubenfengmian;
	}
	
	/**
	 * 获取：剧本封面
	 */
	public String getJubenfengmian() {
		return jubenfengmian;
	}
				
	
	/**
	 * 设置：剧本简介
	 */
	 
	public void setJubenjianjie(String jubenjianjie) {
		this.jubenjianjie = jubenjianjie;
	}
	
	/**
	 * 获取：剧本简介
	 */
	public String getJubenjianjie() {
		return jubenjianjie;
	}
				
	
	/**
	 * 设置：参与人数
	 */
	 
	public void setCanyurenshu(Integer canyurenshu) {
		this.canyurenshu = canyurenshu;
	}
	
	/**
	 * 获取：参与人数
	 */
	public Integer getCanyurenshu() {
		return canyurenshu;
	}
				
	
	/**
	 * 设置：背景故事
	 */
	 
	public void setBeijinggushi(String beijinggushi) {
		this.beijinggushi = beijinggushi;
	}
	
	/**
	 * 获取：背景故事
	 */
	public String getBeijinggushi() {
		return beijinggushi;
	}
				
	
	/**
	 * 设置：游戏规则
	 */
	 
	public void setYouxiguize(String youxiguize) {
		this.youxiguize = youxiguize;
	}
	
	/**
	 * 获取：游戏规则
	 */
	public String getYouxiguize() {
		return youxiguize;
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
			
}
