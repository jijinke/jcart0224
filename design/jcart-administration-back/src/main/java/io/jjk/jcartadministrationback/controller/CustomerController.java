package io.jjk.jcartadministrationback.controller;

import io.jjk.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.jjk.jcartadministrationback.dto.out.CoustomerListOutDTO;
import io.jjk.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.jjk.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    public PageOutDTO<CoustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                  @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer sustomerId){

    }

}
