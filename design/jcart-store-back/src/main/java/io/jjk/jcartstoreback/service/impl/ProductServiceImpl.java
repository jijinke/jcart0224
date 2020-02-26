package io.jjk.jcartstoreback.service.impl;

import io.jjk.jcartstoreback.dao.ProductDetailMapper;
import io.jjk.jcartstoreback.dao.ProductMapper;
import io.jjk.jcartstoreback.dto.out.ProductListOutDTO;
import io.jjk.jcartstoreback.dto.out.ProductShowOutDTO;
import io.jjk.jcartstoreback.po.Product;
import io.jjk.jcartstoreback.po.ProductDetail;
import io.jjk.jcartstoreback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    public ProductShowOutDTO getById(Integer productId) {

        Product product = productMapper.selectByPrimaryKey(productId);
        ProductDetail productDetail = productDetailMapper.selectByPrimaryKey(productId);

        ProductShowOutDTO productShowOutDTO = new ProductShowOutDTO();
        productShowOutDTO.setProductId(product.getProductId());
        productShowOutDTO.setProductCode(product.getProductCode());
        productShowOutDTO.setProductName(product.getProductName());
        productShowOutDTO.setPrice(product.getPrice());
        productShowOutDTO.setDiscount(product.getDiscount());
        productShowOutDTO.setMainPicUrl(product.getMainPicUrl());
        productShowOutDTO.setRewordPoints(product.getRewordPoints());
        productShowOutDTO.setStockQuantity(product.getStockQuantity());

        productShowOutDTO.setDescription(productDetail.getDescription());
        String otherPicUrlsJson = productDetail.getOtherPicUrls();
        List<String> otherPicUrls = JSON.parseArray(otherPicUrlsJson, String.class);
        productShowOutDTO.setOtherPicUrls(otherPicUrls);

        return productShowOutDTO;
    }

    @Override
    public Page<ProductListOutDTO> search(Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<ProductListOutDTO> page = productMapper.search();
        return page;
    }
}
