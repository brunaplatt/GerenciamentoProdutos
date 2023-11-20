package com.pinguim.gerenciamentoprodutos.autenticacao;

import com.pinguim.gerenciamentoprodutos.entity.Usuario;
import com.pinguim.gerenciamentoprodutos.repository.UsuarioRepository;
import com.pinguim.gerenciamentoprodutos.security.TokenService;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("autent")
public class AutentController {

    @Autowired
    private final AuthenticationManager authenticationManager;

    @Autowired
    private final UsuarioRepository repository;

    @Autowired
    private final TokenService tokenService;

    public AutentController(AuthenticationManager authenticationManager, UsuarioRepository repository, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.repository = repository;
        this.tokenService = tokenService;
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AutentDTO data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var autent = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((Usuario) autent.getprincipal());
        return ResponseEntity.ok(new LoginDTO(token));
    }

    @PostMapping
    public ResponseEntity cadastro(@RequestBody @Valid RegisterDTO data){
        if(this.repository.findByLogin(data.login()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        Usuario newUsuario = new Usuario(data.login(), encryptedPassword, data.role());

        this.repository.save(newUsuario);
    }
}
