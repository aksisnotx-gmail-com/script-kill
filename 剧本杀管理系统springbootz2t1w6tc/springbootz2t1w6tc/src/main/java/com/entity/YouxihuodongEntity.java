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
 * 游戏活动
 * 数据库通用操作实体类（普通增删改查）
 * @author
 * @email
 * @date 2024-12-18 00:18:54
 */
@TableName("youxihuodong")
public class YouxihuodongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouxihuodongEntity() {

	}

	public YouxihuodongEntity(T t) {
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
	 * 游戏角色
	 */

	private String youxijiaose;

	/**
	 * 活动信息
	 */

	private String huodongxinxi;

	/**
	 * 简介
	 */

	private String jianjie;

	/**
	 * 发布时间
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date fabushijian;

	/**
	 * 活动封面
	 */

	private String huodongfengmian;

	/**
	 * 活动费用
	 */

	private Integer huodongfeiyong;

	/**
	 * 赞
	 */

	private Integer thumbsupnum;

	/**
	 * 踩
	 */

	private Integer crazilynum;

	/**
	 * 倒计结束时间
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date reversetime;


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
	 * 设置：游戏角色
	 */
	public void setYouxijiaose(String youxijiaose) {
		this.youxijiaose = youxijiaose;
	}
	/**
	 * 获取：游戏角色
	 */
	public String getYouxijiaose() {
		return youxijiaose;
	}
	/**
	 * 设置：活动信息
	 */
	public void setHuodongxinxi(String huodongxinxi) {
		this.huodongxinxi = huodongxinxi;
	}
	/**
	 * 获取：活动信息
	 */
	public String getHuodongxinxi() {
		return huodongxinxi;
	}
	/**
	 * 设置：简介
	 */
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：活动封面
	 */
	public void setHuodongfengmian(String huodongfengmian) {
		this.huodongfengmian = huodongfengmian;
	}
	/**
	 * 获取：活动封面
	 */
	public String getHuodongfengmian() {
		return huodongfengmian;
	}
	/**
	 * 设置：活动费用
	 */
	public void setHuodongfeiyong(Integer huodongfeiyong) {
		this.huodongfeiyong = huodongfeiyong;
	}
	/**
	 * 获取：活动费用
	 */
	public Integer getHuodongfeiyong() {
		return huodongfeiyong;
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
	 * 设置：倒计结束时间
	 */
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}

}
