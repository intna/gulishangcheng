package com.cris.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cris.common.utils.PageUtils;
import com.cris.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author cris
 * @email intna1027@gmail.com
 * @date 2023-01-11 14:02:20
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

