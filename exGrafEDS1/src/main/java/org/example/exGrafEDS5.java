package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class exGrafEDS5 {
    public static void main(String[] args) {


        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(3,"Valor", "Jan");
        dataset.addValue(4,"Valor", "Fev");
        dataset.addValue(2,"Valor", "Mar");
        dataset.addValue(5,"Valor", "Abr");


        JFreeChart chart = ChartFactory.createAreaChart("Consumo mensal","Mês,","Kwk",dataset);

        JFrame frame = new JFrame("Grafico de Area");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
