package com.cris.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cris.common.utils.PageUtils;
import com.cris.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author cris
 * @email intna1027@gmail.com
 * @date 2023-01-11 14:02:20
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

