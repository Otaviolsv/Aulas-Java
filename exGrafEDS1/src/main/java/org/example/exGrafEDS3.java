package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class exGrafEDS3 {
    public static void main(String[] args) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1,"Temperatura", "Seg");
        dataset.addValue(3,"Temperatura", "Ter");
        dataset.addValue(2,"Temperatura", "Qua");
        dataset.addValue(5,"Temperatura", "Qui");
        dataset.addValue(4,"Temperatura", "Sex");

        JFreeChart chart = ChartFactory.createLineChart("Temperatura da semana","Dia", "°C", dataset);


        JFrame frame = new JFrame("Grafico de Linhas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
