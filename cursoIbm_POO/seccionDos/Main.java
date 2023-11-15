/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoIbm_POO.seccionDos;

import javax.swing.JOptionPane;

/**
 *
 * @author baxx
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        ejePoligonosP();
        
        
//        Estudiante estudiante1 = new Estudiante("Julian", "Cobos", 23, 991882, 3.5f);
//
//        estudiante1.mostrarDatos();
//
//        Auto vehiculo1 = new Moto();
//        Auto vehiculo2 = new Barco();
//
//        vehiculo1.acelerar();
//        vehiculo2.acelerar();
//
//        System.out.println("======\n");
//
//        Auto vehiculo3 = new Auto();
//
//        vehiculo3.acelerar();
//
//        Moto auto = new Moto();
//
//        auto.acelerar();
    }
    
    public static void ejePoligonosP(){
       int n = Integer.parseInt( JOptionPane.showInputDialog("Cuantos Poligonos desea almacenar"));
       double l1,l2, l3;
        
        Poligono poligonos[]= new Poligono[n];
        
        for (int i = 0; i < poligonos.length; i++) {
            n = Integer.parseInt( JOptionPane.showInputDialog("¿Que tipo de poligono desea agregar? \n 2.Rectangulo \n3. Triangulo"));
            
            if(n==2){
                l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado 1"));
                l2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado 2"));
                
                poligonos[i]=new RectanguloP(l1, l2);
            }else if(n==3){
                l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado 1"));
                l2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado 2"));
                l3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado 3"));
                
                poligonos[i]=new Triangulop(l1, l2, l3);
                
            }
            
            
        }
        
        
        System.out.println("=====================\n");
        
        for (int i = 0; i < poligonos.length; i++) {
            
            System.out.println(poligonos[i].toString());
            
        }
        
       
    
    }

}
