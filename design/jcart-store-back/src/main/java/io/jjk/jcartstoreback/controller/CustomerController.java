package io.jjk.jcartstoreback.controller;

import io.jjk.jcartstoreback.dto.in.CustomerChangePwdInDTO;
import io.jjk.jcartstoreback.dto.in.CustomerLoginInDTO;
import io.jjk.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.jjk.jcartstoreback.dto.in.CustomerResetPwdInDTO;
import io.jjk.jcartstoreback.dto.out.CustomerGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/register")
    public Integer register(@RequestBody CustomerRegisterInDTO customerRegisterInDTO){
        return null;
    }

    @GetMapping("/login")
    public String login(CustomerLoginInDTO customerLoginInDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public CustomerGetProfileOutDTO getProfile(@RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody CustomerRegisterInDTO customerRegisterInDTO,
                              @RequestAttribute Integer customerId){

    }

    @PostMapping("/changePwd")
    public void changePwd(@RequestBody CustomerChangePwdInDTO customerChangePwdInDTO,
                          @RequestAttribute Integer customerId){

    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){

        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody CustomerResetPwdInDTO customerResetPwdInDTO){

    }

}
