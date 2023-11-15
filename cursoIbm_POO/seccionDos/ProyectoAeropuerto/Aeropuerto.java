
package cursoIbm_POO.seccionDos.ProyectoAeropuerto;

import javax.swing.JOptionPane;


public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia listaCommpañias[]= new Compañia[10];
    private int numCompañias;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañias =0;
    }
    
    public Aeropuerto(String nombre, String ciudad, String pais, Compañia compañias[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.listaCommpañias = compañias;
        this.numCompañias = listaCommpañias.length;
    }
    
    
    public void insertarCompañia(Compañia nuevaCompañia){
        
        listaCommpañias[numCompañias]= nuevaCompañia;
        //JOptionPane.showMessageDialog(null, "Compañia agregada con exito");
        numCompañias++;
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    
    
    public String getPais() {
        return pais;
    }

    public int getNumCompañias() {
        return numCompañias;
    }

    public Compañia[] getListaCommpañias() {
        return listaCommpañias;
    }
    
    public Compañia getCompañia(int i){
        Compañia compañiaBuscada = null;
        if(i >= 0 && i < listaCommpañias.length){
            compañiaBuscada= listaCommpañias[i];
        }else{
        
            JOptionPane.showMessageDialog(null, "La compañia indicada no existe");
        }
        
        return compañiaBuscada;
    
    }
    public Compañia getCompañia(String nombreCompañia ){
        
        Compañia compañiaBuscada = null;
        int i =0;
        boolean encontrada = false;
            do {            
            
                
                if (nombreCompañia.equalsIgnoreCase(listaCommpañias[i].getNombre())) {
                    compañiaBuscada= listaCommpañias[i];
                    encontrada= true;
                } else {
                    
                    i++;
                }
        } while (encontrada==false && i <listaCommpañias.length);
        
        return compañiaBuscada;
    
    }

    @Override
    public String toString() {
        return " \nAeropuerto "+nombre +"\nPais: "+pais+"\nCiudad: "+ciudad;
    }
    
    
    
    
}
