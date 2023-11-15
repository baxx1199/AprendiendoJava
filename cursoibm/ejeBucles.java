/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoibm;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author baxx
 */
public class ejeBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            ejeCinco();
    }
    
    public static void ejeUno(Scanner sc){
        System.out.println("ingrese un numero");
        int num = sc.nextInt();
        while(num > 0){
            System.out.println("El cuadrado de "+num +" es "+num*num);
             System.out.println("ingrese un numero");
        num = sc.nextInt();
        }
        
    }
    
    public static void ejeDos(Scanner sc){
        
        int num , suma =0;
        
        do {            
            System.out.println("ingrese un numero");
            num = sc.nextInt();
            
            suma += num;
        } while (num != 0);
            
        System.out.println(suma);
    }
    
    
    public static void ejeTres(){
        
//        int num, factorial=1, i =1;
//        
//        num = Integer.parseInt( JOptionPane.showInputDialog("Ingrese un numero"));
//        
//        
//        
//        do {            
//            factorial *= i;
//            i++;
//        } while (i <= num);
        int num,factorial=1;
        num = Integer.parseInt( JOptionPane.showInputDialog("Ingrese un numero"));
        for (int i = 1;i<=num;i++) {
            
            factorial *= i;
        }
        
        JOptionPane.showMessageDialog(null,"EL factorial de "+ num + " es igual a: "+ factorial);
    }
    
    
    
    public static void ejeCuatro(){
        
        int num,mayor=0, aux;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("¿cuantos sueldos va a ingresar?"));
        for (int i = 1; i <= num; i++) {
            aux =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario"));
            if(aux > mayor){
                mayor= aux;
                 }
        }
        JOptionPane.showMessageDialog(null, "El suedo mayor es"+mayor);
    }
    
    public static void ejeCinco(){
        float nota;
        String nombre, reprobados="";
        short numRep=0;
        
        for(int i= 1; i<=5; i++){
            nombre = JOptionPane.showInputDialog("ingrese El nombre del estudiante");
            nota = Float.parseFloat(JOptionPane.showInputDialog("ingrese la primera nota"));
            
            
            if(nota < 3.5){
                numRep++;
                reprobados += nombre + ": " + nota + " \n"; 
            }
        }
        JOptionPane.showMessageDialog(null, "Hay " +numRep + " estudiantes reprobados \n"+ reprobados);
        
    }
}
