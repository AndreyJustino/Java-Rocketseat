package com.andrey.rocketseat.primeiro_projeto_spring.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meuComponente")
public class MeuComponenteController {

    @Autowired
    MeuComponente meuComponente;

    @GetMapping("/")
    public String iocDic(){
        return meuComponente.meuComponente();
    }

}
