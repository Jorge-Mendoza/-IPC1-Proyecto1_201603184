/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Administracion extends JFrame implements ActionListener {
    
    JPanel panel;
    JLabel label1=new JLabel("Fecha: ");
    JTextField texto1=new JTextField();
    JButton boton1=new JButton("Ingreso Usuarios");
    JButton boton2=new JButton("Asigna alumnos");
    JButton boton3=new JButton("Denominaciones");
    JButton boton4=new JButton("Salir");
    
    public Administracion(){
        setSize(400,400);
        setTitle("Administración");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        
        label1.setBounds(20,30,100,30);
        texto1.setBounds(150,30,100,30);
        texto1.setEditable(false);
        texto1.setText(fechaActual());
        boton1.setBounds(20,80,140,30);
        boton2.setBounds(170,80,140,30);
        boton3.setBounds(20,140,140,30);
        boton4.setBounds(170,140,140,30);
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        
        panel.add(label1);
        panel.add(texto1);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton4){
            login obj=new login();
            obj.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==boton1){
            AgregaUsuario obj=new AgregaUsuario();
            obj.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==boton2){
            ListaAlumnos obj=new ListaAlumnos();
            obj.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==boton3){
            Denominaciones obj=new Denominaciones();
            obj.setVisible(true);
            this.setVisible(false);
        }
        
    }
    public static String fechaActual(){
        Date fecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
    }
    
}
