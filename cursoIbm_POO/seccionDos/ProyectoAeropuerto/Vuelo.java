
package cursoIbm_POO.seccionDos.ProyectoAeropuerto;


import javax.swing.JOptionPane;


public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int pasajerosActuales;
   
    private Pasajero listadoPasajeros [];

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.pasajerosActuales =0;
        this.listadoPasajeros= new Pasajero[numMaxPasajeros];
      
    }
    
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, Pasajero listado []) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = listado.length;
        this.pasajerosActuales =listado.length;
        this.listadoPasajeros= listado;
      
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }
    
    public void insertarPasajero(Pasajero p){
        
        if(pasajerosActuales< numMaxPasajeros){
             listadoPasajeros[getPasajerosActuales()]=p;
            pasajerosActuales++;
            
            //JOptionPane.showMessageDialog(null, "Su reserva fue exitosa"+p.toString());
            
        }else{
                JOptionPane.showMessageDialog(null, "Lo sentimos, No hay ascientos disponibles en este vuelo");
            
        }
    
    
    }
    public Pasajero  getPasajero(int lugar){
         
        return listadoPasajeros[lugar];
        
    }
    
    
    public Pasajero getPasajero(String pasaporte){
        Pasajero pasajeroBuscado =null;
        int i =0;
        boolean encontrado = false;
         
        
        do {            
            if(pasaporte.equals(listadoPasajeros[i].getPasaporte())){
                pasajeroBuscado=listadoPasajeros[i];
                encontrado= true;
            }else{
                i++;
            }
        } while (encontrado == false && i < listadoPasajeros.length);
       
        return pasajeroBuscado;
    }

    @Override
    public String toString() {
        return "=============================== \n Vuelo: " + identificador 
                + "\n Desde: "+ ciudadOrigen+ " Con destino: "+ciudadDestino + " \nPrecio del vuelo: $"+precio + "\n===============================";
    }
    
    
}
