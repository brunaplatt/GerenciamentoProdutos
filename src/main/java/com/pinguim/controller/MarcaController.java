package com.pinguim.controller;

import com.pinguim.entity.Marca;

import java.util.ArrayList;
import java.util.List;

public class MarcaController {
    private List<Marca> marcas;

    public MarcaController() {
        this.marcas = new ArrayList<>();
    }

    // Cadastro de marca
    public void cadastrarMarca(Marca marca) {
        marcas.add(marca);
    }

    // Edição de marca
    public void editarMarca(Marca marca) {
        // Implementar lógica de edição (pode envolver buscar a marca no banco de dados)
        // Exemplo: marcas.set(index, marca);
    }

    // Exclusão de marca
    public void excluirMarca(Marca marca) {
        marcas.remove(marca);
    }

    // Listagem de marcas
    public List<Marca> listarMarcas() {
        return marcas;
    }

    // Geração de relatório de marcas
    public void gerarRelatorioMarcas() {
        System.out.println("Relatório de Marcas:");
        for (Marca marca : marcas) {
            System.out.println(marca.toString());
        }
    }

    public static void main(String[] args) {
        // uso do MarcaController
        MarcaController marcaController = new MarcaController();

        // Cadastro de marcas
        Marca marca1 = new Marca(1, "Marca A");
        Marca marca2 = new Marca(2, "Marca B");

        marcaController.cadastrarMarca(marca1);
        marcaController.cadastrarMarca(marca2);

        // Listagem de marcas
        List<Marca> marcasCadastradas = marcaController.listarMarcas();
        System.out.println("Marcas Cadastradas:");
        for (Marca marca : marcasCadastradas) {
            System.out.println(marca.toString());
        }

        // Edição de marca
        marca1.setFabricante("Nova Marca A");
        marcaController.editarMarca(marca1);

        // Exclusão de marca
        marcaController.excluirMarca(marca2);

        // Listagem atualizada de marcas
        marcasCadastradas = marcaController.listarMarcas();
        System.out.println("Marcas Atualizadas:");
        for (Marca marca : marcasCadastradas) {
            System.out.println(marca.toString());
        }

        // Geração de relatório de marcas
        marcaController.gerarRelatorioMarcas();
    }
}
