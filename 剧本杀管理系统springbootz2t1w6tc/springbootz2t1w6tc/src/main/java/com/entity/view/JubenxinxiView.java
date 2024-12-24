package com.entity.view;

import com.entity.JubenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 剧本信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
@TableName("jubenxinxi")
public class JubenxinxiView  extends JubenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JubenxinxiView(){
	}
 
 	public JubenxinxiView(JubenxinxiEntity jubenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jubenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
