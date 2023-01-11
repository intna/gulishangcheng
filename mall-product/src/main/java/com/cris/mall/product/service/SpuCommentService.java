package com.cris.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cris.common.utils.PageUtils;
import com.cris.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author cris
 * @email intna1027@gmail.com
 * @date 2023-01-11 14:02:20
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

