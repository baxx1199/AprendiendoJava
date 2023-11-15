/*


 */
package cursoIbm_POO.seccionDos.ProyectoAeropuerto;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Mainaero {
    
    static final int numMaxAeropuertos=4;
    static Aeropuerto aeropuertos[]= new Aeropuerto[numMaxAeropuertos];
    
    
    public static void main(String[] args) {
        
        llenarAeropuertos(aeropuertos);
        menu();
        
    }
    
    public static void menu(){
        
         Aeropuerto aeroBuscado;
         Compañia compañiaBuscada;
         
         String cdestino,cOrigen;
         
        int select =0;
        
        do {            
            select= Integer.parseInt(JOptionPane.showInputDialog("\n\tSeleccione la opcion deseada "
                    + "\n========== .: MENÚ :. ============"
                    + "\n 1. Consultar Aeropuertos "
                    + "\n2. Consultar patrocinadores o subvencion "
                    + "\n 3. Mostrar compañias "
                    + "\n 4. Mostrar Vuelos "
                    + "\n5. mostrar vuelos eligiendo ciudad origen y destino "
                    + "\n0. Salir"
                    + "\n==================================" ));
            
            
            
                    switch (select) {
                    
                    case 1:
                        
                        mostrarAeropuertos(aeropuertos);
                        break;
                    case 2:
                        mostrarPatrocinio(aeropuertos);
                        break;
                    case 3:
                        aeroBuscado = buscarAeropuerto(aeropuertos);
                        
                        if(aeroBuscado==null){
                            JOptionPane.showMessageDialog(null, "Lo sentimos, El aeropuerto indicado no existe o no fue encontrado");
                        }else{
                            mostrarCompañias(aeroBuscado);
                        }
                        
                        break;
                    case 4:
                        
                         aeroBuscado = buscarAeropuerto(aeropuertos);
                        
                        if(aeroBuscado==null){
                            JOptionPane.showMessageDialog(null, "Lo sentimos, El aeropuerto indicado no existe o no fue encontrado");
                        }else{
                            
                            compañiaBuscada=aeroBuscado.getCompañia(JOptionPane.showInputDialog("Ingrese el nombre de la compañia que desea consultar"));
                           if( compañiaBuscada==null){
                               JOptionPane.showMessageDialog(null, "Lo sentimos, La compañia indicado no existe o no fue encontrada");
                           }else{
                               mostrarVuelos(compañiaBuscada);
                           }
                        }
                        
                        break;
                    case 5:
                        
                        cOrigen= JOptionPane.showInputDialog("ingrese la ciudad origen del vuelo");
                        cdestino= JOptionPane.showInputDialog("ingrese la ciudad destino del vuelo");
                        
                        vuelosEspecificos(cOrigen, cdestino, aeropuertos);
                        
                        break;
                    default:
                        throw new AssertionError();
                }
        } while (select !=0);
        
        
    }
    
    public static void mostrarAeropuertos(Aeropuerto aeropuertos[]){
    String temp ="";
        for (int i = 0; i < aeropuertos.length; i++) {
            
            if(aeropuertos[i] instanceof AeropuertoPrivado){
               
                System.out.println(aeropuertos[i].toString());
            }else{
                temp += aeropuertos[i].toString();
            }
            
        }
        System.out.println(temp);
    }
    
    public static void llenarAeropuertos(Aeropuerto aeropuertoList[]){
        
        //Pasajeros
        
        Pasajero pasajero1 = new Pasajero("Julian", "Cobos", "99031105966", "Colombia");
        Pasajero pasajero2 = new Pasajero("Laura", "Chirinos", "1073526941", "Venezuela");
        Pasajero pasajero3 = new Pasajero("Sergio", "Cobos", "10109863", "Argentina");
        Pasajero pasajero4 = new Pasajero("Hugh", "Jackman", "logan123", "Canada");
        Pasajero pasajero5 = new Pasajero("Joshua", "Bautista", "1111", "Colombia");
        Pasajero pasajero6 = new Pasajero("Estefania", "Pineda", "2222", "Venezuela");
        Pasajero pasajero7 = new Pasajero("Thor", "Odinson", "trueno", "Asgard");
        Pasajero pasajero8 = new Pasajero("Harry", "Potter", "leviosa", "Inglaterra");
        Pasajero pasajero9 = new Pasajero("Morty", "Smith", "malvado", "Estados Unidos");
        Pasajero pasajero10 = new Pasajero("Ash", "Ketchum", "pika", "Japon");
        Pasajero pasajero11 = new Pasajero("Rick", "Sanchez", "szechuan", "Prime");
        Pasajero pasajero12 = new Pasajero("Lionel", "Messi", "barcelona", "Argentina");
        
        
        Pasajero listaP1[] =new Pasajero[5];
        Pasajero listaP2[] =new Pasajero[4];
        Pasajero listaP3[] =new Pasajero[3];
        Pasajero listaP4[] =new Pasajero[6];
     //lista 1
        listaP1[0]= pasajero2;
        listaP1[1]=pasajero1;
        listaP1[2]= pasajero6;
        listaP1[3]=pasajero12;
        
        
       //lista 2
       listaP2[0]= pasajero7;
        listaP2[1]=pasajero3;
        listaP2[2]= pasajero9;
        listaP2[3]=pasajero10;
       
       //lista 3
        listaP3[0]= pasajero6;
        listaP3[1]=pasajero5;
        listaP3[2]= pasajero4;
      
       
       //lista 4
       
        listaP4[0]= pasajero10;
        listaP4[1]= pasajero11;
        listaP4[2]= pasajero8;
        listaP4[3]=pasajero2;
        listaP4[4]=pasajero6;
        listaP4[5]=pasajero1;
        
   //Vuelos
        
        //vuelos bogota
        
        Vuelo vuelo1 = new Vuelo("BM120","Bogota", "Munich", 500.120, listaP1);
            
            
        
        Vuelo vuelo2 = new Vuelo("BL121","Bogota", "Londres", 40.120, listaP2);
        Vuelo vuelo3 = new Vuelo("BB122", "Bogota", "Buenos Aires", 230.111, listaP3);
        
        
        Vuelo vuelo13 = new Vuelo("BME99","Bogota", "Munich", 750.120, 4);//aggregar manual
        
        //Vuelos londres
        
        Vuelo vuelo4 = new Vuelo("LM10","Londres", "Munich", 100.120, 10);//agregar manual
        Vuelo vuelo5 = new Vuelo("LB11", "Londres", "Buenos Aires", 23.121, listaP4);
        Vuelo vuelo6 = new Vuelo("LB12", "Londres", "Bogota", 98.000, listaP4);
        Vuelo vuelo14 = new Vuelo("JJ11", "Londres", "Buenos Aires", 235.000, listaP3);
        
        
        
        //vuelos Buenos Aires
        Vuelo vuelo7 = new Vuelo("BM001","Buenos Aires", "Munich", 121.120, listaP4);
        Vuelo vuelo8 = new Vuelo("BB002", "Buenos Aires", "Buenos Aires", 111.111, listaP3);
        Vuelo vuelo9 = new Vuelo("BL003","Buenos Aires", "Londres", 36.120, listaP3);
        
        //Vuelos Munich
        
        Vuelo vuelo10 = new Vuelo("MB950", "Munich", "Buenos Aires", 47.111, 2);//agregar Manual
        Vuelo vuelo11 = new Vuelo("ML951","Munich", "Londres", 96.120, listaP1);
        Vuelo vuelo12 = new Vuelo("MB952", "Munich", "Bogota",85.111, listaP4);
        
                    //Listados de vuelos

                    Vuelo listVuelo1 [] =new Vuelo[2];
                   Vuelo listVuelo2 [] =new Vuelo[3];
                   Vuelo listVuelo3 [] =new Vuelo[4];
                   Vuelo listVuelo4 [] =new Vuelo[3];
        
        
                 //Lenar listas vuelos
                 
                 //listaVuelo1
                    listVuelo1[0]= vuelo1;
                    listVuelo1[1]= vuelo2;
                    
                  //listaVuelo2
                    listVuelo2[0]= vuelo7;
                    listVuelo2[1]= vuelo8;
                    listVuelo2[2]= vuelo9;
                    
                  //listaVuelo3
                    listVuelo3[0]= vuelo4;
                    listVuelo3[1]= vuelo5;
                    listVuelo3[2]= vuelo6;
                    listVuelo3[3]= vuelo14;
                  
                  //listaVuelo4
                    
                  listVuelo4[0]= vuelo10;
                    listVuelo4[1]= vuelo11;
                    listVuelo4[2]= vuelo12;
       
       
       
        //Compañias Aerolineas
        
        //compañias Colombianas
        Compañia aerolinea1 = new Compañia("Latam",listVuelo1);
        
        
        Compañia aerolinea2 = new Compañia("Avianca");
        
                aerolinea2.insertarVuelo(vuelo3);
                aerolinea2.insertarVuelo(vuelo13);
        
                aerolinea2.getVuelo("BME99").insertarPasajero(pasajero9);
                aerolinea2.getVuelo("BME99").insertarPasajero(pasajero2);
                aerolinea2.getVuelo("BME99").insertarPasajero(pasajero11);
                aerolinea2.getVuelo("BME99").insertarPasajero(pasajero8);
       
        
        
        Compañia aerolineasColombinas[]= { aerolinea1,aerolinea2};
        
        
        //compañias Alemanas
        Compañia aerolinea3 = new Compañia("Munich AirLine",listVuelo4);
        
        aerolinea3.getVuelo("MB950").insertarPasajero(pasajero12);
        aerolinea3.getVuelo("MB950").insertarPasajero(pasajero1);
       
        //Compañias Argentinas
        Compañia aerolinea5 = new Compañia("Airmatte",listVuelo2);
        
        
        
        //Compañias Inglesas
        Compañia aerolinea6 = new Compañia("flyLine",listVuelo3);
        
                aerolinea6.getVuelo(0).insertarPasajero(pasajero9);
                aerolinea6.getVuelo(0).insertarPasajero(pasajero1);
                aerolinea6.getVuelo(0).insertarPasajero(pasajero4);
                aerolinea6.getVuelo(0).insertarPasajero(pasajero8);
        
                aerolinea6.getVuelo("LM10").insertarPasajero(pasajero12);
                aerolinea6.getVuelo("LM10").insertarPasajero(pasajero6);

        
        
         Compañia aerolinea4 = new Compañia("Londres Go");
                aerolinea4.insertarVuelo(vuelo5);
                aerolinea4.insertarVuelo(vuelo14);
         
         
        
        Compañia aerolineasInglesas []={aerolinea4,aerolinea6};
        
        
        
        //creando aeropuertos privados
        String empresasPatrocinio1 []={"Juan Valdes","Adidas","Arturo Calle"};
        AeropuertoPrivado privado1 = new AeropuertoPrivado("El dorado", "Bogota", "Colombia",aerolineasColombinas,empresasPatrocinio1);
        
        
        
         String empresasPatrocinio []={"Nike","Volswagen","Bayern","Jagger"};
        
        AeropuertoPrivado privado2 = new AeropuertoPrivado("Heathrow", "Londres", "Inglaterra",aerolineasInglesas,empresasPatrocinio);
        
        
       
        
  
        
        
        
        //creando aeropuertos publicos
        
        
        AeropuertoPublico publico1 = new AeropuertoPublico(8000.000,"Munich Airport", "Munich", "Alemania");
        AeropuertoPublico publico2 = new AeropuertoPublico(1500.3611,"Ministro Pistarini", "Buenos Aires", "Argentina");
        
        
        
        publico1.insertarCompañia(aerolinea3);
        publico2.insertarCompañia(aerolinea5);
        
        
        
         //llenar arreglo 
       aeropuertoList[0]=privado1;
       aeropuertoList[1]=publico1;
       aeropuertoList[2]=privado2;
       aeropuertoList[3]=publico2;
       
    }
    
    
    public static void mostrarPatrocinio( Aeropuerto aeropuertos[]){
    
        for (int i = 0; i < aeropuertos.length; i++) {
            System.out.println(" \n--------------\n");
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto: "+aeropuertos[i].getNombre()+"\n Financiado por: \n");
                 ((AeropuertoPrivado) aeropuertos[i]).mostrarEmpresas();
            }else{
                System.out.println("Aeropuerto: "+aeropuertos[i].getNombre()+"\n Subvencion: $"+((AeropuertoPublico) aeropuertos[i]).getSubvencion()+" Millones");
            }
        }
    
    }
    
    public static Aeropuerto buscarAeropuerto(Aeropuerto aeros[]){
    
        Aeropuerto aeropuertoBuscado=null;
        
        String nombreAeropuerto = JOptionPane.showInputDialog("Ingrese el nombre del aeropuerto buscado");
        boolean encontrado =false;
        int i =0;
        
        do {            
            if(nombreAeropuerto.equalsIgnoreCase(aeros[i].getNombre())){
                
                aeropuertoBuscado=aeros[i];
                encontrado=true;
                
            
            }else{
                i++;
            }
            
        } while ((!encontrado)&&(i<aeros.length));
        
        
        
        
        return aeropuertoBuscado;
    
    }
    
    public static void mostrarCompañias(Aeropuerto aero){
        
        Compañia comp []= aero.getListaCommpañias();
        
        System.out.println(aero.toString() + "\n Compañias Disponibles: \n");
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i].toString());
        }
    
    }
   
    
    public static void mostrarVuelos(Compañia compañia){
        System.out.println(compañia.toString()+" \n Vuelos disponibles: \n");
        for (int i = 0; i < compañia.getNumVuelos(); i++) {
            System.out.println(" \t "+compañia.getVuelo(i));
        }
        
    
    }
    
    
    public static void vuelosEspecificos(String o, String d, Aeropuerto aeros[]){
        
        Compañia comps[];
        
        for (int i = 0; i < aeros.length; i++) {
            comps = aeros[i].getListaCommpañias();
            
            for (int j = 0; j < aeros[i].getNumCompañias(); j++) {
                if(comps[j]==null){
                    
                    break;
                }else{
                    
                    for (int k = 0; k < comps[j].getNumVuelos(); k++) {
                        
                        
                        
                        if(o.equalsIgnoreCase(comps[j].getVuelo(k).getCiudadOrigen()) && (d.equalsIgnoreCase(comps[j].getVuelo(k).getCiudadDestino()))){
                            System.out.println(comps[j].getVuelo(k).toString());
                        }
                        
                    }
                }
                
                
            }
        }
        
        
        
    
    }
    
}
