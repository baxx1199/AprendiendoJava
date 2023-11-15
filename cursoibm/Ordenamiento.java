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
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []numeros= new int  [5];
        
        
        for (int i = 0; i < 5; i++) {
            numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            System.out.println(numeros[i]);
        }
        
        
        bubleMethod(numeros);
        
        insertMethod(numeros);
        
        selectedMethod(numeros);
        
    }
    
    
    public static void bubleMethod(int[]a){
        
        //metodo burbuja, poco eficiente, compara uno a uno los elementos de el arreglo con todos los elementos 
    
    int aux ;
            for (int i = 0; i < a.length-1; i++) {
                
                for (int j = 0; j < a.length-1; j++) {
                    if(a[j]>a[j+1]){
                
                    aux = a[j+1];
                    a[j+1]=a[j];
                    a[j]=aux;
                }
                }
                
        }
            System.out.println("\nArreglo ordenado burbuja \n");
            for (int i = 0; i < a.length; i++) {
             System.out.print(a[i]+" - ");
        }
    
    }
    
    public static void insertMethod(int[]a){
        int aux, pos;
        
//        for (int i = 0; i < a.length-1; i++) {
//                for (int j = 0; j < a.length-1; j++) {
//                    if(j==0){
//                        break;
//                    }else if(a[i-1]>a[i]){
//                    
//                        aux = a[j-1];
//                        a[j-1]=a[j];
//                        a[j]=aux;
//                    }
//                
//            }
//        }
        
        
        for (int i = 0; i < a.length-1; i++) {
            pos=i;
            aux = a[i];
            
            while ((pos>0)&& (a[pos-1]>aux)) {                
                a[pos]=a[pos-1];
                pos--;
            }
            a[pos]=aux;
        }

        System.out.println("\nArreglo ordenado insercion\n");
            for (int i = 0; i < a.length; i++) {
             System.out.print(a[i]+" - ");
        }
    }
    
    
    public static void selectedMethod(int[]a){
        
        int min,aux ;
        
        for (int i = 0; i < a.length; i++) {
            min= a[i];
            
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<min){
                    aux=a[j];
                    a[j]=min;
                    min=aux;
                    
                }
            }
        }
        
        System.out.println("\nArreglo ordenado seleccion\n");
            for (int i = 0; i < a.length; i++) {
             System.out.print(a[i]+" - ");
        }
    
    }
}
