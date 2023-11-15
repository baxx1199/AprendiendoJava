/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;

import javax.swing.JOptionPane;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
     
    public double consultarSaldo(int n){
    
        
                double saldoDisponible=cuentas[n].getSaldo();
                JOptionPane.showMessageDialog(null, cuentas[n].imprimirDatos());
           
        
        
        return saldoDisponible;
    }
    
    public void ingresar_Dinero(int n, double monto){
        
        
    
       
                cuentas[n].ingresarDinero(monto);
               
                JOptionPane.showMessageDialog(null, "Se a registrado con exito su transaccion en la cuenta No." +cuentas[n].getNumeroCuenta()+ ", nuevo saldo $"+cuentas[n].getSaldo());
                
          
    
    }
    public void retirar_Dinero(int n, double monto){
    
    
   
                cuentas[n].retirarDinero(monto);
                 JOptionPane.showMessageDialog(null, "Se a registrado con exito su transaccion en la cuenta No." +cuentas[n].getNumeroCuenta()+ ", nuevo saldo $"+cuentas[n].getSaldo());
              
    }
    
    public void estadoDeCuenta(){
        System.out.println("=====================================");
        String datos = getNombre()+ " " + getApellido() + "\n DNI: " + getDni() +" \n Numero de cuentas registradas "+cuentas.length+" \n";
        double saldoTotalDisponible=0;
        
        for (int i = 0; i < cuentas.length; i++) {
            
            datos += "\n"+ cuentas[i].imprimirDatos();
                    
                saldoTotalDisponible+= cuentas[i].getSaldo();
        }
        
        System.out.println(  datos += "\n------------------\n\tSaldo total Disponible : " + saldoTotalDisponible);
        System.out.println("=====================================");
    }
}
