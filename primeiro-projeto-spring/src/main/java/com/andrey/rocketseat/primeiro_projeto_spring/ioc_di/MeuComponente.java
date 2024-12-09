package com.andrey.rocketseat.primeiro_projeto_spring.ioc_di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//dependendo do objetivo pode ser @component

@Service
//@Component
public class MeuComponente {
    public String meuComponente(){
        return "Meu Componente";
    }
}
