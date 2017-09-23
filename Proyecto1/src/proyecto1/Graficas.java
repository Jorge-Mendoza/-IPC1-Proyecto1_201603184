/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.WindowConstants;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author FERNANDO
 */
public class Graficas extends JFrame implements ActionListener{
    JPanel panel;
    JButton boton1=new JButton("Gráfica de Pie");
    JButton boton2=new JButton("Grafica de barras");
    JButton boton3=new JButton("<<<Regresar");
    public Graficas(){
        setSize(300,300);
        setTitle("Graficas");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        
        boton1.setBounds(100,50,150,30);
        boton2.setBounds(100,90,150,30);
        boton3.setBounds(100,140,150,30);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton3){
            login log=new login();
            log.setVisible(true);
            this.setVisible(false);
            
        }
        if(e.getSource()==boton2){
            Graficos obj=new Graficos();
            ChartPanel panel=new ChartPanel(obj.grafica);
            obj.getContentPane().add(panel);
            obj.pack();
            obj.setVisible(true);
            this.setVisible(false);
        }
        
        }
    }
    

