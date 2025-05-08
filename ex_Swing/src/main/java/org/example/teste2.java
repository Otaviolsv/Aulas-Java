package org.example;

import javax.swing.*;
import java.awt.*;

public class teste2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout");

        frame.setLayout(new GridLayout(2, 2));

        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        JButton botao3 = new JButton("Botão 3");
        JButton botao4 = new JButton("Botão 4");

        botao1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Bt1"));
        botao2.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Bt2"));
        botao3.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Bt3"));
        botao4.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Bt4"));

        frame.add(botao1);
        frame.add(botao2);
        frame.add(botao3);
        frame.add(botao4);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
