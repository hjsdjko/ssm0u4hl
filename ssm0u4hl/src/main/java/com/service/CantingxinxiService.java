package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CantingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CantingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CantingxinxiView;


/**
 * 餐厅信息
 *
 * @author 
 * @email 
 * @date 2022-05-18 10:13:54
 */
public interface CantingxinxiService extends IService<CantingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CantingxinxiVO> selectListVO(Wrapper<CantingxinxiEntity> wrapper);
   	
   	CantingxinxiVO selectVO(@Param("ew") Wrapper<CantingxinxiEntity> wrapper);
   	
   	List<CantingxinxiView> selectListView(Wrapper<CantingxinxiEntity> wrapper);
   	
   	CantingxinxiView selectView(@Param("ew") Wrapper<CantingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CantingxinxiEntity> wrapper);
   	

}

