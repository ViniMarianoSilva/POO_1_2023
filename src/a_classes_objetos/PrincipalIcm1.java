package a_classes_objetos;

import javax.swing.*;

public class PrincipalIcm1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pessoas:"));
        Pessoa pessoas[] = new Pessoa[n];
        String resultado = "";

        for (int i = 0; i < n; i++) {
            Pessoa p = new Pessoa();
            p.cadastra();
            pessoas[i] = p;
            resultado += p.exibirDados();
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
