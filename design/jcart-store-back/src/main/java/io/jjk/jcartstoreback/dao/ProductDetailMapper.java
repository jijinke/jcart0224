package io.jjk.jcartstoreback.dao;

import io.jjk.jcartstoreback.po.ProductDetail;

public interface ProductDetailMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKeyWithBLOBs(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);
}