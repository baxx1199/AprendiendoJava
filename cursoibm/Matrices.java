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
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrizmarco();
    }
    
    
    public static void matrixSimetrica(){
        
        //definicion de variables
            int matrizNum [][],matrizAux[][], numFil, numCol;
        
        //solictar tamaño de matriz al usuario
        numFil = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de filas de la matriz"));
        
        numCol = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de columnas de la matriz"));
        
        
        //creacion de matriz
        matrizNum=new int[numFil][numCol];
        //ingresando datos
        for (int i = 0; i < numFil; i++) {
            for (int j = 0; j < numCol; j++) {
                matrizNum[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para la posiscion fila "+ i + " col "+j));
            }
        }
        //imprimiendo matriz
        System.out.println("\nLa matriz inicial es:\n");
        for (int i = 0; i < numFil; i++) {
            for (int j = 0; j < numCol; j++) {
                System.out.print("["+ matrizNum[i][j] +"] - ");
            }
            System.out.println("");
        }
        
        
        
        //comprobacion de simetria
        
        boolean simetria = false;
        
        //primer filtro igualdad de tamaños
        if(numFil==numCol){
            simetria=true;
            
            //crear tranpuesta
            matrizAux=new int[numFil][numCol];
            
                for (int i = 0; i < numFil; i++) {
                    for (int j = 0; j < numCol; j++) {
                        matrizAux[i][j]=matrizNum[j][i];
                        }

                }


//imprimir transpuesta
                System.out.println("\nLa matriz transpuesta es:\n");
                    for (int i = 0; i < numFil; i++) {
                        for (int j = 0; j < numCol; j++) {
                            System.out.print("["+ matrizAux[i][j] +"] - ");
                        }
                        System.out.println("");
                }
            
                    
                    //verificacion de simetria posicion por posicion
            for (int i = 0; i < numFil; i++) {
                for (int j = 0; j < numCol; j++) {
                    if(matrizNum[i][j]!=matrizAux[i][j]){
                        simetria=false;
                    }
                }
            System.out.println("");
        }
        }else{
            
            simetria=false;
        }
        
        
        
        if(simetria==true){
            System.out.println("\n La matriz es simetrica \n");
        }else{
            System.out.println("\n La matriz no es simetrica \n");
        
        }
    }
    
    public static void sumaMatricez() {
        int matrizA[][], matrizB[][], matrizAB[][];
        
        
        matrizA= new int[3][3];
        matrizB= new int[3][3];
        matrizAB= new int[3][3];
        
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j]= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la matriz A fila: ["+i+"] columna ["+j+"]"));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j]= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la matriz B fila: ["+i+"] columna ["+j+"]"));
            }
        }
        
        System.out.println("\nLa matriz A es:\n");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("["+ matrizA[i][j] +"] - ");
                        }
                        System.out.println("");
                }
                    
        System.out.println("\nLa matriz B es:\n");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("["+ matrizB[i][j] +"] - ");
                        }
                        System.out.println("");
                }            
                    
        
            System.out.println("\nLa suma de las matrices A y B es ");        
          System.out.println("\nLa matriz AB :\n");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            
                            matrizAB[i][j]= (matrizA[i][j] + matrizB[i][j]);
                            System.out.print("["+ matrizAB[i][j] +"] - ");
                        }
                        System.out.println("");
                }          
    }
    public static void transpuesta() {
        int matriz[][],aux;
        
        
        matriz = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para la posiscion fila "+ i + " col "+j));
            }
        }
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matriz[i][j] +"] - ");  
            }
            System.out.println("");
        }
        
        
        //sacar tranpuesta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
            
        }
        
        
        
        //imprimir tranpsuesta
        System.out.println("\n La matriz transpursta es");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matriz[i][j] +"] - ");  
            }
            System.out.println("");
        }
    }
    
    public static void matrizIdentidad(){
        int matrizIden[][]= new int[7][7];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(j==i){
                    matrizIden[i][j]=1;
                }else{
                    matrizIden[i][j]=0;
                }
            }
            
        }
        
        //imprimir Identidad
        System.out.println("\n La matriz Identidad es");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("["+ matrizIden[i][j] +"] - ");  
            }
            System.out.println("");
        }
        
    }
    
    public static void filasYcolumnas(){
    
        int matrizNxM[][], nFilas,mColumnas;
        
        
        nFilas=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de filas de la matriz"));
        
        mColumnas=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de columnas de la matriz"));
        
        
        matrizNxM=new int[nFilas][mColumnas];
        
       int auxSum=0, auxSumCol=0;
        
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mColumnas; j++) {
                matrizNxM[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para la posiscion fila "+ i + " col "+j));
            }
        }
        
        //imprimir matriz
        System.out.println("\n La matriz  es");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mColumnas; j++) {
                auxSum+=matrizNxM[i][j];
                
                
                System.out.print("["+ matrizNxM[i][j] +"]  ");
            }
            
            System.out.print(" = ["+auxSum+"]");
            auxSum=0;
            System.out.println("");
        }
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mColumnas; j++) {
                auxSumCol+=matrizNxM[j][i];
            }
            System.out.print("["+ auxSumCol +"] ");
            auxSumCol=0;
        }
        System.out.println("");
        
    }
    
    public static void transponerMatriz(){
        
        
        int nfilas=5,mcol=9;
        int matriz[][],matrizTranspuesta[][];
        
        
        matriz=new int[nfilas][mcol];
        
        
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < mcol; j++) {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para la posiscion fila "+ i + " col "+j));
            }
            
        }
        
        
        System.out.println("\n La matriz  es");
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < mcol; j++) {
                System.out.print("["+ matriz[i][j] +"] - ");  
            }
            System.out.println("");
        }
        //trasponer  matriz
        matrizTranspuesta= new int [mcol][nfilas];
        
        for (int i = 0; i < mcol; i++) {
            for (int j = 0; j < nfilas; j++) {
                matrizTranspuesta[i][j]=matriz[j][i];
            }
            
        }
        
        
        System.out.println("\n La matriz transpuesta es");
        for (int i = 0; i < mcol; i++) {
            for (int j = 0; j < nfilas; j++) {
                System.out.print("["+ matrizTranspuesta[i][j] +"] - ");  
            }
            System.out.println("");
        }
    }
    
    public static void matrizmarco(){
    
        int matriz[][]= new int [5][5];
        
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                if((i==0)|| (i==4)||(j==0)|| (j==4)){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                
                }
                
            }
            
        }
        
        System.out.println("\n La matriz marco  es");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("["+ matriz[i][j] +"]  ");  
            }
            System.out.println("");
        }
        
        
    
    }
}
