
package proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
//Saldo de​ ​la​ ​cuenta:​ ​Se​ ​le​ ​desplegará​ ​en​ ​una​ ​pantalla​ ​al​ ​usuario​ ​el saldo actual  de​ ​su​ ​cuenta​ ​así​ ​como​ ​la​ ​fecha​ ​y​ ​hora​ ​actual,​ ​nombre​ ​de​ ​la​ ​institución .

public class SaldoCuenta extends JFrame implements ActionListener{
    login login=new login();
    Registro registro=new Registro();
    AgregaUsuario obj=new AgregaUsuario();
    JPanel panel;
    JLabel label1=new JLabel("Usuario");
    JLabel label2=new JLabel();
    JLabel label3=new JLabel("Su saldo actual es: ");
    JLabel label8=new JLabel();
    JLabel label4=new JLabel("Fecha y hora: ");
    JLabel label5=new JLabel();
    JLabel label6=new JLabel("Atiende Cajero:");
    JLabel label7=new JLabel();
    JButton boton1=new JButton("<<< Regresar");
    
    public SaldoCuenta(){
        
        setSize(600,350);
        setTitle("SaldoCuenta");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        panel= new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        
        label6.setBounds(50,40,100,40);
        label7.setBounds(200,40,100,40);
        label4.setBounds(400,40,100,40);
        label5.setBounds(500,40,100,40);
        label1.setBounds(50,100,100,40);
        label2.setBounds(200,100,100,40);
        label3.setBounds(50,160,100,40);
        label8.setBounds(200,160,100,40);
        boton1.setBounds(250,230,130,40);
        label2.setText(registro.usuarios[login.cont]);
        label8.setText(Integer.toString(registro.saldos[login.cont]));
        label5.setText(fechaActual());
        label7.setText(registro.cajeros[login.cont]);
        boton1.addActionListener(this);
        
        System.out.println(registro.getSaldo());
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(label7);
        panel.add(label8);
        panel.add(boton1);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            Cajero cajero=new Cajero();
            cajero.setVisible(true);
            this.setVisible(false);
        }
    }
    public static String fechaActual(){
        Date fecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
    }
}
