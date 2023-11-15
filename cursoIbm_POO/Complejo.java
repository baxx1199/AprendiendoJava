/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;

/**
 *
 * @author baxx
 */
public class Complejo {
    private double real;
    private double imaginaria;

    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double getReal() {
        return real;
    }

    public double getImaginaria() {
        return imaginaria;
    }
    
    
    public Complejo sumar(Complejo c){
        Complejo resultado= new Complejo((getReal()+c.getReal()), (getImaginaria()+c.getImaginaria()));
        return resultado;
    }
    
    //Se define el producto de dos números complejos z1= a + bi y z2= c + di como
    //(a + bi)⋅(c + di)=(ab − bd)+(ad + bc) i
    
    public Complejo multiplcar(Complejo c){
        Complejo resultado = new Complejo(((getReal()*getImaginaria())-(getImaginaria()*c.getImaginaria())), (+getReal()*c.getImaginaria()+(getImaginaria()*c.getReal())));
        return resultado;
    }
    
    public Boolean comparar(Complejo c){
        Boolean igualdad=false;
        
        if(getReal()==c.getReal() && getImaginaria()==c.getImaginaria() ){
            igualdad=true;
        }
        
        return igualdad;
    }
    
    public Complejo multiplicar(int num){
    
        Complejo resultado= new Complejo((num*getReal()), (num*getImaginaria()));
        return resultado;
    }
}
