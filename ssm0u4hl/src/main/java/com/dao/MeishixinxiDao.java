package com.dao;

import com.entity.MeishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishixinxiVO;
import com.entity.view.MeishixinxiView;


/**
 * 美食信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 10:13:54
 */
public interface MeishixinxiDao extends BaseMapper<MeishixinxiEntity> {
	
	List<MeishixinxiVO> selectListVO(@Param("ew") Wrapper<MeishixinxiEntity> wrapper);
	
	MeishixinxiVO selectVO(@Param("ew") Wrapper<MeishixinxiEntity> wrapper);
	
	List<MeishixinxiView> selectListView(@Param("ew") Wrapper<MeishixinxiEntity> wrapper);

	List<MeishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<MeishixinxiEntity> wrapper);
	
	MeishixinxiView selectView(@Param("ew") Wrapper<MeishixinxiEntity> wrapper);
	

}
