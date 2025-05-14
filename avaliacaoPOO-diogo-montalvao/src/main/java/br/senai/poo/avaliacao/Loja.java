package br.senai.poo.avaliacao;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> produtos = new ArrayList<>();  // Encapsulamento

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Produto> listarProdutos() {
        return produtos;
    }

    public ArrayList<Produto> buscarPorCategoria(CategoriaProdutoEnum categoria) {
        ArrayList<Produto> produtosCategoria = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto.getCategoria() == categoria) produtosCategoria.add(produto); // Busca por categoria
        }

        return produtosCategoria;
    }

    public Produto buscarPorNome(String nome) {
        for (Produto produto : produtos) {
            if (nome.equalsIgnoreCase(produto.getNome())) return produto; // Busca por nome
        }

        return null;
    }
}

