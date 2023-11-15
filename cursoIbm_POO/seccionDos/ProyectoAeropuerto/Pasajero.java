/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO.seccionDos.ProyectoAeropuerto;

/**
 *
 * @author baxx
 */
public class Pasajero {
    private String nombre;
    private String apellido;
    private String pasaporte;
    private String nacionalidad;

    public Pasajero(String nombre, String apellido, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "=================="
                + "\nNombre:"+nombre + " "+ apellido
                +"\n No. pasaporte: "+pasaporte
                + "\n Nacionalidad: "+nacionalidad
                +"\n==================\n";
    }
    
    
    
}
