/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO.seccionDos.ProyectoAeropuerto;

import javax.swing.JOptionPane;


public class Compañia {
    private String nombre;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelos =0;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }

     public Compañia(String nombre, Vuelo vuelos[]) {
        this.nombre = nombre;
        this.listaVuelos = vuelos;
        this.numVuelos = listaVuelos.length;
    }
    
     
     public void insertarVuelo(Vuelo nuevoVuelo){
     
         listaVuelos[numVuelos]= nuevoVuelo;
         
         numVuelos++;
         
         //JOptionPane.showMessageDialog(null, "vuelo registrado con exito \n"+ nuevoVuelo.getIdentificador()+ " \n "+ nuevoVuelo.getCiudadOrigen()+" - "+nuevoVuelo.getCiudadDestino());
     }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelos() {
        return numVuelos;
    }
    
    public Vuelo getVuelo(int index){
        Vuelo vueloBuscado=null;
        if(index >=0 && index < listaVuelos.length){
            vueloBuscado = listaVuelos[index];
        
        }else{
            JOptionPane.showMessageDialog(null, "Lo sentimos, el vuelo indicado no existe");
        }
        
        return vueloBuscado;
    }
     
    public Vuelo getVuelo(String identificador){
        Vuelo vueloBuscado=null;
        boolean encontrado = false;
        int i =0;
        
        
        
        do {            
            if(identificador.equals(listaVuelos[i].getIdentificador())){
                vueloBuscado=listaVuelos[i];
                encontrado=true;
                
            }else{
                i++;
            }
        } while (encontrado==false && i<listaVuelos.length);
        
        if(encontrado ==false){
            JOptionPane.showMessageDialog(null, "Lo sentimos, el vuelo indicado no existe");
        }
        
        return vueloBuscado;
    }

    @Override
    public String toString() {
        return "\n ---->  Nombre : "+nombre + " \nNo vuelos disponibles: "+ numVuelos +"\n";
    }
    
    
}
