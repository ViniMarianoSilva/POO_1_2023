package b_encapsulamento;

import java.util.Locale;

public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome.toUpperCase(Locale.ROOT);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
