/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author FERNANDO
 */
public class Graficos extends JFrame {
    
    JFreeChart grafica;
    DefaultCategoryDataset datos=new DefaultCategoryDataset();
    public Graficos(){
        datos.addValue(1, "Enero", "0");
        datos.addValue(2, "Febrero", "100");
        datos.addValue(3, "Marzo", "200");
        datos.addValue(4, "Abril", "300");
        datos.addValue(5, "Mayo", "400");
        datos.addValue(6, "Junio", "500");
        datos.addValue(7, "Julio", "600");
        datos.addValue(8, "Agosto", "700");
        datos.addValue(9, "Septiembre", "800");
        datos.addValue(10, "Octubre", "900");
        datos.addValue(11, "Noviembre", "1000");
        datos.addValue(12, "Diciembre", "1500");
        
        grafica= ChartFactory.createBarChart("Transacciones","Monto","Meses",datos,PlotOrientation.HORIZONTAL,true,true,false);
        
    }
    
}
