/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoibm_exception;

import javax.swing.JOptionPane;

/**
 *
 * @author baxx
 */
public class mainexception {

   public void prueba() throws RuntimeException{
   
       int num1 = 2;
       int num2 =0;
       
      int result = num1/num2;
      
       System.out.println(result);
   
   }
   
   
   public void prueba2(){
       
       try {
            prueba();
       } catch (RuntimeException e) {
           
           System.out.println("No se puede dividir por cero");
       }
       
      
   }
   
   public void exPersonalizadas() throws ExpectionNum0{
   
    int num;
        
        do {      
            num= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
            
            if (num==0) {
                throw new ExpectionNum0();
            }
            
            System.out.println(num);
            
            
            
        } while (num!=0);
   }
    public static void main(String[] args) throws ExpectionNum0 {
        //Las excepciones permiten especificar la forma en la que se manejaran los posibles errores que pueden surgir durante la ejecucion del mismo evitando que el programa se detenga antes de tiempo
        
        
        //Jerarquiea de excepciones
        //La super clase o clase padre se llama throwable de la cual heredan las clases Exception y Error
        
        //Error:  son errores que generalmente se producen por el hardware o agentes externos, los cuales no pueden ser solucionados por el desarrollador
        
        //Exception: Errores de codigo, semanticos, logicos entre otros.
        
        
        //subclases de Exception IOException:  Excepciones verificadas, aquellas que pueden resultar de cambios o agentes externos como cambios de dirrecion 
        //                                     de carpetas, estas excepciones no son producto del programador, pero si pueden ser tratadas por el mismo.
        
        //Excepcions RunTimeExcepcion; Excepciones no verificadas, usualmente errores logicos, parametricos o semanticos del codigo (Tipos no compatibles, operar valores null, dividir entre cero), producidos por el programador y tratados por el mismo.
        
        
        mainexception mp= new mainexception();
        
        
        
        
        mp.exPersonalizadas();
        
        
       
    }
    
}
