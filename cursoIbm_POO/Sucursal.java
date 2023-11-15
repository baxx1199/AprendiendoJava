/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;

public class Sucursal {
    
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String mostrarDatosSucursal(){
        String datos="================================ "
                + "\nSucursal No."+numeroSucursal
                +"\n ciudad:"+ciudad
                +"\ndireccion: "+direccion
                +"\n================================ ";
        return datos;
    }
    
    
    public double calcularPrecioEnvio(Paquete p){
    
           double precioEnvio= p.getPeso();
           int prioridad = p.getPrioridad();

           if(prioridad ==1){
               precioEnvio += 10;
           }else if(prioridad ==2){
               precioEnvio += 20;
           }
           
           return precioEnvio;
    }
    
    
    
    
}
