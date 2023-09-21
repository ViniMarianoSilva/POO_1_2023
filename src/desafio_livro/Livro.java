package desafio_livro;

import desafio_jogador.Jogador;

import java.util.ArrayList;

public class Livro {
    private String titulo; // minusculo
    private double preco; // Não pode menor que zero; Quando mostrar sempre usar p R$
    private ArrayList<Autor> autores = new ArrayList<Autor>();

    String exibir(){
        return "Titulo: " + getTitulo() + "\nPreço: R$" + getPreco() + "\nAutor(es): " + getAutores() + "\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
}


// Cadastrar Autores e Livros, listar todos os livros cadastrados (todos os dados
//do livro, inclusive os autores com todos os dados), pesquisar por autor (listar
//todos os livros de um autor), pesquisar por faixa de valor do livro (mínimo e
//máximo), listar todos os livros cujo autores tenham crianças (idade <=12), listar
//todos os livros que foram escritos apenas por mulheres ou por homens (o
//usuário informa qual sexo deseja realizar a consulta).