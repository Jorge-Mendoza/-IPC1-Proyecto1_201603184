package proyecto1;


import java.awt.Color; 
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

 
public class Cajero extends JFrame implements ActionListener {
     JPanel panel;
     login login=new login();
     static Color color=null;
     static String colores="";
     
     static JLabel imagen=new JLabel("hola");
     
     static ImageIcon emp=new ImageIcon();
     
     JButton boton1=new JButton("Ver Saldo de cuenta");
     JLabel label1=new JLabel("Usuario:");
     JLabel label2=new JLabel(login.texto1.getText());
     JButton boton2=new JButton("Transferencia de saldos");
     JButton boton3=new JButton("Transferencia libre");
     JButton boton4=new JButton("Sistema de reimpresión");
     JButton boton5=new JButton("Graficas");
     JButton boton6=new JButton("Retiros monetarios");
     JButton boton7=new JButton("Salir");
     
    public Cajero(){
        setSize(600,500);
        setTitle("Cajero");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        setContentPane(panel);
        
//        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);
        //colores=login.colores.;
        label1.setBounds(300, 20, 100, 30);
        label2.setBounds(400,20,100,30);
        boton1.setBounds(70,100,180,50);
        boton1.addActionListener(this);
        boton2.setBounds(270,100,180,50);
        boton2.addActionListener(this);
        boton3.setBounds(70,200,180,50);
        boton3.addActionListener(this);
        boton4.setBounds(270,200,180,50);
        boton4.addActionListener(this);
        boton5.setBounds(70,300,180,50);
        boton5.addActionListener(this);
        boton6.setBounds(270,300,180,50);
        boton6.addActionListener(this);
        boton7.setBounds(500,400,60,30);
        boton7.addActionListener(this);
        boton1.setBackground(Color.getColor(colores));
//        if(login.opcion1.isEnabled()){
//            boton1.setBackground(Color.green);
//            boton1.setForeground(Color.WHITE);
//        }else{  )
//        if(login.opcion2.isEnabled()){
//            boton1.setBackground(Color.LIGHT_GRAY);
//            boton1.setForeground(Color.WHITE);
//        }
//        }
        panel.add(label1);
        panel.add(label2);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);
        panel.add(boton7);
        
        imagen.setBounds(10,10,100,100);
        panel.add(imagen);
        
        

    }
    public void insertarIcono(){
        
//        if(empresa.equals("Cash-money")){
//        emp.getClass().getResource("/Imagenes/2017-09-06.png");
//        }
//        if(empresa.equals("Pro-pisto")){
//            emp.getClass().getResource("/Imagenes/Pro-pisto.png");
//        }
//        ImageIcon icono=new ImageIcon(emp.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(),Image.SCALE_DEFAULT ));
//        imagen.setIcon(icono);
//        panel.add(imagen);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==boton1){
          
            SaldoCuenta saldo=new SaldoCuenta();
            this.setVisible(false);
            saldo.setVisible(true);
                    
        }
        
        if(e.getSource()==boton2){
          
            TransSaldo saldo=new TransSaldo();
            this.setVisible(false);
            saldo.setVisible(true);
                    
        }
        
        if(e.getSource()==boton3){
          
            TransLibre libre=new TransLibre();
            this.setVisible(false);
            libre.setVisible(true);
                    
        }
        if(e.getSource()==boton4){
          
            SysReimpresion imprimir=new SysReimpresion();
            this.setVisible(false);
            imprimir.setVisible(true);
                    
        }
        
        if(e.getSource()==boton5){
          
            Graficas graf=new Graficas();
            this.setVisible(false);
            graf.setVisible(true);
                    
        }
        
        if(e.getSource()==boton6){
          
            Retiro monto=new Retiro();
            this.setVisible(false);
            monto.setVisible(true);
                    
        }
        if(e.getSource()==boton7){
          
            login obj=new login();
            
            obj.setVisible(true);
            this.setVisible(false);
                    
        }
        
        
    }
    
}
