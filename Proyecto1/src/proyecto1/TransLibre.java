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
public class TransLibre extends JFrame implements ActionListener {
    JPanel panel;
    JLabel label1=new JLabel("Ingrese el nombre de la persona");
    JTextField texto1= new JTextField("hola");
    JLabel label2= new JLabel("Ingrese el numero de cuenta");
    JTextField texto2=new JTextField("estoy");
    JLabel label3= new JLabel("Ingrese el monto de trasferencia");
    JTextField texto3=new JTextField("aquí");
    JButton boton1=new JButton("<<<Regresar");
    JButton boton2=new JButton("Transferir monto");
    JButton boton3=new JButton("Imprimir Voucher");
    
    
    public TransLibre(){
        setSize(500,400);
        setTitle("Transferencia_Libre");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        
        label1.setBounds(30,30,200,30);
        texto1.setBounds(30,60,200,30);
        label2.setBounds(30,100,200,30);
        texto2.setBounds(30,150,200,30);
        label3.setBounds(30,200,200,30);
        texto3.setBounds(30,250,200,30);
        boton1.setBounds(280,70,150,30);
        boton2.setBounds(280,130,150,30);
        boton3.setBounds(280,190,150,30);
        boton3.setEnabled(false);
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        
        panel.add(label1);
        panel.add(texto1);
        panel.add(label2);
        panel.add(texto2);
        panel.add(label3);
        panel.add(texto3);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
          
            Cajero cajero=new Cajero();
            this.setVisible(false);
            cajero.setVisible(true);
                    
        }
        if(e.getSource()==boton2){
          
            boton3.setEnabled(true);
                    
        }
    }
    
}
