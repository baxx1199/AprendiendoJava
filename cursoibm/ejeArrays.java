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
public class ejeArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejeQuince();
    }
    public static void ejeUno(){
        
        int[] numeros = new int [5];
        
        for (int i = 0; i < 5;i++) {
           numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        for (int i = 0; i < 5;i++) {
            System.out.println(numeros[i]);
        }
        
    }
    public static void ejeDos(){
        
        int[] numeros = new int [5];
        
        for (int i = 0; i < 5;i++) {
           numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        for (int i = 4; i >= 0;i--) {
            System.out.println(numeros[i]);
        }
        
    }
    public static void ejeTres(){
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo"));
        int[] numeros = new int [tamaño];
        
        for (int i = 0; i < numeros.length;i++) {
           numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        for (int i = 0; i < numeros.length/2;i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[(numeros.length-1)-i]);
        }
        
    }
    public static void ejeCuatro(){
        
        int[]a = {1,2,3,4,5,6,7,8,9,10};
        int[]b = {100,101,102,103,104,105,106,107,108,109};
        int[]ab = new int [20];
        
        
        for (int i = 0; i < 20;i++) {
           
           if(i%2 !=0){
               ab[i]= b[i/2];
           }else{
               ab[i]= a[i/2];
           }
        }
           
        
        
        
        System.out.println("\nArreglo A");
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println("\nArreglo B");
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+b[i]);
        }
        
        System.out.println("\nArreglo AB");
        for (int i = 0; i < 20; i++) {
            System.out.print(" "+ab[i]);
        }
        
        
        
        
    }
    public static void ejeCinco(){
        int[]a = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[]b = {100,101,102,103,104,105,106,107,108,109,110,111};
        int[]ab = new int [24];
        
        int j = 0;
        while(j < 24){
            
            for (int i = 0; i < 12; i++) {
                    if((j>=0 && j<=2) || (j>=6 && j <= 8) || (j>=12 && j <= 14)|| (j>=18 && j <= 20)){
                        ab[j]=a[i];
                        j++;
                    }else{
                        ab[j]=b[i];
                        j++;
                     }
                }
            
        
        }
        
        System.out.println("\nArreglo A");
        for (int i = 0; i < 12; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println("\nArreglo B");
        for (int i = 0; i < 12; i++) {
            System.out.print(" "+b[i]);
        }
        
        System.out.println("\nArreglo AB");
        for (int i : ab) {
            System.out.println(i);
        }
            
        
    }
    
    
    public static void ejeSeis(){
        int [] numeros = new int [10];
        char orden = 'i';
        
        
        for (int i = 0; i < 10; i++) {
            numeros[i] =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        
        for (int i = 2; i < 10; i++) {
            if(numeros[i-2]>numeros[i-1]&&numeros[i-1]>numeros[i]){
                orden='d';
            }else if(numeros[i-2]<numeros[i-1]&&numeros[i-1]<numeros[i]){
                orden='c';
            }else if(numeros[i-2]==numeros[i-1]&&numeros[i-1]==numeros[i]){
                orden = 'i';
            }else{
                orden = 'a';
                break;
                        
            }
            
           
        }
        
        switch (orden) {
            case 'a':
                System.out.println("numeros en desorden");
                break;
            case 'c':
                System.out.println("numeros en orden creciente");
                break;
            case 'd':
                System.out.println("numeros en orden decreciente");
                break;
                
            case 'i':
                System.out.println("numeros iguales");
                break;
            
        }
        System.out.println("");
        for (int i: numeros) {
            System.out.print(i+ " - ");
            
        }
    
    }
    public static void ejeSiete(){
         int [] numeros = new int [10];
         int numBusqueda;
         boolean encontrado=false;
        
        for (int i = 0; i < 10; i++) {
            numeros[i] =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        
        numBusqueda = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero desea buscar?"));
        
        for(int i = 0; i < 10; i++){
            
            if(numeros[i]==numBusqueda){
                System.out.println("El numero buscado se encuentra en la posicion "+ i);
                encontrado = true;
                break;
            }
        }
        
        if(encontrado == false){
            JOptionPane.showMessageDialog(null, "El numero no se encontro");
        }
        
    }
    
    public static void ejeOcho(){
         int [] numeros = new int [10];
         int numDez, numIn;
         
        
        for (int i = 0; i < 8; i++) {
            numeros[i] =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        
         for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
        numIn = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero desea ingresar?"));
        numDez = Integer.parseInt(JOptionPane.showInputDialog("¿En que posicion desea ingresarlo?"));
        
        
        for(int i = 8; i > numDez; i--){
            
            numeros[i]=numeros[i-1];
        }
        
        numeros[numDez]=numIn;
        
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
        
    }
    
    public static void ejeNueve(){
         int [] numeros = new int [10];
         int numDez, aux;
         
        
        for (int i = 0; i < 10; i++) {
            numeros[i] =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        
         for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]+ " - ");
        }
        
        numDez = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas posiciones desea desplazar?"));
        
        while(numDez > 0){
            aux = numeros[numeros.length-1];
            System.out.println(" \nauxilir: "+ aux);
            for (int j = numeros.length-1; j > 0; j--) {
                
                numeros[j]= numeros[j-1];
            }
            numeros[0]=aux;
            for (int l = 0; l < 10; l++) {
            System.out.print(numeros[l]+ " - ");
            }
            System.out.println(" ");
            numDez--;
        }
        
        
       
        
        
        
    }
    
    public static void ejeDiez(){
        int [] numeros = new int [10];
         int numN, paux=0,aux;
        
         for(int i =0;i<5;i++){
             numN = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
             if(i==0){
                 numeros[i]=numN;
             }else {
                 
                    if(numN > numeros[i-1]){
                    numeros[i]=numN;
                    }else{
                        do {                            
                            JOptionPane.showMessageDialog(null, "el numero debe ser mayor que "+ numeros[i-1] );
                            numN = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        } while (numN < numeros[i-1]);
                        numeros[i]=numN;
                    }
            }
         }
         
         
         for(int i =0;i<5;i++){
             System.out.print(numeros[i]+ " - ");
         }
         
         for (int i = 0; i < 4; i++) {
            numN = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero a insertar"));
         
         if(numN < numeros[0]){
                 paux = 0;
             }else{
                for(int j =1;j<10;j++){
                    
                    if(numN == numeros[j]|| numN == numeros[j-1] || numN == numeros[j+1] ){
                        while (numN == numeros[j] || numN == numeros[j-1] || numN == numeros[j+1]) {                            
                            numN = Integer.parseInt(JOptionPane.showInputDialog("el numero ya se encuentra en el arreglo, Ingrese un numero a insertar, debe ser diferente a "+ numeros[j]));
                        }
                        paux=j;
                        break;
                    }else if(numN > numeros[j-1]&& numN < numeros[j]){
                        paux=j;
                        break;
                    }else if(numN > numeros[j-1]&&  numeros[j]==0){
                        paux=j;
                        break;
                    }
            }
         }
         
         
         System.out.println(" \n "+paux+" \n");
         aux = numeros[numeros.length-1];
         
         for(int l = numeros.length-1; l > paux; l--){
             numeros[l] = numeros[l-1];
             
         }
                 
         numeros[paux]=numN;
         
         for(int l =0;l<10;l++){
             System.out.print(numeros[l]+ " - ");
         }
        }
         
         
    }
    
    
    
    public static void ejeOnce(){
            int [] numeros = new int[10];
            int del;
            
            for (int i = 0; i < 10; i++) {
            numeros[i] =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
            
            //imprimir el arreglo
            
            for (int i = 0; i < 10; i++) {
            
                    System.out.print(numeros[i] + " - " );
        }
            
            System.out.println("");
            //elegir el numero a eliminar
            
            del =Integer.parseInt(JOptionPane.showInputDialog("Elija la posicion que desaea eliminiar"));
            
            if((del >=0 && del <= 9)==false){
                do {                    
                    del =Integer.parseInt(JOptionPane.showInputDialog("Elija la posicion que desaea eliminiar entre 0y 9"));
                } while ((del >=0 && del <= 9)==false);
            }
            
            System.out.println("Se eliminara la posision " + del);
            int lim = (numeros.length-1) - del;
            
            System.out.println("el limite es: " + lim);
            
            for (int i = del; i < numeros.length; i++) {
                
                
                System.out.println("el valor de i es: " + i + " y guarda " + numeros[i]);
                if(i == numeros.length-1){
                    numeros[i]=0;
                }else{
                    numeros[i]= numeros[i+1];
                }
                
            
        }
            
            //imprimir arreglo final
            
            for (int i = 0; i < 9; i++) {
            
                    System.out.print(numeros[i] + " - " );
        }
            
    }
    
    public static void ejeDoce(){
        
        int [] numeros = new int[10];
        int [] pares = new int [10];
        int [] impares = new int [10];
        int auxP =0, auxIm =0;
        
        for (int i = 0; i < 10; i++) {
            numeros[i] =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }
        
        for (int i = 0; i < 10; i++) {
            if(numeros[i]%2==0){
                pares[auxP]=numeros[i];
                auxP++;
            }else{
                impares[auxIm]=numeros[i];
                auxIm++;
            }
        }
        
        System.out.println("Arreglo principal");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]+" - ");
        }
        
        System.out.println("Arreglo pares");
        for (int i = 0; i < auxP; i++) {
            System.out.print(pares[i]+" - ");
        }
        
        System.out.println("Arreglo Impares");
        for (int i = 0; i < auxIm; i++) {
            System.out.print(impares[i]+" - ");
        }
    }
    
    public static void ejeTrece(){
        int [] numerosA = new int[4];
        int [] numerosB = new int[4];
        int [] numerosAB = new int[8];
        int aux;
        
        for (int i = 0; i < 4; i++) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para el arreglo A"));
            
            if(i==0){
                numerosA[i]=aux;
                numerosAB[i]=aux;
            }else{
                if(aux > numerosA[i-1]){
                    numerosA[i]=aux;
                    numerosAB[i]=aux;
                }else{
                    do {                        
                        JOptionPane.showMessageDialog(null, "error, El numero debe ser mayor a "+ numerosA[i-1]);
                        aux = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
                    } while (aux < numerosA[i-1]);
                    numerosA[i]=aux;
                    numerosAB[i]=aux;
                }
            }
        }
        
        
        System.out.println("\n arreglo A");
        for (int i = 0; i < 4; i++) {
            System.out.print(numerosA[i]+" - ");
        }
        
        System.out.println("\n arreglo AB");
        for (int i = 0; i < numerosAB.length; i++) {
            System.out.print(numerosAB[i]+" - ");
        }
        
        
        for (int i = 0; i < 4; i++) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para el arregloB"));
            
            if(i==0){
                numerosB[i]=aux;
            }else{
                if(aux > numerosB[i-1]){
                    numerosB[i]=aux;
                }else{
                    do {                        
                        JOptionPane.showMessageDialog(null, "error, El numero debe ser mayor a "+ numerosB[i-1]);
                        aux = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
                    } while (aux < numerosB[i-1]);
                    numerosB[i]=aux;
                }
            }
        }
        
        
        System.out.println("\n arreglo B");
        for (int i = 0; i < 4; i++) {
            System.out.print(numerosB[i]+" - ");
        }
        
        int auxAB=0;
        
        

        //fusionarlos
        System.out.println("");
        
    int temp=8,itera =0;
    boolean encontrado =false;
        for (int i = 0; i < 4; i++) {
            itera =0;
            aux = numerosB[i];
            
            System.out.println("este es el valor de aux "+ aux + " en la posicion i ="+ i);
            
            if(itera==0 && (aux < numerosAB[0]||aux == numerosAB[0])){
                    
                        temp =0;
                       
                        
                        System.out.println("yey encontrado");
                    
                }else{
                
                    do {        
                        System.out.println("itera "+ itera);

                            itera++;
                            encontrado = false;
                            if(aux > numerosAB[itera-1] && aux< numerosAB[itera]||aux > numerosAB[itera-1] &&  numerosAB[itera]==0 || aux > numerosAB[itera-1] && aux == numerosAB[itera]){
                                temp = itera;
                                encontrado = true;
                                System.out.println("yey encontrado en el do");
                            }


                    } while (encontrado == false && itera <=numerosAB.length-1);
                    System.out.println("itera "+ itera+ "  " +encontrado);
            }
            

          
            for (int k = 7; k > temp; k--) {
                    
                   auxAB = numerosAB[k];
                    numerosAB[k]= numerosAB[k-1];
                    
                    
                    
                }
            numerosAB[temp]= aux;
            
            
        }
        
        
        //imprimir arreglos
        System.out.println("Arreglo fusionado");
        
        for (int i = 0; i < numerosAB.length; i++) {
            
            System.out.print(numerosAB[i]+" - ");
            
        }
    }
    
    public static void ejeCatorce(){
    
        int [] numeros = new int[10];
        int numBusqueada, aux;
        
        boolean encontrado = false;
        
        
        for (int i = 0; i < 10; i++) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            
            if(i==0){
                numeros[i]= aux;
                
            }else{
                
                if(aux > numeros[i-1]){
                    numeros[i]=aux;
                }else{
                    do {                        
                         aux = Integer.parseInt(JOptionPane.showInputDialog("El numero debe ser mayor y diferente a "+numeros[i-1]+" Ingrese un numero nuevo"));
                    } while (aux <= numeros[i-1]);
                    numeros[i]=aux;
                }
            
            }
        }
        
        numBusqueada = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero desea buscar?"));
        
        int iterator =0;
        do {            
            if(numeros[iterator]==numBusqueada){
                
                encontrado = true;
            }else{
                iterator++;
            }
        } while (iterator < 10 && encontrado==false);
        
        if(encontrado == true){
            JOptionPane.showMessageDialog(null, "El numero buscado fue encontrado en la posicion "+ iterator);
        }else{
            JOptionPane.showMessageDialog(null, "Lo sentimos, numero buscado no fue encontrado  ");
        }
        
    }
    
    
    public static void ejeQuince(){
        //gestion de notas por grupo, cada grupo consta de 5 alumnos, se deben pedir las notas de cada alumno de los tres cortes , 
        //Se debe mostrar el promedio de el curso por trimestre y la media de un alumno N (sera introducido por teclado)
        
        
        double promPrimero =0, promSegundo=0, promTercero=0 , promAlumno=0;
        
        double [] primerTri = new double [5];
        double [] segundoTri = new double [5];
        double [] tercerTri = new double [5];
         
        
        
        
        for (int i = 0; i < 5; i++) {
            
            primerTri[i]= Double.parseDouble( JOptionPane.showInputDialog(" ingrese la nota del "+ (i+1)+"° alumno para el primer trimestre (use , paraa el punto decimal)"));
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            segundoTri[i]= Double.parseDouble( JOptionPane.showInputDialog(" ingrese la nota del "+ (i+1)+"° alumno para el segundo trimestre (use , paraa el punto decimal)"));
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            tercerTri[i]= Double.parseDouble( JOptionPane.showInputDialog(" ingrese la nota del "+ (i+1)+"° alumno para el tercer trimestre (use , paraa el punto decimal)"));
            
        }
        
        System.out.println("primer trimestre\n");
        for (int i = 0; i < 5; i++) {
            System.out.println( "alumno no° "+(i+1)+ "  "+primerTri[i]+" -");
        }
        
        System.out.println("segundo trimestre\n");
        for (int i = 0; i < 5; i++) {
            System.out.println( "alumno no° "+(i+1)+ "  "+segundoTri[i]+" -");
        }
        System.out.println("tercer trimestre\n");
        for (int i = 0; i < 5; i++) {
            System.out.println( "alumno no° "+(i+1)+ "  "+tercerTri[i]+" -");
        }
        
        for (int i = 0; i < 5; i++) {
            promPrimero += primerTri[i];
            promSegundo += segundoTri[i];
            promTercero += tercerTri[i];
            
        }
        

            promPrimero = promPrimero/5;
            promSegundo = promSegundo/5;
            promTercero = promTercero/5;
        
        System.out.println("El promedio del grupo en el primer trimestre es "+ promPrimero);
        System.out.println("El promedio del grupo en el segundo trimestre es "+ promSegundo);
        System.out.println("El promedio del grupo en el tercer trimestre es "+ promTercero);
        
        int selec=6;
        
        do {            
            selec = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del alumno que desea ver el promedio,alumnos 1-5, si no desea continuar indique 6"));
            
            promAlumno = (primerTri[selec-1]+segundoTri[selec-1]+tercerTri[selec-1])/3;
            
            System.out.println("\n El promedio del aulmno "+ selec + " es: "+ promAlumno);
            
        } while (selec != 6);
    }
}
