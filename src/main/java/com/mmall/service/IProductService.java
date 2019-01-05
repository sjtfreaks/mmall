package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;

/**
 * Created by jet on 2018-12-21.
 */
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse setSaleStatus(Integer productId,Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
}
