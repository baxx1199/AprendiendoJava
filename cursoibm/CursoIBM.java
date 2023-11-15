
package cursoibm;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author baxx
 */
public class CursoIBM {

    
    public static void main(String[] args) {
       
        System.out.println("Hola mundo");
        
        
      //Teoria
        
        
        //OPERADORES ARITMETICOS
        //Los operadores aritmeticos son aquellos simbolos que representan las operaciones basicas, suma, resta, multiplicaccion, division y residuo.
        //siendo estos importantes para realizar diversas acciones con los datos.
        
       Scanner sc = new Scanner(System.in);
        float num1,num2, suma, resta,div,multi,mod;
         num1 = sc.nextFloat();
         num2 = sc.nextFloat();
        
         
         suma = num1 + num2;
         resta = num1 - num2;
         div = num1 / num2;
         multi = num1 * num2;
         mod = num1 % num2;
         
         
         float newSum = suma;
         
         
         System.out.println("La suma de " + num1 + " mas " + num2 + " es =" + suma);
         System.out.println("La resta de " + num1 + " menos " + num2 + " es =" + resta);
         System.out.println("La division de " + num1 + " entre " + num2 + " es =" + div);
         System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es =" + multi);
         System.out.println("el Residuo de " + num1 + " entre " + num2 + " es =" + mod);
         System.out.println(newSum+=6);
        
        
        String word="";
        
        
        
        //entrada y salida con joptionPane
        
       word = JOptionPane.showInputDialog("ingrese una Palabra"); 
//entrada
//        
        JOptionPane.showMessageDialog(null, word);



//Condicionales if y if else

//los condicionales son intrucciones capaces de comparar o evaluar datos o expresiones y asi comprobar si una condicion se cumple o no.
    //if es un condicional simple mientras que if else es un condicional doble
    
    /*
        la condicion devuelve un valor boolean true/false
            Las condiciones que se pueden evaluar son:
                igualdad ==
                diferencia !=
                mayor que >
                menor que <
                mayor o igual que >=
                menor o igual que <=
    */
    
    
      int numero1 = 3, numero2=2;

 
    //ejemplo condicional simple si la condicion no se cumple saldra del condicional sin ejecutar las acciones;
    
   if(numero1>numero2){ //entra en el condicional y evalua la condicion establecidad dentro de los parentesis
        
            JOptionPane.showMessageDialog(null, " "+ numero1 + " es mayor que "+ numero2); //si la condicion es verdadera ejecutara el bloque de codigo establecido dentro de las llaves 
    }
    
    //saldra del condicional una vez ejecutado las acciones dentro del bloque o cuando la condicion sea falsa
        
    
   if(numero1 > numero2){//entra en el condicional y evalua la condicion establecidad dentro de los parentesis
            JOptionPane.showMessageDialog(null, " "+ numero1 + " es mayor que "+ numero2);//si la condicion es verdadera ejecutara el bloque de codigo establecido dentro de las llaves
    }else{
        JOptionPane.showMessageDialog(null, " "+ numero2 + " es mayor que "+ numero1);//si la condicion es falsa ejecutara el bloque de codigo establecido dentro de las llaves de la sentencia else, tambien puede establecerce otra condicion despues del else para que sea comprobada una vez mas
    }
    
   
    //saldra del condicional una vez ejecutado las acciones dentro del bloque o cuando las condiciones sean falsas
    
//    Condicionales Multiples Switch

//con este condicional se analizan n posibilidades de pasos para un mismo dato y ejecutara el bloque de codigo designado para la coincidencia


/* La estructura es la siguiente
     switch (dato) {            En elparentesis se referencia el dato que se analizara
            case dato1:         Los casos son las diferentes posibilidades que puede tener dicho dato
                                Al encontrar coincidencia ejectara el codigo despues de los dos puntos hasta encontrar un sentencia break

                break;          El break fuerza a la terminacion del switch, es importante siempre colocarlo para evitar ejecucion de codigo no deseado
            
            case dato2:
                
                break;
            case dato3:
                
                break;
            default:            El default sera el caso establecido por defecto que se ejecutara si no se encuentra alguna coincidencia 
                throw new AssertionError();
        }

*/
       

      int dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero 1-3"));
        
        switch (dato) {
            case 1:
                    JOptionPane.showMessageDialog(null, dato + " Es Batman");
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, dato + " Es Superman");
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, dato + " Es Wonder Woman");
                break;
            default:
                JOptionPane.showMessageDialog(null, dato + " No forma parte de los heroes");
        }
        
