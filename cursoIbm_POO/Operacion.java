/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;

import javax.swing.JOptionPane;

public class Operacion {
//        int num1;
//        int num2;
        int suma;
        int resta;
        int division;
        int multiplicacion;
        int modulo;
        
        
//        public void leerNumeros(){
//            
//            num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
//            
//            num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
//        }
        
        
        
        public void obtenerSuma(int num1, int num2){
            suma= num1+num2;
            JOptionPane.showMessageDialog(null, "La suma del numero "+num1 +" y "+num2+" es: "+ suma);
        }
        
        
        public void obtenerResta(int num1, int num2){
            resta= num1-num2;
            JOptionPane.showMessageDialog(null, "La resta del numero "+num1 +" menos  "+num2+" es: "+ resta);
        }
        
        public void obtenerDivision(int num1, int num2){
            division= num1/num2;
            JOptionPane.showMessageDialog(null, "La division del numero "+num1 +" entre "+num2+" es: "+ division);
        }
        
        
        public void obtenerMultiplicacion(int num1, int num2){
            multiplicacion= num1*num2;
            JOptionPane.showMessageDialog(null, "La multiplicacion del numero "+num1 +" por "+num2+" es: "+ multiplicacion);
        }
        
        public void obtenerMod(int num1, int num2){
            multiplicacion= num1%num2;
            JOptionPane.showMessageDialog(null, "El modulo del numero "+num1 +" entre "+num2+" es: "+ modulo);
        }
}
