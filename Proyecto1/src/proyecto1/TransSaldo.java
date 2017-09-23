/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author FERNANDO
 */
public class TransSaldo extends JFrame implements ActionListener{
    JPanel panel;
    
        JButton boton1=new JButton("Q1.00");
        JButton boton2=new JButton("Q5.00");
        JButton boton3=new JButton("Q10.00");
        JButton boton4=new JButton("Q20.00");
        JButton boton5=new JButton("Q50.00");
        JButton boton6=new JButton("Q100.00");
        JButton boton7=new JButton("Q200.00");
        JButton boton8=new JButton("<<<Regresar");
        JButton boton9=new JButton("Imprimir Voucher");
        JButton boton10=new JButton("Transferir");
        JTextField texto1=new JTextField("0");
        JTextField texto2=new JTextField("0");
        JTextField texto3=new JTextField("0");
        JTextField texto4=new JTextField("0");
        JTextField texto5=new JTextField("0");
        JTextField texto6=new JTextField("0");
        JTextField texto7=new JTextField("0");
        JLabel label1=new JLabel("Monto a transferir");
        JLabel label2=new JLabel();
        JLabel label3=new JLabel("Estudiante");
        JLabel label4=new JLabel();
        JComboBox listado=new JComboBox();
        int monto;
            
    public TransSaldo(){
        setSize(500,500);
        setTitle("TransferenciaSaldos");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        
        label3.setBounds(30,30,100,40);
        label4.setBounds(150,30,160,40);
        label1.setBounds(30,70,140,40);
        label2.setBounds(150,70,160,40);
        texto1.setBounds(80,120,40,30);
        boton1.setBounds(130,120,90,30);
        texto2.setBounds(270,120,40,30);
        boton2.setBounds(330,120,90,30);
        texto3.setBounds(80,170,40,30);
        boton3.setBounds(130,170,90,30);
        texto4.setBounds(270,170,40,30);
        boton4.setBounds(330,170,90,30);
        texto5.setBounds(80,220,40,30);
        boton5.setBounds(130,220,90,30);
        texto6.setBounds(270,220,40,30);
        boton6.setBounds(330,220,90,30);
        texto7.setBounds(80,270,40,30);
        boton7.setBounds(130,270,90,30);
        boton8.setBounds(100,330,140,30);
        boton9.setBounds(260,330,150,30);
        boton9.setEnabled(false);
        boton10.setBounds(330,270,100,30);
        listado.setBounds(200,30,100,30);
        texto1.setEditable(false);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        boton10.addActionListener(this);
        
        panel.add(label3);
        panel.add(label4);
        panel.add(label1);
        panel.add(label2);
        panel.add(texto1);
        panel.add(boton1);
        panel.add(texto2);
        panel.add(boton2);
        panel.add(texto3);
        panel.add(boton3);
        panel.add(texto4);
        panel.add(boton4);
        panel.add(texto5);
        panel.add(boton5);
        panel.add(texto6);
        panel.add(boton6);
        panel.add(texto7);
        panel.add(boton7);
        panel.add(boton8);
        panel.add(boton9);
        panel.add(boton10);
        panel.add(listado);
        monto=0;
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton8){
          
            Cajero cajero=new Cajero();
            this.setVisible(false);
            cajero.setVisible(true);
                    
        }
        if(e.getSource()==boton1){
          
            String cont="";
            int cantidad=Integer.parseInt(texto1.getText());
            cantidad++;
            cont=Integer.toString(cantidad);
            texto1.setText(cont);
            monto=monto+1*cantidad;
            label2.setText(Integer.toString(monto));        
        }
        if(e.getSource()==boton2){
          
            String cont="";
            int cantidad=Integer.parseInt(texto2.getText());
            cantidad++;
            cont=Integer.toString(cantidad);
            texto2.setText(cont);
            monto=monto+5*cantidad;
            label2.setText(Integer.toString(monto));
        }
        if(e.getSource()==boton3){
          
            String cont="";
            int cantidad=Integer.parseInt(texto3.getText());
            cantidad++;
            cont=Integer.toString(cantidad);
            texto3.setText(cont);
            monto=monto+10*cantidad;  
            label2.setText(Integer.toString(monto));
        }
        if(e.getSource()==boton4){
          
            String cont="";
            int cantidad=Integer.parseInt(texto4.getText());
            cantidad++;
            cont=Integer.toString(cantidad);
            texto4.setText(cont);
            monto=monto+20*cantidad;
            label2.setText(Integer.toString(monto));
        }
        if(e.getSource()==boton5){
          
            String cont="";
            int cantidad=Integer.parseInt(texto5.getText());
            cantidad++;
            cont=Integer.toString(cantidad);
            texto5.setText(cont);
            monto=monto+50*cantidad;
            label2.setText(Integer.toString(monto));
        }
        if(e.getSource()==boton6){
          
            String cont="";
            int cantidad=Integer.parseInt(texto6.getText());
            cantidad++;
            cont=Integer.toString(cantidad);
            texto6.setText(cont);
            monto=monto+100*cantidad;  
            label2.setText(Integer.toString(monto));
        }
        if(e.getSource()==boton7){
          
            String cont="";
            int cantidad=Integer.parseInt(texto7.getText());
            cantidad++;
            cont=Integer.toString(cantidad);
            texto7.setText(cont);
            monto=monto+200*cantidad;      
            label2.setText(Integer.toString(monto));
        }
        if (e.getSource()==boton10){
            boton9.setEnabled(true);
        }
    }
    
}