//Operador ternario, if de una sola linea

            /*
                La sintaxis es la siguiente
                variable = (Condicion) ? valor1 : valor 2;

                el valor 1 es que tomara la variable si la condicion es verdadera, el valor 2 se tomara si es falso
            */

            int num;
            String mensaje;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            mensaje = (num%2==0) ? "Es par": "Es impar";

            JOptionPane.showMessageDialog(null, mensaje);
            
            
           
            /*
                BUCLES 
            
            lOS BUCLES PERMITEN EJECUTAR REPETIDAMENTE UNA ACCION SIEMPRE Y CUANDO SE CUMPLA UNA CONDICION
            
            
            WHILE
                Los bucles while analizan una condicion y si esta se cumple ejecuta las instrucciones hasta que dicha condicion no se cumpla, si la condicion no cambia el bucle se ejecutara infinitamente
                
                while(condicion){
                    instruccion
                }
            
            DO WHILE
                Los bucles do while ejecutan almenos una vez las instrucciones antes de analizar la condicion
            
                do{
                    Instruccin
                }while(condicion);
            
            FOR
                El bucle for ejecuta las acciones un numero de veces establecidos, es muy util cuando se quiere ejecutar intrucciones un numero de veces determinado
                    
                For(inizializador; condicion; aumento o decremento){
                    condicion;
                }
            
            
            */
            
            
            
            // Arreglos
            
            //los arreglos, arrays o vectores son un conjunto o agrupacion de datos, esta estructura es capaz de almacenar un numero determinado de datos
            //en los arreglos el numero de datos a almacenar debe ser determinado desde el principio y este no cambiara a lo largo del programa
            // los datos almacenados en un arreglo deben ser del mismo tipo
            //Los arrays pertenencen a las estructuras de datos estaticas
            //Las posiciones de un arreglo van desde 0 hasta n-1, siendo n el tamaño del array
            
            /*
            Definicion de un array:
                int [] numeros = new int[3];
            
                para definir un arreglo se debe especificar:
                    1.el tipo de dato que se almacenara en el arreglo
                    2.corchetes [], siendo estos los que determinaran que es un arreglo
                    3.Nombre del arreglo.
                    4.se definira el tamaño del arreglo 
            
                formas de llenar un array 
            
             posicion por posicion
                        aca solo se llama al arreglo y en los corchetes se estable la posicion que se va a modificar
            
            
                    numeros [0] = 3;
                    numeros [1] = 5;
                    numeros [2] = 7;
            
            
            llenandolo desde la declaracion
            
                Cuando se declara el array en lugar de definir el tamaño del mismo se especifican los valores que contendra en cada una de sus posiciones
                        
                    int [] numeros = {3,5,7};
            
            RECORRER E IMPRIMIR UN ARREGLO
            
                La forma mas comun de recorrer e imprimir un arreglos es por medio de los bucles, siendo el for una de las opciones mas faciles
            
                for(int i = 0;i<numeros.lenght;i++){
            
                   system.out.println( numero[i]);
                }
            
            for each para arrays
            
                Con el bucle for each se simplifican los parametros requeridos siendo estos el tipo de dato del array, 
                una variable iteratoria y el nombre de el arreglo a recorrer
            
                for(int i : numeros){
                    system.out.println( i);
                }
            */
            
            
    }
    
}
