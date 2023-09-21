package aula_2_desafio;

import a_classes_objetos.Pessoa;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<Carro>();
        String menu = "1- Cadastrar\n" +
                "2- Listar por periodo\n" +
                "3- Listar por cor";
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (op == 1) {
                Carro c = new Carro();
                c.cadastra();
                carros.add(c);
            } else if (op == 2) {
                int anoInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano incial: "));
                int anoFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano final: "));
                for (Carro c : carros) {
                    if (c.anoFabricacao <= anoFinal && c.anoFabricacao >= anoInicial) {
                        JOptionPane.showMessageDialog(null,"Estes são os automóveis listados: ");
                        c.listarDados();
                    }
                }


            }
        } while (op != 50);
    }
}