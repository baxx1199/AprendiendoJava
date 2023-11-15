/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;

/**
 *
 * @author baxx
 */
public class Atleta {
    private int numeroParticipante;
    private String nombre;
    private float tiempo;

    public Atleta(int numeroParticipante, String nombre, float tiempo) {
        this.numeroParticipante = numeroParticipante;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }
    
   public String mostrarDatos(){
       String datos = "participante "+ nombre+ "  "+ numeroParticipante+ " "+ tiempo+" minutos";
       
       
       return datos;
           
   
   } 
    
    
}
