function login() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

// Simples verificação de usuário e senha
    if (username === 'usuario' && password === 'senha') {
        alert('Login bem-sucedido!');
    } else {
        alert('Usuário ou senha incorretos. Tente novamente.');
    }
}

function abrirNovaJanela() {
    var novaJanela = window.open('redefinirsenha.html', '_blank', 'width=400, height=300');
        novaJanela.addEventListener('load', function () {

            novaJanela.fecharJanela = function () {
                novaJanela.
                close();
            };
        });
}

function resetPassword() {
    var newPassword = document.getElementById('new-password').value;
    var confirmPassword = document.getElementById('confirm-password').value;

        if (newPassword === '' || confirmPassword === '') {
            alert('Por favor, preencha todos os campos.');
            return;
        }

        if (newPassword !== confirmPassword) {
            alert('As senhas não coincidem. Por favor, verifique e tente novamente.');
            return;
        }

             alert('Senha redefinida com sucesso!');
}

function senhaConfirmada() {
    window.opener.fecharJanela();
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