/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_archivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baxx
 */
public class Archivo {
    File archivo ;
    
    public void crearArchivo(){
       archivo = new File("contactos.txt");
    
         if (archivo.exists()==false) {
            try {
                if (archivo.createNewFile()) {
                    
                }
            } catch (IOException ex) {
                System.err.println("Error: "+ ex);
            }
        } else {
            System.out.println("Fichero existente");
            
            
        }
    }
    
    public void ingresarDatos(Contacto persona){
        try {
            FileWriter fw = new FileWriter(archivo,true);
            
            fw.write(persona.getNombre()+"%"+persona.getCelular()+"%"+persona.getCorreo()+"\r\n");
            
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    
    }
    
    
    public void leerdatos(){
        String cadena ="";
        FileReader fr;
        try {
            fr = new FileReader(archivo);
            BufferedReader bfr = new BufferedReader(fr);
            
            while (cadena !=null) {                
                cadena = bfr.readLine();
                System.out.println(cadena);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    
    }
    
    
}
