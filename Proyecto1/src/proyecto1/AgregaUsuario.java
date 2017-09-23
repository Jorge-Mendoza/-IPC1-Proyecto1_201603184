/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


/**
 *
 * @author FERNANDO
 */
public class AgregaUsuario extends JFrame implements ActionListener {
    
    JPanel panel;
    JLabel label1=new JLabel("Ingrese el nombre de la cuenta");
    JLabel label2=new JLabel("Ingrese la contraseña de la cuenta");
    JLabel label3=new JLabel("Ingrese usuario para login");
    JLabel label4=new JLabel("Ingrese el saldo inicial de la cuenta");
    JLabel label5=new JLabel("Ingrese la empresa que lo atiende");
    JLabel label6=new JLabel("Ingrese el monto máximo");
    static JTextField texto1=new JTextField();
    static JTextField texto2=new JTextField();
    static JTextField texto3=new JTextField();
    static JTextField texto4=new JTextField();
    static JTextField texto5=new JTextField();
    static JTextField texto6=new JTextField();
    JButton boton1=new JButton("<<<Regresar");
    JButton boton2=new JButton("Guardar Usuario");
    JRadioButton opcion1=new JRadioButton("Cash-money");
    JRadioButton opcion2=new JRadioButton("Pro-Pristo");

    
    public AgregaUsuario(){
        setSize(500,650);
        setTitle("Agregarción Usuarios");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        
        
        
        label1.setBounds(20,20,200,30);
        texto1.setBounds(20,50,200,30);
        label2.setBounds(20,90,200,30);
        texto2.setBounds(20,120,200,30);
        label3.setBounds(20,150,200,30);
        texto3.setBounds(20,190,200,30);
        label4.setBounds(20,240,200,30);
        texto4.setBounds(20,280,200,30);
        label5.setBounds(20,340,200,30);
        opcion1.setBounds(20,380,100,30);
        opcion1.setForeground(Color.white);
        opcion1.setBackground(Color.GREEN);
        opcion2.setBounds(150,380,100,30);
        opcion2.setBackground(Color.DARK_GRAY);
        opcion2.setForeground(Color.white);
        opcion1.addActionListener(this);
        opcion2.addActionListener(this);
        //texto5.setBounds(20,380,200,30);
        label6.setBounds(20,430,200,30);
        texto6.setBounds(20,470,200,30);
        boton1.setBounds(50,520,120,30);
        boton2.setBounds(240,520,140,30);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(texto3);
        panel.add(texto4);
        panel.add(texto5);
        panel.add(texto6);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(opcion1);
        panel.add(opcion2);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==boton1){
            Administracion admin=new Administracion();
            admin.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==boton2){
            agregar();
            
        }
        if(e.getSource()==opcion1){
          opcion2.setSelected(false);
          texto5.setText(opcion1.getText());
          
        }
        if(e.getSource()==opcion2){
          opcion1.setSelected(false);
          texto5.setText(opcion2.getText());
          
        }
            
    }
    static int cont=0;
     static Registro[]registro=new Registro[2];
    public static void agregar(){
        login obj=new login();
        System.out.println(texto1.getText());
        String nombre=texto1.getText();
       
        registro[cont]=new Registro(texto1.getText(),texto2.getText(),texto3.getText(),Integer.parseInt(texto4.getText()),texto5.getText(),Integer.parseInt(texto6.getText()),texto3.getText()+","+texto2.getText(),cont);
        System.out.println(obj.cont);
        cont++;
        System.out.println(registro[obj.cont].getCajero()+registro[obj.cont].getNombre());
    }
    

}
