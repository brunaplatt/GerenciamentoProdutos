package com.pinguim.gerenciamentoprodutos.controller;

import com.pinguim.gerenciamentoprodutos.entity.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/gerenciamento")
public class GerencimentoController {

    @GetMapping ("/hello")
    public ResponseEntity<Produto> helloWord(){
        Produto produto = new Produto();
        produto.setModelo("Frost Free French Door A+++ - BRO85AK");
        produto.setAno(2022);
        produto.setFabricante("Brastemp");
        return new ResponseEntity<>(produto, HttpStatus.OK);
    }

    @PostMapping
    public String cadastrarProduto(@RequestBody Produto produto){

        return "Cadastrado com sucesso";
    }

    @PutMapping("/alterar/{codigo}")
    public String editarProduto(@RequestBody Produto produto, @PathVariable("codigo") int codigo){
        return "Produto alterado com sucesso";
    }

    @DeleteMapping("/excluir/{codigo}")
    public String excluirProduto(@PathVariable("codigo") int codigo){
        return "Produto excluído com sucesso";
    }

    @GetMapping("/consultar/")
    public Produto consultaProduto(){
        Produto produto = new Produto();
        produto.setModelo("Frost Free French Door A+++ - BRO85AK");
        produto.setAno(2022);
        produto.setFabricante("Brastemp");
        produto.setCategoria("Refrigerador");
        return produto;
    }
}
