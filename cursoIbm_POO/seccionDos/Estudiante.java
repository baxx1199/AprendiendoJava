/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO.seccionDos;



/**
 *
 * @author baxx
 */
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private  float notaFinal;

    public Estudiante(String nombre, String apellido, int edad,int codigoEstudiante, float notaFinal ) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        
        System.out.println("========================= "
                + "\n Nombre: "+ getNombre()
                + "\n Apellido: "+getApellido()
                +"\nCodigo No."+codigoEstudiante
                + " \n Edad: "  +getEdad() 
                + "\n Definitiva: "+notaFinal 
                + "\n=========================" );
    
            }
    
}
