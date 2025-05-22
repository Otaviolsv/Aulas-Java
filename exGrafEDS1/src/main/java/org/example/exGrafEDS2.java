package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;

public class exGrafEDS2 {
    public static void main(String[] args) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Java", 40);
        dataset.setValue("Python", 30);
        dataset.setValue("JS", 30);

        JFreeChart chart = ChartFactory.createPieChart("Popularidade das Linguagens",dataset, true,true,false);

        JFrame frame = new JFrame("Grafico de Pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
