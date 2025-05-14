package br.senai.poo.avaliacao;

import java.util.ArrayList;

public class Exemplo {
    public static void main(String[] args) {
        Loja americanas = new Loja();

        Produto notebook = new Produto("Notebook", CategoriaProdutoEnum.ELETRONICO, 3000.0);
        System.out.println(notebook.exibirInformacoes(false));
        System.out.println(notebook.exibirInformacoes(true));

        Produto camisa = new Produto("Camisa", CategoriaProdutoEnum.ROUPA, 50.0);
        System.out.println(camisa.exibirInformacoes(false));
        System.out.println(camisa.exibirInformacoes(true));

        Produto chocolate = new Produto("Chocolate", CategoriaProdutoEnum.ALIMENTO, 5.0);
        System.out.println(chocolate.exibirInformacoes(false));
        System.out.println(chocolate.exibirInformacoes());

        Produto monitor = new Produto("Monitor", CategoriaProdutoEnum.ELETRONICO, 800.0);
        Produto calca = new Produto("Calça", CategoriaProdutoEnum.ROUPA, 140.0);

        americanas.adicionarProduto(notebook);
        americanas.adicionarProduto(camisa);
        americanas.adicionarProduto(chocolate);
        americanas.adicionarProduto(monitor);
        americanas.adicionarProduto(calca);

        System.out.println("========== Buscar por Nome ==========");
        Produto produtoBuscado = americanas.buscarPorNome("Camisa");
        System.out.println(produtoBuscado.exibirInformacoes());

        ArrayList<Produto> produtosEletronicos = americanas.buscarPorCategoria(CategoriaProdutoEnum.ELETRONICO);
        System.out.println("========== Produtos Eletrônicos ==========");
        for (Produto produto : produtosEletronicos) {
            System.out.println(produto.exibirInformacoes());
        }

        ArrayList<Produto> produtos = americanas.listarProdutos();
        System.out.println("========== Listar Produtos ==========");
        for (Produto produto : produtos) {
            System.out.println(produto.exibirInformacoes());
        }
    }
}
