/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author FERNANDO
 */
public class Registro {
    int cont;
    static String usuario;
    static String contraseña;
    static String cajero;
    static String nombre;
    static int saldo;
    static int monto;
    static String registro[]=new String[10];
    static int saldos[]=new int[10];
    static String usuarios[]=new String[10];
    static String cajeros[]=new String[10];
    static String amigos[]=new String[10];

    public Registro(String nombre,String contraseña,String usuario, int saldo,  String cajero,  int monto,String usuarios,int cont) {
        this.cont=cont;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cajero = cajero;
        this.nombre = nombre;
        this.saldo = saldo;
        this.monto = monto;
        this.registro[cont]=usuarios;
        saldos[cont]=saldo;
        this.usuarios[cont]=nombre;
        cajeros[cont]=cajero;
        
        //cosas[cont]=new Registro(nombre,contraseña, usuario, saldo, cajero, monto, usuarios, cont);
    }
    public Registro(String amigo, int cont){
        amigos[cont]=amigo;
    }
    
    public Registro(){
        usuario="";
        contraseña="";
        cajero="";
        nombre="";
        saldo=0;
        monto=0;
    }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getSaldo() {
            return saldo;
        }

        public void setSaldo(int saldo) {
            this.saldo = saldo;
        }

        public int getMonto() {
            return monto;
        }

        public void setMonto(int monto) {
            this.monto = monto;
        }

    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }
    
    

}
