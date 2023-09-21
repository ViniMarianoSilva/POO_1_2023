package desafio_jogador;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;

import static javax.swing.UIManager.get;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Time> lista = new ArrayList<Time>();

        String menu = "1 - Cadastrar Time\n"
                + "2 - Buscar jogadores por time\n"
                + "3 - Buscar artilheiro campeonato\n"
                + "4 - Buscar time que tem mais gols\n\n"
                + "5 - Sair";
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (op == 1) {
                Time t = new Time();
                t.cadastrar();
                lista.add(t);
            } else if (op == 2) {
                String nomeTime = JOptionPane.showInputDialog(null, "Nome do time: ").toUpperCase();
                for (Time t : lista) {
                    if (t.getNome().toUpperCase().equals(nomeTime)) {
                        JOptionPane.showMessageDialog(null, t.exibir());
                    }
                }
            } else if (op == 3) {
                String mostrarArtilheiro = "";
                Jogador artilheiro = new Jogador();
                artilheiro.setGols(0);
                for (Time t : lista) {
                    if (artilheiro.getGols() < t.artilheiroTime().getGols()) {
                        artilheiro.setGols(t.artilheiroTime().getGols());
                        mostrarArtilheiro = t.artilheiroTime().exibir();
                    }
                }
                JOptionPane.showMessageDialog(null, "O artilheiro do Campeonato é: " + mostrarArtilheiro);
            } else if (op == 4) {
                int golsTime = 0;
                String mostrarTime = "";
                for (Time t : lista) {
                    if (golsTime < t.getGolsTime()) {
                        golsTime = t.getGolsTime();
                        mostrarTime = "O time que mais fez gols no campeonato foi o(a) " + t.getNome() +
                                "\nO time conseguiu a incrível marca de: " + t.getGolsTime() + " gols";
                    }
                }
                JOptionPane.showMessageDialog(null, mostrarTime);
            }
        } while (op != 5);
    }
}

