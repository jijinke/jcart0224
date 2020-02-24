package io.jjk.jcartadministrationback.controller;

import io.jjk.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(){

        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId){

        return null;
    }


    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorGetProfileOutDTO administratorGetProfileOutDTO){

    }

}
