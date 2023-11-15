/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO.seccionDos;

/**
 *
 * @author baxx
 */
public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    
    
    
    @Override
    public String toString() {
        return "ES un poligono de "+ numeroLados+" lados ";
    }
    
    public abstract double calcularArea();
    
}
