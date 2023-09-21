package desafio_livro;

import java.util.ArrayList;

public class Autor {
    private String nome; // duas palavras, pesquisar como fazer
    private String sexo; // Só Masculino e Feminino
    private int idade; // Não pode ser igual ou menor q 0
    private ArrayList<Livro> livros = new ArrayList<Livro>();

    String exibir(){
        return "Nome: " + getNome() + "\nSexo: " + getSexo() + "\nIdade: " + getIdade() + "\nLivros escritos: " +
                ;
    }

    String livrosEscritos(){
        livros.get
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}
