package aula_2_desafio;

import javax.swing.*;

public class Carro {
    String cor;
    int anoFabricacao;
    String marca;

    void cadastra(String marca, int anoFabricacao, String cor) {
        this.marca = JOptionPane.showInputDialog("Informe a marca do automóvel : ");
        this.anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do automóvel: "));
        this.cor = JOptionPane.showInputDialog("Informe a cor de seu automóvel: ");
    }
    void listarDados(){
        JOptionPane.showMessageDialog(null, "Marca: " + marca + "\n" +
                "Ano de fabricação: " + anoFabricacao + "\n" +
                "Cor: " + cor + "\n");
    }
}


