package io.jjk.jcartstoreback.controller;

import io.jjk.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.jjk.jcartstoreback.dto.in.ProductSearchInDTO;
import io.jjk.jcartstoreback.dto.out.PageOutDTO;
import io.jjk.jcartstoreback.dto.out.ProductListOutDTO;
import io.jjk.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(@RequestBody ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){

        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return  null;
    }

}
