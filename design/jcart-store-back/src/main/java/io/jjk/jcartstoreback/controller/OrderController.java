package io.jjk.jcartstoreback.controller;

import io.jjk.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.jjk.jcartstoreback.dto.out.OrderListOutDTO;
import io.jjk.jcartstoreback.dto.out.OrderShowOutDTO;
import io.jjk.jcartstoreback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }

}
