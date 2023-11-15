/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;

import javax.swing.JOptionPane;

/**
 *
 * @author baxx
 */
public class Coche {
    private String marca;
    private String modelo;
    private float precio;

    public Coche(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, " marca: "+marca + " \n modelo: "+ modelo+ " \nprecio $"+precio);
        
        System.out.println("\n marca: "+marca + " \n modelo: "+ modelo+ " \nprecio $"+precio);
    }
    
}
