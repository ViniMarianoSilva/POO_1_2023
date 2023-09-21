package aula_2_desafio;

import javax.swing.*;

public class Carro {
    String cor;
    int anoFabricacao;
    String marca;

    void cadastra() {
        marca = JOptionPane.showInputDialog("Informe a marca do automóvel : ");
        anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do automóvel: "));
        cor = JOptionPane.showInputDialog("Informe a cor de seu automóvel: ");
    }
    void listarDados(){
        JOptionPane.showMessageDialog(null, "Marca: " + marca + "\n" +
                "Ano de fabricação: " + anoFabricacao + "\n" +
                "Cor: " + cor + "\n");
    }
}


