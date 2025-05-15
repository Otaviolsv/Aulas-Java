package org.example;

import javax.swing.*;

public class teste3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista");
        String[] itens = {"Sumidouro" , "Varre-sai" , "Quatis" , "Itaperuna" , "Campos" ,"Varre-sai" , "Quatis" , "Itaperuna" , "Campos"};
        JList<String> list = new JList<>(itens);

//        JMenuBar menuBar = new JMenuBar();
//        JMenu menu = new JMenu();
//        JMenuItem item  = new JCheckBoxMenuItem("sair");
//        item.addActionListener(e -> System.exit(0));
//        menu.add(item);
//        menuBar.add(menu);
//        frame.setJMenuBar(menuBar);
//
        frame.setResizable(true);
        frame.add(new JScrollPane(list));
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
