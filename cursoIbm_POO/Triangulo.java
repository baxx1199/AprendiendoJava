/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;


public class Triangulo {
    private double lado;
    private double base;

    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }
    
    public double obtenerArea(){
        double area= (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
        return area;
    }
    public double obtenerPerimetro(){
        double perimetro=(lado*2)+base;
        return perimetro;
    }
    public String mostrarDatos(){
        String datos= "El triangulo dado por los lados "+lado + " y la base "+ base +" \n tiene una area de "+obtenerArea()+ " y un perimetro "+obtenerPerimetro();
        return datos;
    }
    
}
