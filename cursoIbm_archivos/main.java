/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoIbm_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author baxx
 */
public class main {

    File archivo, directorio= new File("CarpetaPrueba");
    
    private void crearArchivo(){
        archivo = new File(directorio.getAbsoluteFile()+"\\prueba1.tx");
        
        if (archivo.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo si existe");
        } else{
            JOptionPane.showMessageDialog(null,"Archivo NO encontrado");
            
            
           try {
               
               if ( archivo.createNewFile()) {
                   JOptionPane.showMessageDialog(null,"Creando archivo ");
                    JOptionPane.showMessageDialog(null,"Archivo creado en: "+ archivo.getAbsolutePath());
               }
              
               
           } catch (IOException ex) {
               Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
               crearDirectorio();
               crearArchivo();
           }
            
        }
    
    }
    private void crearDirectorio(){
    
        
        
        
        if (directorio.exists()) {
            JOptionPane.showMessageDialog(null, "la carpeta si existe");
            
        }else{
            JOptionPane.showMessageDialog(null,"la carpeta NO existe");
       
               if ( directorio.mkdir()) {
                   JOptionPane.showMessageDialog(null,"Creando archivo ");
                    JOptionPane.showMessageDialog(null,"Archivo creado en: "+ directorio.getAbsolutePath());
               }
            
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
//        main m = new main();
//        
//        
//        m.crearArchivo();
       
       
       File archivop = new File("pruebaLectura");
        
        
        
       if(archivop.exists()){
          leer(archivop);
           escribir(archivop);
           
           System.out.println("============\n");
           leer(archivop);
           
       }else{
           
           try {
               if (archivop.createNewFile()) {
                   System.out.println("ArchivoCreado con exito");
                   
                   escribir(archivop);
                   leer(archivop);
               }
           } catch (IOException ex) {
               Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       
    }
    
    
    public static void leer(File a){
        
        String cadena = "";
        
        try {
            FileReader fr = new FileReader(a);
            BufferedReader bfr = new BufferedReader(fr);
            
            while (cadena!=null) {                
                cadena= bfr.readLine();
                if (cadena != null) {
                    System.out.println(cadena);
                }
                
            }   
            
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }
    
    public static void escribir(File a){
    
        
        try {
            FileWriter fw = new FileWriter(a,true);
            
            fw.write("\r\nEsta es una prueba de la escritura de archivos");
            fw.write("\r\nLa prueba esta saliendo bien");
            fw.write("\r\nNo se que mas escribir asi que lo dejaremos asi");
            fw.write("\r\nterminando prueba");
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }
}
