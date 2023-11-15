/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;

/**
 *
 * @author baxx
 */
public class Cuadrilatero {
    
    private float ladoA;
    private float ladoB;
    
    public Cuadrilatero(float ladoA,float ladoB){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
    }
    public Cuadrilatero(float lado){
        this.ladoA=lado;
        this.ladoB=lado;
    }
    
    
    public float getArea(){
        float area=ladoA*ladoB;
        
        return area;
    }
    
    public float getPerimetro(){
        float perimetro= 2*(ladoA+ladoB);
        
        return perimetro;
    }
}
