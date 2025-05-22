package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class exGrafEDS4 {
    public static void main(String[] args) {

        XYSeries serie = new XYSeries("Pontos");
        serie.add(1,2);
        serie.add(2,3);
        serie.add(3,2.5);
        serie.add(4,5);
        serie.add(5,4.5);

        XYSeriesCollection dataset = new XYSeriesCollection(serie);

        JFreeChart chart = ChartFactory.createScatterPlot("Grafico de dispersão", "Eixo X", "Eixo Y", dataset);

        JFrame frame = new JFrame("Grafico de Dispersão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
