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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author FERNANDO
 */
public class Retiro extends JFrame implements ActionListener {
    JPanel panel;
    JLabel label1=new JLabel("Hola, por favor ingresa el monto que deseas retirar");
    JTextField texto1=new JTextField();
    JButton boton1=new JButton("Verificar");
    JButton boton2=new JButton("Retirar");
    JButton boton3=new JButton("<<<Regresarar");
    
    public Retiro(){
        setSize(500,300);
        setTitle("Retiros");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        
        label1.setBounds(20,30,200,30);
        texto1.setBounds(20,90,100,30);
        boton3.setBounds(20,150,100,30);
        boton1.setBounds(140,150,100,30);
        boton2.setBounds(280,150,100,30);
        boton2.setEnabled(false);
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        
        panel.add(label1);
        panel.add(texto1);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            boton2.setEnabled(true);
        }
        if(e.getSource()==boton2){
           
        }
        if(e.getSource()==boton3){
           Cajero cajero=new Cajero();
           cajero.setVisible(true);
           this.setVisible(false);
        }
    }
    
}
