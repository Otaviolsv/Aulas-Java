package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class teste7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);

        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();
        JLabel resultado = new JLabel("Resultado");

        JButton somar = new JButton("+");
        JButton subtrair = new JButton("-");
        JButton multiplicar = new JButton("x");
        JButton dividir = new JButton("÷");
        JButton raiz = new JButton("√");
        JButton potencia = new JButton("Aⁿ");


        JPanel botoes = new JPanel();
        botoes.setLayout(new GridLayout(2,2,10,10));
        botoes.add(somar);
        botoes.add(subtrair);
        botoes.add(multiplicar);
        botoes.add(dividir);
        botoes.add(raiz);
        botoes.add(potencia);

        frame.setLayout(new GridLayout(5,2,10,10));
        frame.add(new JLabel(("Número 1")));
        frame.add(campo1);
        frame.add(new JLabel(("Número 2")));
        frame.add(campo2);
        frame.add(botoes);
        frame.add(resultado);

        ActionListener operacao = e -> {
            try {
                double n1 = Double.parseDouble(campo1.getText());
                double n2 = Double.parseDouble(campo2.getText());
                double res = 0;

                if (e.getSource()==somar)
                    res = n1 + n2;
                else if(e.getSource()==subtrair)
                    res = n1 - n2;
                else if(e.getSource()==multiplicar)
                    res = n1 * n2;
                else if (e.getSource()==dividir)
                    res = n1/n2;
                else if (e.getSource()==raiz)
                    res = Math.pow(n1,1/n2);
                else if (e.getSource()==potencia)
                    res = Math.pow(n1,n2);
                resultado.setText("Resultado= " + res);
            }
            catch (Exception ex){
                resultado.setText("Entrada inválida");
            }
        };
        somar.addActionListener(operacao);
        subtrair.addActionListener(operacao);
        multiplicar.addActionListener(operacao);
        dividir.addActionListener(operacao);
        raiz.addActionListener(operacao);
        potencia.addActionListener(operacao);

        frame.setVisible(true);
    }
}
