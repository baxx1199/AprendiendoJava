/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoibm;

import java.util.Scanner;

/**
 *
 * @author baxx
 */
public class ejeuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //caulcular 3 e imprimir la suma de tres notas
        
        Scanner sc = new Scanner(System.in);
        
        ejercicioOcho(sc);
       
    }
    
    public static void ejerciciouno(Scanner sc){
         float nota1,nota2,nota3, total;
        
        
        System.out.println("Porfavor ingrese la nota 1");
        nota1 = sc.nextFloat();
        
        System.out.println("Porfavor ingrese la nota 2");
        nota2 = sc.nextFloat();
        
        System.out.println("Porfavor ingrese la nota 3");
        nota3 = sc.nextFloat();
        
        
        total = nota1+nota2 + nota3;
        
        System.out.println("La nota final es: " + total);
    }
    
    public static void ejerciciosalario(Scanner sc){
        int horas, valor, salarioT;
        
        
        System.out.println("Ingrese el numero de horas trabajadas");
        horas = sc.nextInt();
        
        System.out.println("Ingrese el valor pagado por hora");
        valor = sc.nextInt();
        
        
        salarioT = horas * valor;
        
        System.out.println("Su salario es: "+ salarioT);
        
    }
    public static void ejercicioTres(Scanner sc){
        int guillermo,luis,juan,total;
        
        
        System.out.println("Ingrese el numero de dolares de guillermo");
        guillermo = sc.nextInt();
        luis = guillermo/2;
        System.out.println("luis tiene $"+ luis);
        juan = (luis + guillermo)/2;
        System.out.println("juan tiene $"+ juan);
        
        total = guillermo+ luis + juan;
        
        System.out.println("Guillermo, Luis y Juan tienen $" + total + " Dolares");
                
        
        
    }
    public static void ejerciciocuatro(Scanner sc){
        
        final int sueldobase = 1000;
        int autosVendidos;
        float precioAuto, sueldoT, aux;
        
        System.out.println("¿Cuantos autos vendio?");
        autosVendidos = sc.nextInt();
        aux = autosVendidos * 150;
        sueldoT = sueldobase + aux;
        System.out.println("Ingrese el precio de lo autos");
        precioAuto = sc.nextFloat();
        
        aux = (precioAuto * 0.05f)*autosVendidos;
        sueldoT += aux;
        
        
        System.out.println("Su sueldo es : $"+sueldoT);
        
        
                
        
        
    }
    public static void ejercicioCinco(Scanner sc){
        
       float participacion, exam1, exam2,examFinal, total;
       
        System.out.println("Ingrese nota de participacion");
        participacion = sc.nextFloat() * 0.1f;
        System.out.println("Ingrese nota del examen uno");
        exam1 = sc.nextFloat() * 0.25f;
        System.out.println("Ingrese nota del examen dos");
        exam2 = sc.nextFloat() * 0.25f;
        System.out.println("Ingrese nota del examen Final");
        examFinal = sc.nextFloat() * 0.4f;
        total = participacion + exam1 + exam2 + examFinal ;
        System.out.println("Su nota final es: " + total);
        
                
        
        
    }
    
     public static void ejercicioSeis(Scanner sc){
        
       float a,b,resultado;
        
         System.out.println("Ingrese un valor para a");
         a= sc.nextFloat();
               
         System.out.println("Ingrese un valor para b");
         b= sc.nextFloat();
        
         
         resultado = (a*a) + (b*b)+ 2*(a*b);
         
         System.out.println("("+a+"+"+b+")^2 =(a*a) + (b*b)+ 2*(a*b) es igual "+resultado);
        
    }
     public static void ejercicioSiete(Scanner sc){
        
       int horasIn, semanas,dias, horas; 
        
         System.out.println("Ingrese un numero de horas");
         horasIn = sc.nextInt();
         
         semanas = horasIn/168;
         dias = horasIn%168/24;
         horas = horasIn%24;
         
         System.out.println(horasIn+" hrs es igual a: "+ semanas+" Semanas "+ dias+ " dias "+horas +" horas ");
         
         
    }
     public static void ejercicioOcho(Scanner sc){
        
       double a,b,c,x1,x2;
       
       System.out.println("Ingrese un valor para a");
         a= sc.nextDouble();
               
         System.out.println("Ingrese un valor para b");
         b= sc.nextDouble();
         
         System.out.println("Ingrese un valor para c");
         c= sc.nextDouble();
         
         
         x1 = (-b + Math.sqrt((b*b)- (4*a*c)))/(2*a);
         x2 = (-b - Math.sqrt((b*b)- (4*a*c)))/(2*a);
         
         
         System.out.println("La ecuacion de segundo grado "+a+"x^2+"+b+"x+"+c + "= 0 tiene como rsultados");
         System.out.println(" x1 =" +x1);
         System.out.println(" x2 =" +x2);
    }
}
