package com.entity.view;

import com.entity.MeishileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 10:13:54
 */
@TableName("meishileixing")
public class MeishileixingView  extends MeishileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeishileixingView(){
	}
 
 	public MeishileixingView(MeishileixingEntity meishileixingEntity){
 	try {
			BeanUtils.copyProperties(this, meishileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
