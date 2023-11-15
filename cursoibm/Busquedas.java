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
public class Busquedas {

   
    public static void main(String[] args) {
       int []numeros=new int[5];
       
        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i]=Integer.parseInt( JOptionPane.showInputDialog("ingrese un numero"));
            
        }
        System.out.println("\n========ARREGLO======== \n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i+".-> "+numeros[i]+" -- ");
        }
        
        
        secuencialSearch(numeros);
        
        System.out.println("\nAhora con binaria\n");
        
        binarySearch(numeros);
        
    }
    public static void secuencialSearch(int [] a){
    
        int numBusqueda = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero que desea buscar"));
        
        boolean encontrado= false;
        int iterator=0;
        
        
        
        do {            
            if(a[iterator]==numBusqueda){
                encontrado=true;
            }else{
                iterator++;
            }
            
        } while (encontrado==false && iterator<a.length);
        
        
        
        if(encontrado==false){
            JOptionPane.showMessageDialog(null, "lo sentimos el numero "+ numBusqueda + " no se encuentra en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, " el numero "+ numBusqueda + " se encuentra en la posicion "+ iterator);
        }
    }
    
     public static void binarySearch(int [] a){
     
         int aux, pos,auxLim=a.length, auxIn=0,auxMid, numBusqueda,iterator=0;
         
         
         for (int i = 0; i < a.length; i++) {
            pos=i;
            aux = a[i];
            
            while ((pos>0)&& (a[pos-1]>aux)) {                
                a[pos]=a[pos-1];
                pos--;
            }
            a[pos]=aux;
        }
         
         
         System.out.println("\n========ARREGLO ORDENADO======== \n");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i+". "+a[i]+" -- ");
        } 
        
        
         numBusqueda= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero que desea buscar"));
         boolean encontrado= false;
         
         
         
         do {             
             auxMid=(auxIn+auxLim)/2;
             
             if(numBusqueda==a[auxMid]){
                 encontrado=true;
             }else{
                 
                 if(numBusqueda>a[auxMid]){
                     
                     auxIn=auxMid;
                     
                 }else{
                     auxLim=auxMid;
                     
                     
                 }
                 
             }
             iterator++;
             
             
         } while ( encontrado==false && (auxIn<=auxLim) &&(iterator<a.length));
         
         
         if(encontrado==false){
            JOptionPane.showMessageDialog(null, "lo sentimos el numero "+ numBusqueda + " no se encuentra en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, " el numero "+ numBusqueda + " se encuentra en la posicion "+ auxMid);
        }
     }
}