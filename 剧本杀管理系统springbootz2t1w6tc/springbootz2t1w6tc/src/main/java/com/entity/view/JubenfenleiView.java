package com.entity.view;

import com.entity.JubenfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 剧本分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-12-18 00:18:54
 */
@TableName("jubenfenlei")
public class JubenfenleiView  extends JubenfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JubenfenleiView(){
	}
 
 	public JubenfenleiView(JubenfenleiEntity jubenfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, jubenfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
