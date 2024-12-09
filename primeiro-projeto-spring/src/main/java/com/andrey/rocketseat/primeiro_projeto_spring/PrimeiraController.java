package com.andrey.rocketseat.primeiro_projeto_spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/")
    public String primeiroMetodo(){
        return "Primeiro metodo";
    }

    @GetMapping("/pegandoDadoUrl/{id}") //pegando dado pela url
    public String dadoUrl(@PathVariable int id){

        /*
         tem que coloca parametro no metodo que for pegar
         o dados da url com o @PathVariable e dizer qual
         vai ser o tipo de dado
        */

        return "O id pego na URL é " + id;
    }

    /*
        www.localhost:8080/primeiraController/queryParamns1?name=algum nome

        para apenas uma query/parametro na url
    */
    @GetMapping("/queryParamns1")
    public String dadosQueryParamns1(@RequestParam String name){
        return "O nome é " + name;
    }


    /*
        www.localhost:8080/primeiraController/queryParamns2?name=algum nome&idade

        para mais de uma query/parametro na url
    */
    @GetMapping("/queryParamns2")
    public String dadosQueryParamns2(@RequestParam String name, @RequestParam int idade){
        return "O nome é " + name + " a idade é " + idade;
    }

    /*
        www.localhost:8080/primeiraController/queryParamns3?name=algum nome&idade

        para mais de uma query/parametro na url sem ter que passar um monte de
        parametro no metodo
    */
    @GetMapping("/queryParamns3")
    public String dadosQueryParamns3(@RequestParam Map<String,String> allParams){
        // <tipo da chave, tipo do valor>

        return "Parametro da url: " + allParams.entrySet();
    }


    /*
    pegando dados por body sem classe
    */
    @PostMapping("/postBody")
    public String postBody(@RequestBody String email){
        return "Dado recebido do body " + email;
    }

    //com classe
    record Usuario(String email){ //classe simples
    }

    @PostMapping("/postBodyClass")
    public String postBodyClass(@RequestBody Usuario usuario){
        return "Dado recebido em post class " + usuario.email;
    }

    /*pegando dados do header sem classe*/
    @PostMapping("/postHeader")
    public String postHeader(@RequestHeader String name){
        return "Nome pego no header " + name;
    }

    /*pegando dados do header com classe*/
    record User(String name){}

    @PostMapping("/postHeaderClass")
    public String postHeaderClasse(@RequestHeader User user){
        return "Nome pego no header " + user.name;
    }

    /*pegando varios dados do header*/
    @PostMapping("/postHeaderLista")
    public String postHeaderLista(@RequestHeader Map<String, String> headers){
        return "Nome pego no header " + headers.entrySet();
    }

    //passando um responseEntity
    @GetMapping("/rotaErro/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable int id){
        if (id < 0){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ID Invalido");

        }

        return ResponseEntity.ok().body(new Usuario("andrey@mail.com"));
    }
}
