package com.pinguim.gerenciamentoprodutos.controller;

import com.pinguim.gerenciamentoprodutos.entity.Usuario;
import com.pinguim.gerenciamentoprodutos.service.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Objects;


@Controller
class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listaUsuario")
    public ModelAndView listaUsuario(){
        List<Usuario> usuarioList = this.usuarioService.listarUsuarios();
        ModelAndView mv = new ModelAndView("usuario/listaUsuario");
        mv.addObject("usuarioList", usuarioList);
        return mv;
    }

    @GetMapping("/adicionarUsuario")
    public ModelAndView adicionarUsuario(){
        ModelAndView mv = new ModelAndView("Usuario/adicionarUsuario");
        return mv;
    }

    @PostMapping("/inserirUsuario")
    public String inserirUsuario(@Validated Usuario Usuario, BindingResult result, RedirectAttributes redirectAttributes ){
        redirectAttributes.addFlashAttribute("mensagem","Salvo com sucesso");
        this.usuarioService.cadastrarUsuario(Usuario);
        return "redirect:/adicionarUsuario";
    }

    @GetMapping("/editarUsuario/{codigo}")
    public ModelAndView editarUsuario(@PathVariable("codigo") Long codigo){
        Usuario Usuario = usuarioService.buscarUsuarioPorId(codigo);
        int adm = 0;
        if (Usuario.getUsuarioAdm()){
            adm = 1;
        }
        System.out.println(adm);
        ModelAndView mv = new ModelAndView("usuario/editarUsuario");
        mv.addObject("usuario", Usuario);
        mv.addObject("adm", adm);
        return mv;
    }
    @GetMapping("/deletarUsuario/{codigo}")
    public String excluirUsuario(@PathVariable("codigo") Long codigo){
        usuarioService.excluirUsuario(codigo);
        return "redirect:/listaUsuario";
    }
    @PostMapping("/alterarUsuario")
    public String alterarUsuario(@Validated Usuario Usuario, BindingResult result, RedirectAttributes redirectAttributes ){
        redirectAttributes.addFlashAttribute("mensagem","Salvo com sucesso");
        this.usuarioService.editarUsuario(Usuario);
        return "redirect:/editarUsuario/"+Usuario.getId();
    }

    @PostMapping("/autenticacao")
    public String autenticacao(@ModelAttribute Usuario usuario, BindingResult result, RedirectAttributes redirectAttributes, HttpServletRequest request ){
        Usuario usuarioEncontrado = this.usuarioService.buscaPorNome(usuario.getNome());
        if (usuarioEncontrado == null) {
            return "redirect:/";
        }
        if (Objects.equals(usuarioEncontrado.getSenha(), usuario.getSenha())){
            request.getSession().setAttribute("adm", usuarioEncontrado.getUsuarioAdm());
            return "redirect:/listaProduto";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/Admin")
    public ModelAndView admin() {
        ModelAndView mv = new ModelAndView("usuarioAdmin");
        return mv;
    }
}