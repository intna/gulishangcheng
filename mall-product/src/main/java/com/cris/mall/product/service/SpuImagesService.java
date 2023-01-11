package com.cris.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cris.common.utils.PageUtils;
import com.cris.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author cris
 * @email intna1027@gmail.com
 * @date 2023-01-11 14:02:20
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

