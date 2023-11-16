function login() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    var autorizado = (username === 'admin' && password === 'admin123');

    if (autorizado) {
        redirecionarUsuario(username);
    } else {
        alert('Credenciais inválidas');
    }
}

function redirecionarUsuario(username) {
    if (username === 'admin') {
        window.location.href = 'usuarioadmin.html';
    } else {
        window.location.href = 'usuario.html';
    }
}

function abrirNovaJanela() {
    var novaJanela = window.open('redefinirsenha.html', '_blank', 'width=400, height=300');
        novaJanela.addEventListener('load', function (){
        });
}

function resetPassword() {
    var newPassword = document.getElementById('new-password').value;
    var confirmPassword = document.getElementById('confirm-password').value;

        if (isCampoVazio(newPassword) || isCampoVazio(confirmPassword)) {
            alert('Por favor, preencha todos os campos.');
            return;
        }

        if (newPassword !== confirmPassword) {
            alert('As senhas não coincidem. Por favor, verifique e tente novamente.');
            return;
        }
        // Definir lógica de alteração de senha, junto com o Banco de Dados.
        if (newPassword === confirmPassword){
            alert('Senha redefinida com sucesso!');
        }
}

function isCampoVazio(campo) {
    return campo.trim() === '';
}

function senhaConfirmada() {
    window.close();
}

window.onscroll = function () { scrollFunction() };
function scrollFunction() {
    var btnTopo = document.getElementById("btnTop");
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        btnTopo.style.display = "block";
    } else {
        btnTopo.style.display = "none";
    }
}
function scrollToTop() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}