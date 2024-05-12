package com.entity.view;

import com.entity.DiscusscantingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐厅信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 10:13:54
 */
@TableName("discusscantingxinxi")
public class DiscusscantingxinxiView  extends DiscusscantingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusscantingxinxiView(){
	}
 
 	public DiscusscantingxinxiView(DiscusscantingxinxiEntity discusscantingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusscantingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
