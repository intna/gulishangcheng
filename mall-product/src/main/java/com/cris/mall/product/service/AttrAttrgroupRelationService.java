package com.cris.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cris.common.utils.PageUtils;
import com.cris.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author cris
 * @email intna1027@gmail.com
 * @date 2023-01-11 14:02:20
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

