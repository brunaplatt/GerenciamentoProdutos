package com.pinguim.gerenciamentoprodutos.controller;

import com.pinguim.gerenciamentoprodutos.entity.Produto;
import com.pinguim.gerenciamentoprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/produto")
public class ProdutoController {

    ProdutoRepository produtoRepository;

    @GetMapping ("/hello")
    public ResponseEntity<Produto> helloWord(){
        Produto produto = new Produto();
        produto.setModelo("Frost Free French Door A+++ - BRO85AK");
        produto.setAno(2022);
        produto.setFabricante("Brastemp");
        return new ResponseEntity<>(produto, HttpStatus.OK);
    }
    @GetMapping ("/listar")
    public List<Produto> listarProdutos(){

        return produtoRepository.buscarAtivos();
    }

    @GetMapping ("/buscarProdutos/{nome}")
    public List<Produto> buscarProdutos(@PathVariable("nome") String name){
        return produtoRepository.buscaPorNome(name);
    }

    @GetMapping ("/buscarPorFabricante/{fabricante}")
    public List<Produto> buscarPorFabricante(@PathVariable("fabricante") String fabricante){
        return produtoRepository.buscaPorFabricante(fabricante);
    }


    @PostMapping("/cadastrar")
    public String cadastrarProduto(@RequestBody Produto produto){
        produtoRepository.save(produto);
        return "Cadastrado com sucesso";
    }

    @PutMapping("/alterar")
    public String editarProduto(@RequestBody Produto produto){
        produtoRepository.save(produto);
        return "Produto alterado com sucesso";
    }

    @DeleteMapping("/excluir/{codigo}")
    public String excluirProduto(@PathVariable("codigo") Long codigo){
        produtoRepository.deleteById(codigo);
        return "Produto excluído com sucesso";
    }

    @GetMapping("/consultar/{codigo}")
    public Optional<Produto> consultaProduto(@PathVariable("codigo") Long codigo){
        return produtoRepository.findById(codigo);
    }
}