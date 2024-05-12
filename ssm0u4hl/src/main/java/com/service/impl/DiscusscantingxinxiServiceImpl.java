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


import com.dao.DiscusscantingxinxiDao;
import com.entity.DiscusscantingxinxiEntity;
import com.service.DiscusscantingxinxiService;
import com.entity.vo.DiscusscantingxinxiVO;
import com.entity.view.DiscusscantingxinxiView;

@Service("discusscantingxinxiService")
public class DiscusscantingxinxiServiceImpl extends ServiceImpl<DiscusscantingxinxiDao, DiscusscantingxinxiEntity> implements DiscusscantingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusscantingxinxiEntity> page = this.selectPage(
                new Query<DiscusscantingxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusscantingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusscantingxinxiEntity> wrapper) {
		  Page<DiscusscantingxinxiView> page =new Query<DiscusscantingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusscantingxinxiVO> selectListVO(Wrapper<DiscusscantingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusscantingxinxiVO selectVO(Wrapper<DiscusscantingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusscantingxinxiView> selectListView(Wrapper<DiscusscantingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusscantingxinxiView selectView(Wrapper<DiscusscantingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
