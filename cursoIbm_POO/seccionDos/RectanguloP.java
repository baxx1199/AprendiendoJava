/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO.seccionDos;

/**
 *
 * @author baxx
 */
public class RectanguloP extends Poligono{
    private double lado1;
    private double lado2;

    public RectanguloP(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return " El Rectangulo "+super.toString()+lado1 + " X " + lado2 + " con un area de "+ calcularArea();
    }

    @Override
    public double calcularArea() {
        return lado1*lado2;
    }
    
    
    
}
