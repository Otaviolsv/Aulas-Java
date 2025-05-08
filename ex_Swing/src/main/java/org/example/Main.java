package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Entrada de Texto");
        janela.setSize(400,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        JTextField aba_texto = new JTextField(15);
        JButton botao = new JButton("Clique aqui");
        JLabel rotulo = new JLabel("Aguardando clique...");
//        botao.addActionListener(e -> rotulo.setText("Botão clicado!"));

        botao.addActionListener(e -> rotulo.setText("Você digitou: " + aba_texto.getText()));
        janela.setLayout(new java.awt.FlowLayout());
        janela.add(aba_texto);
        janela.add(botao);
        janela.add(rotulo);



        janela.setVisible(true);


    }
}
