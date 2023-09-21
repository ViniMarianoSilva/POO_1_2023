package aula_2_correcao_clavison;

import javax.swing.*;

public class CarroClavison {

    String marca = JOptionPane.showInputDialog("Marca:");
    String cor;
    int ano;

    boolean cadastrar() {
        cor = JOptionPane.showInputDialog("Cor:");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
        return validaCadastro();
    }

    boolean validaCadastro() {
        if(marca.equals("")) {
            JOptionPane.showMessageDialog(null, "Marca é obrigatório");
            return false;
        }
        if(cor.equals("")) {
            JOptionPane.showMessageDialog(null, "Cor é obrigatório");
            return false;
        }
        if(ano < 1954 || ano > 2023) {
            JOptionPane.showMessageDialog(null, "Ano inválido");
            return false;
        }
        return true;
    }

    String exibir() {
        return marca + " - " + cor + " - " + ano + "\n";
    }

}
