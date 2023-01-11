package com.cris.mall.product.dao;

import com.cris.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cris
 * @email intna1027@gmail.com
 * @date 2023-01-11 14:02:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
