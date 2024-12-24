package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 剧本信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
@TableName("jubenxinxi")
public class JubenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JubenxinxiEntity() {
		
	}
	
	public JubenxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 剧本名称
	 */
					
	private String jubenmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：剧本名称
	 */
	public void setJubenmingcheng(String jubenmingcheng) {
		this.jubenmingcheng = jubenmingcheng;
	}
	/**
	 * 获取：剧本名称
	 */
	public String getJubenmingcheng() {
		return jubenmingcheng;
	}
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
