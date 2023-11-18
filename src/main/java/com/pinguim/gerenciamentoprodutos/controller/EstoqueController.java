package com.pinguim.gerenciamentoprodutos.controller;

import com.pinguim.gerenciamentoprodutos.entity.Estoque;
import com.pinguim.gerenciamentoprodutos.entity.Produto;
import com.pinguim.gerenciamentoprodutos.service.EstoqueService;
import com.pinguim.gerenciamentoprodutos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/listaEstoque")
    public ModelAndView listaEstoque(){
        List<Estoque> estoqueList = this.estoqueService.listarEstoques();
        ModelAndView mv = new ModelAndView("estoque/listaEstoque");
        mv.addObject("estoqueList", estoqueList);
        return mv;
    }
    @GetMapping("/adicionarEstoque")
    public ModelAndView adicionarEstoque(){
        List<Produto> produtoList = this.produtoService.listarProdutos();
        ModelAndView mv = new ModelAndView("estoque/adicionarEstoque");
        mv.addObject("produtos", produtoList);
        return mv;
    }

    @PostMapping("/inserirEstoque")
    public String inserirEstoque(@Validated Estoque estoque, BindingResult result, RedirectAttributes redirectAttributes ){
        redirectAttributes.addFlashAttribute("mensagem","Salvo com sucesso");
        this.estoqueService.cadastrarEstoque(estoque);
        return "redirect:/adicionarEstoque";
    }

    @GetMapping("/editarEstoque/{codigo}")
    public ModelAndView editarEstoque(@PathVariable("codigo") Long codigo){
        List<Produto> produtoList = this.produtoService.listarProdutos();

        Estoque estoque = estoqueService.buscarEstoquePorId(codigo);
        ModelAndView mv = new ModelAndView("estoque/editarEstoque");
        mv.addObject("estoque", estoque);
        mv.addObject("produtos", produtoList);

        return mv;
    }
    @GetMapping("/deletarEstoque/{codigo}")
    public String excluirEstoque(@PathVariable("codigo") Long codigo){
        estoqueService.excluirEstoque(codigo);
        return "redirect:/listaEstoque";
    }
    @PostMapping("/alterarEstoque")
    public String alterarEstoque(@Validated Estoque produto, BindingResult result, RedirectAttributes redirectAttributes ){
        redirectAttributes.addFlashAttribute("mensagem","Salvo com sucesso");
        this.estoqueService.editarEstoque(produto);
        return "redirect:/adicionarEstoque";
    }
}
