package org.example;

import javax.swing.*;
import java.awt.*;

public class teste5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Desenho");
        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillOval(50,50,100,100);
            }
        };
        frame.add(panel);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
