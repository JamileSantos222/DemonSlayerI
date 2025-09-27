package br.com.etecia.myapp;

public class Produto {
    private int imagem;
    private String nome;
    private String descricao;
    private String preco;

    public Produto(int imagem, String nome, String descricao, String preco) {
        this.imagem = imagem;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getImagem() {
        return imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPreco() {
        return preco;
    }
}
