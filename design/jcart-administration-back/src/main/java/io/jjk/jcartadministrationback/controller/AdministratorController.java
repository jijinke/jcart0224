package io.jjk.jcartadministrationback.controller;

import io.jjk.jcartadministrationback.dto.in.AdministratorCreateInDTO;
import io.jjk.jcartadministrationback.dto.in.AdministratorResetPwdInDTO;
import io.jjk.jcartadministrationback.dto.in.AdministratorUpdateInDTO;
import io.jjk.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.jjk.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.jjk.jcartadministrationback.dto.out.AdministratorShowOutDTO;
import io.jjk.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer adminstratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorIds){

    }

}
