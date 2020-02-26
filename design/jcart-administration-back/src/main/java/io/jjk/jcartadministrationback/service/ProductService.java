package io.jjk.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.jjk.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.jjk.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.jjk.jcartadministrationback.dto.out.ProductListOutDTO;
import io.jjk.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
