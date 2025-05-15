package org.example;

import javax.swing.*;

public class teste4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista");
        String[] options = {"ilha do governador" , "Barra da Tijuca", "Copacabana"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        JLabel label = new JLabel(("Selecione um bairro"));

        comboBox.addActionListener(e -> label.setText("Bairro: " + comboBox.getSelectedItem()));


        frame.setLayout(new java.awt.FlowLayout());
        frame.add(comboBox);
        frame.add(label);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
