package com.pinguim.gerenciamentoprodutos.controller;

import com.pinguim.gerenciamentoprodutos.entity.Produto;
import com.pinguim.gerenciamentoprodutos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/listaProduto")
    public ModelAndView listaProduto(){
        List<Produto> produtoList = this.produtoService.listarProdutos();
        ModelAndView mv = new ModelAndView("produto/listaProduto");
        mv.addObject("produtoList", produtoList);
        return mv;
    }
    @GetMapping("/adicionarProduto")
    public ModelAndView adicionarProduto(){
        ModelAndView mv = new ModelAndView("produto/adicionarProduto");
        return mv;
    }

    @GetMapping("/gerarRelatorio")
    public ResponseEntity<List<Produto>> getRelatorio(@RequestParam String atributo) {
        List<Produto> produtos = produtoService.gerarRelatorio(atributo);
        return ResponseEntity.ok(produtos);
    }
}
