package org.example;
import org.jfree.chart.ChartFactory;
import  org.jfree.chart.ChartPanel;
import  org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import  javax.swing.*;

public class Main
{
    public static void main( String[] args )
    {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5,"Produtos","Janeiro");
        dataset.addValue(8,"Produtos","Fevereiro");
        dataset.addValue(3,"Produtos","Março");

        JFreeChart chart = ChartFactory.createBarChart("Vendas mensais","Mês,", "Unidades", dataset);

        JFrame frame = new JFrame("Gráfico de Barras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
