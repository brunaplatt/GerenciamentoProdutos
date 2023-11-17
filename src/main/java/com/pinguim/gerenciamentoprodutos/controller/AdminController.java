package com.pinguim.gerenciamentoprodutos.controller;

import com.pinguim.gerenciamentoprodutos.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/usuarios")
public class AdminController {
    @GetMapping("/Admin")
    public ModelAndView admin() {
        ModelAndView mv = new ModelAndView("usuarioAdmin");
        return mv;
    }

    private UsuarioService usuarioService;

    @GetMapping("/cadastrarUser")
    public ModelAndView cadastroUsuario() {
        ModelAndView mv = new ModelAndView("cadastroUser");
        return mv;
    }
}