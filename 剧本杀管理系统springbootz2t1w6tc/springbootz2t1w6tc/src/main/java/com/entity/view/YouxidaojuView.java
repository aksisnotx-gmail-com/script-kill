package com.entity.view;

import com.entity.YouxidaojuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 游戏道具
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
@TableName("youxidaoju")
public class YouxidaojuView  extends YouxidaojuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxidaojuView(){
	}
 
 	public YouxidaojuView(YouxidaojuEntity youxidaojuEntity){
 	try {
			BeanUtils.copyProperties(this, youxidaojuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
