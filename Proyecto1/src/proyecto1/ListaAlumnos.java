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
public class ListaAlumnos extends JFrame implements ActionListener{
    
    JPanel panel;
    JComboBox lista1=new JComboBox();
    JLabel label1=new JLabel("Ingresa el nombre del amigo");
    JTextField texto1=new JTextField();
    JButton boton1=new JButton("Agregar");
    JButton boton2=new JButton("<<<Regresar");
    Registro obj=new Registro();
    
    public ListaAlumnos(){
        setSize(400,300);
        setTitle("Enlista Alumnos");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        lista1.setBounds(30,30,150,30);
        label1.setBounds(30,60,150,30);
        texto1.setBounds(30,90,200,30);
        boton1.setBounds(130,130,100,30);
        boton2.setBounds(30,130,100,30);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        panel.add(lista1);
        panel.add(label1);
        panel.add(texto1);
        panel.add(boton1);
        panel.add(boton2);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(e.getSource()==boton1){
        for(int i=0;i<obj.usuarios.length;i++){
            if(lista1.getSelectedItem().equals(obj.usuarios[i])){
            
            }
        }
    }
    if(e.getSource()==boton2){
        Administracion admin=new Administracion();
        admin.setVisible(true);
        this.setVisible(false);
    }
    }
    
}
