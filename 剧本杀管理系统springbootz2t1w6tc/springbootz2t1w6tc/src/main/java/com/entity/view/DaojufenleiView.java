package com.entity.view;

import com.entity.DaojufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 道具分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
@TableName("daojufenlei")
public class DaojufenleiView  extends DaojufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaojufenleiView(){
	}
 
 	public DaojufenleiView(DaojufenleiEntity daojufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, daojufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
