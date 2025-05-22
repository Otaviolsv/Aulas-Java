package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class exGrafEDS6 {
    public static void main(String[] args) {

        XYSeries parabola = new XYSeries("y=x²");
        for(int x = -
                10; x<= 10; x++){
            parabola.add(x,x*x);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(parabola);

        JFreeChart chart = ChartFactory.createXYLineChart("Grafico de parabola f(x) = x²","x", "y", dataset);

        JFrame frame = new JFrame("Grafico de Area");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
