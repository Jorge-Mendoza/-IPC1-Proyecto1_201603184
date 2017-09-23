/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
 
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.DARK_GRAY;
import static java.awt.Color.GREEN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author FERNANDO
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login log=new login();
        log.setVisible(true);
        
        
        
    }
    
}

class login extends JFrame implements ActionListener{
    JPanel panel;
    //static String registro[]={"jorge20,fermen","brandon21,acceder","JuanitoR,holaMundo","lalo45,ingresa"};
    //static String registro[]=new String[20];
    static Registro registro=new Registro();
    
     static String colores="";
    int cont;
    JLabel label1=new JLabel("Ingresa nombre de usuario");
        JLabel label2=new JLabel("Ingresa tu contraseña");
//        JLabel label3=new JLabel("Elije la empresa de preferencia");
         JTextField texto1=new JTextField();
         JTextField texto2=new JTextField();
        JButton boton1=new JButton("Ingresar");
//        static JRadioButton opcion1=new JRadioButton("Cash-money");
//        static JRadioButton opcion2=new JRadioButton("Pro-pisto");
     static Color color=null;
    public login(){
        setSize(500,400);
        setTitle("Login");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        JLabel label=new JLabel();
        cont=0;
        setContentPane(panel);
        
//         label.setIcon(new ImagenIcon("C:\\Users\\FERNANDO\\Documents\\NetBeansProjects\\Proyecto1\\src\\Imagenes\\2017-09-06.png"));
//        panel.add(label,BorderLayout,CENTER);       
        panel.setLayout(null);
        
        //panel.setBackground(Color.ORANGE);
        
        label1.setBounds(30, 50, 200, 40);
        label2.setBounds(30, 90, 200, 40);
        texto1.setBounds(250, 50, 210, 30);
        texto2.setBounds(250, 90, 210, 30);
//        label3.setBounds(170,180,200,30);
//        opcion1.setBounds(100,220,150,30);
//        opcion1.setBackground(Color.GREEN);
//        opcion1.setForeground(Color.white);
//        opcion2.setBounds(300,220,150,30);
//        opcion2.setBackground(Color.gray);
//        opcion2.setForeground(Color.white);
        boton1.setBounds(170,270,150,30);
        boton1.addActionListener(this);
//        opcion1.addActionListener(this);
        panel.add(label1);
        panel.add(label2);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(boton1);
//        panel.add(opcion1);
//        panel.add(opcion2);
//        panel.add(label3);
     
    }
    
    static int i=0;
    static boolean control=false;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
          
            ingresa();
          
        }
//        if(e.getSource()==opcion1){
//            opcion2.setEnabled(false);
//        }
    }
    
    static String empresa=" ";
    public  void ingresa(){
          
        boolean acceso=false;
        
        
//        if(opcion1.isEnabled()){
//            empresa="Cash-money";
//            opcion2.setEnabled(false);
//            
//        }
//        if(opcion2.isEnabled()){
//            empresa="Pro-pisto";
//            opcion1.setEnabled(false);
//        }
//        while(control==true){
        Cajero cajero=new Cajero();
        login login=new login();
            String usuario= texto1.getText()+","+texto2.getText();
            try{
            for(int j=0;j<=registro.registro.length;j++){
                acceso=false;
                System.out.println(j);
                if(usuario.equals(registro.registro[j])){
                    acceso=true;
                    System.out.println("Accediendo");
                    System.out.println(registro.registro[j]);
                    
                    cont=j;
                    if(registro.cajeros[j].equals("Cash-money")){
                        
                        color=GREEN;
                        colores="GREEN";
                    }
                    if(registro.cajeros[j].equals("Pro-Pisto")){
                        color=DARK_GRAY;
                        colores="DARK_GRAY";
                    }
                    this.setVisible(false);
                    cajero.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Hola Usuario, ¿Que accion quiere realizar ahora?");
                    
                    break;
                }
                if(usuario.equals("ipc1Admin,aux1")){
                    System.out.println("ADMIN ACCEDIENDO");
                    Administracion admin=new Administracion();
                    acceso=true;
                    admin.setVisible(true);
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Hola administrador, ¿Que accion quiere realizar ahora?");
                    break;
                }
                
            }    
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Has ingresado un dato mal, revisa e intenta de nuevo");
                    texto1.setText(" ");
                    texto2.setText(" "); 
            }
                if(acceso==false){
                    JOptionPane.showMessageDialog(null, "Has ingresado un dato mal, revisa e intenta de nuevo");
                    texto1.setText(" ");
                    texto2.setText(" "); 
//                    ingresa();
                }   
             
               
           
            
    
    
    
}
    
}
