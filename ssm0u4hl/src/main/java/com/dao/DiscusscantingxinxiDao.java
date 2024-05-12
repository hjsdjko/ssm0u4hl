package com.dao;

import com.entity.DiscusscantingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusscantingxinxiVO;
import com.entity.view.DiscusscantingxinxiView;


/**
 * 餐厅信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-18 10:13:54
 */
public interface DiscusscantingxinxiDao extends BaseMapper<DiscusscantingxinxiEntity> {
	
	List<DiscusscantingxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);
	
	DiscusscantingxinxiVO selectVO(@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);
	
	List<DiscusscantingxinxiView> selectListView(@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);

	List<DiscusscantingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);
	
	DiscusscantingxinxiView selectView(@Param("ew") Wrapper<DiscusscantingxinxiEntity> wrapper);
	

}
