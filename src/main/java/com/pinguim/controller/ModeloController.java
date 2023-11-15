package com.pinguim.controller;

import com.pinguim.entity.Modelo;

import java.util.ArrayList;
import java.util.List;

public class ModeloController {
    private List<Modelo> modelos;

    public ModeloController() {
        this.modelos = new ArrayList<>();
    }

    // Cadastro de modelo
    public void cadastrarModelo(Modelo modelo) {
        modelos.add(modelo);
    }

    // Edição de modelo
    public void editarModelo(Modelo modelo) {
        // Implementar lógica de edição (pode envolver buscar o modelo no banco de dados)
        // Exemplo: modelos.set(index, modelo);
    }

    // Exclusão de modelo
    public void excluirModelo(Modelo modelo) {
        modelos.remove(modelo);
    }

    // Listagem de modelos
    public List<Modelo> listarModelos() {
        return modelos;
    }

    // Geração de relatório de modelos
    public void gerarRelatorioModelos() {
        System.out.println("Relatório de Modelos:");
        for (Modelo modelo : modelos) {
            System.out.println(modelo.toString());
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso do ModeloController
        ModeloController modeloController = new ModeloController();

        // Cadastro de modelos
        Modelo modelo1 = new Modelo(1, "Modelo A", 2022, "110V", 300);
        Modelo modelo2 = new Modelo(2, "Modelo B", 2023, "220V", 500);

        modeloController.cadastrarModelo(modelo1);
        modeloController.cadastrarModelo(modelo2);

        // Listagem de modelos
        List<Modelo> modelosCadastrados = modeloController.listarModelos();
        System.out.println("Modelos Cadastrados:");
        for (Modelo modelo : modelosCadastrados) {
            System.out.println(modelo.toString());
        }

        // Edição de modelo
        modelo1.setAnoFabricacao(2023);
        modeloController.editarModelo(modelo1);

        // Exclusão de modelo
        modeloController.excluirModelo(modelo2);

        // Listagem atualizada de modelos
        modelosCadastrados = modeloController.listarModelos();
        System.out.println("Modelos Atualizados:");
        for (Modelo modelo : modelosCadastrados) {
            System.out.println(modelo.toString());
        }

        // Geração de relatório de modelos
        modeloController.gerarRelatorioModelos();
    }
}
