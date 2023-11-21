package com.pinguim.gerenciamentoprodutos.controller;

import com.pinguim.gerenciamentoprodutos.entity.Produto;
import com.pinguim.gerenciamentoprodutos.repository.ProdutoRepository;
import com.pinguim.gerenciamentoprodutos.service.ProdutoService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;
    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("/listaProduto")
    public ModelAndView listaProduto( HttpServletRequest request){
        Object teste = request.getSession().getAttribute("admin");
        System.out.println(teste);
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

    @PostMapping("/inserirProduto")
    public String inserirProduto(@Validated Produto produto, BindingResult result, RedirectAttributes redirectAttributes ){
        redirectAttributes.addFlashAttribute("mensagem","Salvo com sucesso");
        this.produtoService.cadastrarProduto(produto);
        return "redirect:/adicionarProduto";
    }

    @GetMapping("/editarProduto/{codigo}")
    public ModelAndView editarProduto(@PathVariable("codigo") Long codigo){
        Produto produto = produtoService.buscarProdutoPorId(codigo);
        ModelAndView mv = new ModelAndView("produto/editarProduto");
        mv.addObject("produto", produto);
        return mv;
    }
    @GetMapping("/deletarProduto/{codigo}")
    public String excluirProduto(@PathVariable("codigo") Long codigo){
        produtoService.excluirProduto(codigo);
        return "redirect:/listaProduto";
    }
    @PostMapping("/alterarProduto")
    public String alterarProduto(@Validated Produto produto, BindingResult result, RedirectAttributes redirectAttributes ){
        redirectAttributes.addFlashAttribute("mensagem","Salvo com sucesso");
        this.produtoService.editarProduto(produto);
        return "redirect:/adicionarProduto";
    }
    @GetMapping("/gerarRelatorio")
    public ResponseEntity<List<Produto>> getRelatorio(@RequestParam String atributo) {
        List<Produto> produtos = produtoService.gerarRelatorio(atributo);
        return ResponseEntity.ok(produtos);
    }
}
