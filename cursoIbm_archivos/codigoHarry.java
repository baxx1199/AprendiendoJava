/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoIbm_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Encoder;

/**
 *
 * @author baxx
 */
public class codigoHarry {

    public static File cc = new File ("claveCodi.txt");
    
    public static void leer (){
        String c = "";
        if(cc.exists()){
            System.out.println("si");
            try {
                FileReader fr = new FileReader(cc);
                BufferedReader bfr = new BufferedReader(fr);
               
                while (c!=null) {                
                    String aux= bfr.readLine();
                    
                    if( aux != null){
                        c=aux;

                    }else{
                        break;
                    }
                      
                }   
                
                dec(c);
           
                
            } catch (IOException e) {
                System.err.println("error:"+e);
            } 
            
        }
        
        
    }
    public static void dec(String a){
         String decodedMsg ="";
         
         boolean con = false;
         int i =0;
         
         while (i<42 || con ==false){
             byte[] decoded = Base64.getDecoder().decode(a);
             
             for (int j = 0; j < decoded.length; j++) {
                 if(decoded[j]=='-'){
                     con=true;
                     break;
                 }
             }
             
             decodedMsg = new String(decoded);
             
             a=decodedMsg;
         }
                    
         System.out.println("Decoded Message "+decodedMsg);
    }
    public static void main(String[] args) throws UnsupportedEncodingException {
       
        leer();
        
       
    }
    
}
