//função login
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

//função direcionar user comum e admin
function redirecionarUsuario(username) {
    if (username === 'admin') {
        window.location.href = 'usuarioadmin.html';
    } else {
        window.location.href = 'usuario.html';
    }
}

//abrir nova janela de reset senha
function abrirNovaJanela() {
    var novaJanela = window.open('redefinirsenha.html', '_blank', 'width=400, height=300');
        novaJanela.addEventListener('load', function (){
        });
}

//função resetar senha
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

// função botão flutuante página index.html
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

//Relatório Estoque
function gerarRelatorio() {
    var atributo = document.getElementById('atributo').value;
    fetch('/api/relatorio?atributo=' + atributo)
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro na requisição: ' + response.statusText);
            }
            return response.json();
        })
        .then(data => preencherTabela(data))
        .catch(error => console.error('Erro:', error));
}
        function preencherTabela(data) {
            var tabela = document.getElementById('tabela');
            tabela.innerHTML = "<tr><th>ID</th><th>Nome</th><th>Categoria</th><th>Ano</th><th>Fabricante</th>" +
                "<th>Voltagem</th><th>Litros</th><th>Cor</th><th>Preço</th><th>Status</th></tr>";

            // Preenche a tabela com os dados recebidos do backend
            data.forEach(function (item) {
                tabela.innerHTML += `<tr><td>${item.id}</td><td>${item.nome}</td><td>${item.categoria}</td><td>${item.ano}</td><td>${item.fabricante}</td><td>${item.voltagem}</td><td>${item.litros}</td><td>${item.cor}</td><td>${item.preco}</td><td>${item.status}</td></tr>`;
            });
}

//Listar Produtos
function listarProdutos() {
    var atributo = document.getElementById('atributo').value;

    // Faça uma requisição AJAX para o backend com o atributo selecionado
    fetch('/api/produtos?atributo=' + atributo)
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro na requisição: ' + response.statusText);
            }
            return response.json();
        })
        .then(data => preencherTabela(data))
        .catch(error => console.error('Erro:', error));
}

function preencherTabela(data) {
    var tabela = document.getElementById('tabela');
    tabela.innerHTML = "<tr><th>ID</th><th>Nome</th><th>Preço</th><th>Categoria</th></tr>";

    // Preenche a tabela com os dados recebidos do backend
    data.forEach(function (produto) {
        tabela.innerHTML += `<tr><td>${produto.id}</td><td>${produto.nome}</td><td>${produto.preco}</td><td>${produto.categoria}</td></tr>`;
    });
}

//Listar Estoque
function listarEstoque() {
    var atributo1 = document.getElementById('atributo1').value;
    var atributo2 = document.getElementById('atributo2').value;

    fetch('/api/produtos?atributo1=' + atributo1 + '&atributo2=' + atributo2)
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro na requisição: ' + response.statusText);
            }
            return response.json();
})      .then(data => preencherTabela(data))
        .catch(error => console.error('Erro:', error));
    }
//
function preencherTabela(data) {
    var tabela = document.getElementById('tabela');
    tabela.innerHTML = "<tr><th>Atributo 1</th><th>Atributo 2</th><th>Quantidade Disponível</th></tr>";

    var produtosAgrupados = {};
    data.forEach(function (produto) {
        var chave = produto[atributo1] + '-' + produto[atributo2];
        if (!produtosAgrupados[chave]) {
            produtosAgrupados[chave] = {
                atributo1: produto[atributo1],
                atributo2: produto[atributo2],
                quantidadeDisponivel: 0
            };
        }
        produtosAgrupados[chave].quantidadeDisponivel += produto.quantidadeDisponivel;
        });

        for (var chaveProduto in produtosAgrupados) {
            var produto = produtosAgrupados[chaveProduto];
            tabela.innerHTML += `<tr><td>${produto.atributo1}</td><td>${produto.atributo2}</td><td>${produto.quantidadeDisponivel}</td></tr>`;
        }
}