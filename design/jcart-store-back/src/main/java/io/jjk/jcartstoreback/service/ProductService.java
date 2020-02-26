package io.jjk.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.jjk.jcartstoreback.dto.out.ProductListOutDTO;
import io.jjk.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.stereotype.Service;

public interface ProductService {
    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);
}
