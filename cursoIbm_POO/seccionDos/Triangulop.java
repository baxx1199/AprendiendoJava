/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO.seccionDos;

/**
 *
 * @author baxx
 */
public class Triangulop extends Poligono{
    private double ladoUno;
    private double ladoDos;
    private double ladoTres;

    public Triangulop(double ladoUno, double ladoDos, double ladoTres) {
        super(3);
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
        this.ladoTres = ladoTres;
    }

    public double getLadoUno() {
        return ladoUno;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public double getLadoTres() {
        return ladoTres;
    }

    
    
    
    
    @Override
    public String toString() {
        return "El Triangulo "+ super.toString()
                + ladoUno + " X "+ladoDos+ " X " +ladoTres +" con un area de "+ calcularArea();
    }

    @Override
    public double calcularArea() {
        double p =((ladoUno+ladoDos+ladoTres)/2);
       double area= Math.sqrt(p *(p-ladoUno)*(p-ladoDos)*(p-ladoTres));
       return area;
    }
    
    
}
