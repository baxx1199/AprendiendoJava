/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoibm;

import javax.swing.JOptionPane;

/**
 *
 * @author baxx
 */
public class ejecondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejeSeis();
    }
    
    public static void ejeUno(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
        JOptionPane.showMessageDialog(null, (numero%10==0)? "Es mulriplo de 10":"No es multiplo de 10");
        
    }
    
    public static void ejeDos(){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
        
        if(numero1 == numero2){
            JOptionPane.showMessageDialog(null, numero1+" y "+ numero2+ "Son iguales");
        }else if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, numero1+" es mayor que "+ numero2);
        }else{
            JOptionPane.showMessageDialog(null, numero2+" es mayor que "+ numero1);
        }
        
    }
    
    public static void ejeTres(){
        char letra = JOptionPane.showInputDialog("Escriba una letra").charAt(0);
       
        
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, letra+" Es Mayuscula ");
        
        }else{
            JOptionPane.showMessageDialog(null, letra+" no es mayuscula ");
        }
        
    }
    public static void ejeCuatro(){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
        
        if(numero1 > numero2 && numero1 > numero3){
            if(numero2 > numero3){
                JOptionPane.showMessageDialog(null,"Los numeros ordenados de mayor a menor son "+numero1 +" "+ numero2 +" "+ numero3);
            }else{
                JOptionPane.showMessageDialog(null,"Los numeros ordenados de mayor a menor son "+numero1 +" "+ numero3 +" "+ numero2);
            }
        
        }else if(numero2 > numero1 && numero2 > numero3){
            if(numero1 > numero3){
                JOptionPane.showMessageDialog(null,"Los numeros ordenados de mayor a menor son "+numero2 +" "+ numero1 +" "+ numero3);
            }else{
                JOptionPane.showMessageDialog(null,"Los numeros ordenados de mayor a menor son "+numero2 +" "+ numero3 +" "+ numero1);
            }
        
        }else{
            if(numero1 > numero2){
                JOptionPane.showMessageDialog(null,"Los numeros ordenados de mayor a menor son "+numero3 +" "+ numero1 +" "+ numero2);
            }else{
                JOptionPane.showMessageDialog(null,"Los numeros ordenados de mayor a menor son "+numero3 +" "+ numero2 +" "+ numero1);
            }
        }
        
    }
    public static void ejeCinco(){
        int dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese un dia"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese un mes"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("ingrese un año"));
        
        
        if(dia > 0 && dia <=30){
            if(mes > 0 && mes <= 12){
                JOptionPane.showMessageDialog(null, " La fecha "+ dia + " / "+ mes+ " / "+ anio+ " es Correcta");
            }else{
                JOptionPane.showMessageDialog(null, " La fecha "+ dia + " / "+ mes+ " / "+ anio+ " no es correcta verifique el mes");
            }
        
        }else{
            JOptionPane.showMessageDialog(null, " La fecha "+ dia + " / "+ mes+ " / "+ anio+ " no es correcta verifique el dia");
        }
        
    }
    public static void ejeSeis(){
        int dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese un dia"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese un mes"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("ingrese un año"));
        
        
        if(dia > 0 && dia <=31){
            if(mes > 0 && mes <= 12){
                if(mes == 2 && dia <= 28 ){
                    JOptionPane.showMessageDialog(null, " La fecha "+ dia + " / "+ mes+ " / "+ anio+ "  es correcta ");
                }else if(mes%2==0 && mes !=2 && dia <=30){
                    JOptionPane.showMessageDialog(null, " La fecha "+ dia + " / "+ mes+ " / "+ anio+ "  es correcta ");
                }else if(mes%2!=0 && dia <=31){
                    JOptionPane.showMessageDialog(null, " La fecha "+ dia + " / "+ mes+ " / "+ anio+ "  es correcta ");
                }else{
                    JOptionPane.showMessageDialog(null, " La fecha "+ dia + " / "+ mes+ " / "+ anio+ " no es correcta verifique el dia");
                }
            }else{
                JOptionPane.showMessageDialog(null, " La fecha "+ dia + " / "+ mes+ " / "+ anio+ " no es correcta verifique el mes");
            }
        
        }else{
            JOptionPane.showMessageDialog(null, " La fecha "+ dia + " / "+ mes+ " / "+ anio+ " no es correcta verifique el dia");
        }
        
    }
}
