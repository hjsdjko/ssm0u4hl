package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CantingxinxiDao;
import com.entity.CantingxinxiEntity;
import com.service.CantingxinxiService;
import com.entity.vo.CantingxinxiVO;
import com.entity.view.CantingxinxiView;

@Service("cantingxinxiService")
public class CantingxinxiServiceImpl extends ServiceImpl<CantingxinxiDao, CantingxinxiEntity> implements CantingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CantingxinxiEntity> page = this.selectPage(
                new Query<CantingxinxiEntity>(params).getPage(),
                new EntityWrapper<CantingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CantingxinxiEntity> wrapper) {
		  Page<CantingxinxiView> page =new Query<CantingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CantingxinxiVO> selectListVO(Wrapper<CantingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CantingxinxiVO selectVO(Wrapper<CantingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CantingxinxiView> selectListView(Wrapper<CantingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CantingxinxiView selectView(Wrapper<CantingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
