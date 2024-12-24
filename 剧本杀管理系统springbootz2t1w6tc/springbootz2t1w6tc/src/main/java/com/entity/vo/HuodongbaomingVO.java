package com.entity.vo;

import com.entity.HuodongbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 活动报名
 * @author
 * @email
 * @date 2024-12-18 00:18:54
 */
public class HuodongbaomingVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 游戏角色
	 */

	private String youxijiaose;

	/**
	 * 活动费用
	 */

	private Integer huodongfeiyong;

	/**
	 * 用户账号
	 */

	private String yonghuzhanghao;

	/**
	 * 用户姓名
	 */

	private String yonghuxingming;

	/**
	 * 报名时间
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date baomingshijian;

	/**
	 * 活动封面
	 */

	private String huodongfengmian;

	/**
	 * 报名备注
	 */

	private String baomingbeizhu;

	/**
	 * 是否审核
	 */

	private String sfsh;

	/**
	 * 审核回复
	 */

	private String shhf;

	/**
	 * 是否支付
	 */

	private String ispay;


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
	 * 设置：用户账号
	 */

	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}

	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}


	/**
	 * 设置：用户姓名
	 */

	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}

	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}


	/**
	 * 设置：报名时间
	 */

	public void setBaomingshijian(Date baomingshijian) {
		this.baomingshijian = baomingshijian;
	}

	/**
	 * 获取：报名时间
	 */
	public Date getBaomingshijian() {
		return baomingshijian;
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
	 * 设置：报名备注
	 */

	public void setBaomingbeizhu(String baomingbeizhu) {
		this.baomingbeizhu = baomingbeizhu;
	}

	/**
	 * 获取：报名备注
	 */
	public String getBaomingbeizhu() {
		return baomingbeizhu;
	}


	/**
	 * 设置：是否审核
	 */

	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}

	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}


	/**
	 * 设置：审核回复
	 */

	public void setShhf(String shhf) {
		this.shhf = shhf;
	}

	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}


	/**
	 * 设置：是否支付
	 */

	public void setIspay(String ispay) {
		this.ispay = ispay;
	}

	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
