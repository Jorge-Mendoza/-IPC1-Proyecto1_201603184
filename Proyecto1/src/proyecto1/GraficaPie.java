/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JFrame;
import org.jfree.chart.*;
import static org.jfree.chart.ChartFactory.createPieChart;
import static org.jfree.chart.ChartFactory.createPieChart;
import org.jfree.ui.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author FERNANDO
 */
public class GraficaPie extends JFrame{
   static  JFreeChart grafica;
    DefaultPieDataset datos=new DefaultPieDataset();
    public GraficaPie(){
        datos.setValue( "Estudiante1", new Double(25));
        datos.setValue( "Estudiante2", new Double(17));
        datos.setValue( "Estudiante3", new Double(15));
        datos.setValue( "Estudiante4", new Double(23));
        datos.setValue( "Estudiante5", new Double(4));
        datos.setValue( "Estudiante6", new Double(6));
        //grafica= new createPieChart("Transferencias",datos);
        
    }
}
