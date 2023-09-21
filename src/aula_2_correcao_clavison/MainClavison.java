package aula_2_correcao_clavison;

import aula_2_desafio.Carro;

import javax.swing.*;
import java.util.ArrayList;

public class MainClavison {
    public static void main(String[] args) {
        ArrayList<CarroClavison> lista = new ArrayList<CarroClavison>();

        String menu = "1 - Cadastrar\n"
                + "2 - Buscar por ano de fabricação\n"
                + "3 - Buscar por marca\n"
                + "4 - Buscar por Cor\n\n"
                + "5 - Sair";
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if(op == 1) {
                CarroClavison c = new CarroClavison();
                if(c.cadastrar()) {
                    lista.add(c);
                }
            }

            if(op == 2) {
                buscaPorPeriodo(lista);
            }

            if(op == 3) {
                buscaPorMarca(lista);
            }

            if(op == 4) {
                buscaPorCor(lista);
            }

        }while(op!=5);
    }


    static void buscaPorPeriodo(ArrayList<CarroClavison> lista) {
        int anoI = Integer.parseInt(JOptionPane.showInputDialog("Ano Inicial:"));
        int anoF = Integer.parseInt(JOptionPane.showInputDialog("Ano Final:"));
        String dados = "";
        int total = 0;
        for( CarroClavison c : lista ) {
            if(c.ano >= anoI && c.ano <= anoF) {
                dados += c.exibir();
                total ++;
            }
        }
        dados += calcPercentual(lista.size(), total);
        JOptionPane.showMessageDialog(null, dados);
    }
    static void buscaPorMarca(ArrayList<CarroClavison> lista) {
        String marca = JOptionPane.showInputDialog("Marca:");
        String dados = "";
        int total = 0;
        for( CarroClavison c : lista ) {
            if(c.marca.equalsIgnoreCase(marca)) {
                dados += c.exibir();
                total ++;
            }
        }
        dados += calcPercentual(lista.size(), total);
        JOptionPane.showMessageDialog(null, dados);
    }

    static void buscaPorCor(ArrayList<CarroClavison> lista) {
        String cor = JOptionPane.showInputDialog("Cor:");
        String dados = "";
        int total = 0;
        for( CarroClavison c : lista ) {
            if(c.cor.equalsIgnoreCase(cor)) {
                dados += c.exibir();
                total ++;
            }
        }
        dados += calcPercentual(lista.size(), total);
        JOptionPane.showMessageDialog(null, dados);
    }

    static String calcPercentual(int total, int encontrados) {
        double perc = (double)encontrados / (double)total * 100;
        return "Percentual em relação ao total: "+perc+"%";
    }
}
