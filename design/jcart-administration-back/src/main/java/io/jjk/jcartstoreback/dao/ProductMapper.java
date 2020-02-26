package io.jjk.jcartstoreback.dao;

import com.github.pagehelper.Page;
import io.jjk.jcartadministrationback.dto.out.ProductListOutDTO;
import io.jjk.jcartstoreback.po.Product;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search();
}