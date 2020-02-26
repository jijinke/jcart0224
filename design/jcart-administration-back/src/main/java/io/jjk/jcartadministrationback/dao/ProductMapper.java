package io.jjk.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.jjk.jcartadministrationback.dto.out.ProductListOutDTO;
import io.jjk.jcartadministrationback.po.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int batchDelete(@Param("productIds") List<Integer> productIds);

    Page<ProductListOutDTO> search();
}