/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;

/**
 *
 * @author baxx
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresarDinero(double monto){
        saldo +=monto;
    
    }
    public void retirarDinero(double monto){
         saldo -=monto;
    }
    
    
    public String imprimirDatos(){
        String datosCuenta="No. de cuenta "+numeroCuenta+" saldo disponible $"+saldo;
        
        return datosCuenta;
    }
    
}
