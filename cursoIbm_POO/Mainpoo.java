/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoIbm_POO;

import javax.swing.JOptionPane;

/**
 *
 * @author baxx
 */
public class Mainpoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // La programacion Orientada a objetos es un paradigma de programacion, la cual busca crear codigo, sencillo de entender, reutilizable y seguro,
        //siguiento el principio DRY(don't repeat yourself). 
        //La POO tiene sus bases en las clases y objetos, siendo las clases una plantilla y los objetos la implementacion de dicha plantilla
        // Una clase agrupa todas las caracteristicas que comparten dichos objetos, asi como sus metodos
        // un objeto instancia la clase y contiene sus caracteristicas propias.
        
        //Las ventajas de la POO son un codigo sencillo, escalable y limpio, codigo seguro con el cual se busca aislar o encapsular el codigo o datos, evitando asi 
        // la mutacion indeseada de datos o el acceso codigo propietario.
        
        
//        Operacion op1 = new Operacion();
//        
////        op1.leerNumeros();
//        
//        op1.obtenerSuma(5,6);
//        op1.obtenerMod(3, 2);
           envioDePaquetes();
    
    }
    public static void crearCuadrilatero(){
        Cuadrilatero cuadro1 ;
        float l1, l2;
        
        l1= Float.parseFloat(JOptionPane.showInputDialog("ingrese la medida del lado 1 en cm"));
        l2= Float.parseFloat(JOptionPane.showInputDialog("ingrese la medida del lado 2  en cm"));
        
        if(l1==l2){
        
            cuadro1=new Cuadrilatero(l1);
        }else{
            cuadro1=new Cuadrilatero(l1,l2);
        }
        
        
        float area1=cuadro1.getArea();
        float perimetro1 = cuadro1.getPerimetro();
        
        System.out.println("El area es "+ area1+ "cm2" );
         System.out.println("El perimetro es "+ perimetro1+ "cm" );
    }
    
    public static void moverFicha(){
        Tablero tablero1;
    int x =Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor incial de X"));
    int y =Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor incial de Y"));
    int movimiento;
    tablero1=new Tablero(x, y);
    char eleccion = 's';
    
    
    JOptionPane.showMessageDialog(null, "La posicion de la ficha es "+ tablero1.getPosX()+" , "  +tablero1.getPosY());
        do {            
           eleccion=  JOptionPane.showInputDialog( "¿que desea hacer? "
                    + "\n\t 't' : mover ficha Arriba "
                    + "\n\t 'd' : mover ficha Abajo "
                    + "\n\t 'l' : mover ficha Izquierda "
                    + "\n\t 'r' : mover ficha Derecha "
                    + "\n\t 's' : salir").charAt(0);
            
            
           if(eleccion =='t'||eleccion =='d'||eleccion =='l'||eleccion =='r'){
               
               movimiento =Integer.parseInt(JOptionPane.showInputDialog("cuantas posiciones desea mover"));
               
               switch (eleccion) {
                case 't':

                    tablero1.moverArriba(movimiento);
                    break;
                case 'd':
                    
                    tablero1.moverAbajo(movimiento);
                    break;
                case 'l':
                    
                    tablero1.moverIzquierda(movimiento);
                    break;
                    
                case 'r':
                    
                    tablero1.moverDerecha(movimiento);
                    break;
  
            }
               JOptionPane.showMessageDialog(null, "La posicion de la ficha (x,y) es ("+ tablero1.getPosX()+" , "  +tablero1.getPosY()+")");
           }
           
            
            
            
        } while (eleccion != 's');
         
         JOptionPane.showMessageDialog(null, "La posicion final de la ficha (x,y) es ("+ tablero1.getPosX()+" , "  +tablero1.getPosY()+")");
    }
    public static void calcularPrecio(){
            
        String marca, modelo;
        float precio,menor=0;
        
        int numeroCoches=Integer.parseInt(JOptionPane.showInputDialog("¿cuantos coches desea ingresar?")),pos=0;
        
        Coche coches[]=new Coche[numeroCoches];
    
        
        for (int i = 0; i < numeroCoches; i++) {
            marca =JOptionPane.showInputDialog("ingrese la marca del vehiculo");
            modelo =JOptionPane.showInputDialog("ingrese el modelo del vehiculo");
            
            precio= Float.parseFloat(JOptionPane.showInputDialog("ingrese el precio del vehiculo"+i));
            
            
            
            coches[i]=new Coche(marca, modelo, precio);
        }
        
        
        for (int i = 0; i < coches.length; i++) {
            coches[i].mostrarDatos();
            
        }
        
        
        for (int i = 0; i < coches.length; i++) {
                if(i==0){
                    menor = coches[i].getPrecio();
                }else{
                        
                    if(coches[i].getPrecio()<menor){
                        menor=coches[i].getPrecio();
                        pos=i;
                    }
                
                }
        }
        
        JOptionPane.showMessageDialog(null, " el coche mas economico es...");
         coches[pos].mostrarDatos();
        
    }
    
    public static void carrera(){
        
        
        int numeroCorredores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de corredores")), numParticipante, pos=0;
        String nombre;
        float tiempo,tiempoMenor=0;
        
        Atleta corredores [] = new Atleta[numeroCorredores];
        
        
        for (int i = 0; i < corredores.length; i++) {
            
            numParticipante = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del corredor"+i));
            nombre = JOptionPane.showInputDialog("ingrese el nombre del correrdor"+i);
           tiempo =Float.parseFloat((JOptionPane.showInputDialog("ingrese el numero del corredor"+i)));
           
           
           corredores[i]=new Atleta(numParticipante, nombre, tiempo);
        }
    
        
        for (int i = 0; i < corredores.length; i++) {
            if(i==0){
                    tiempoMenor = corredores[i].getTiempo();
                }else{
                        
                    if(corredores[i].getTiempo()<tiempoMenor){
                        tiempoMenor=corredores[i].getTiempo();
                        pos=i;
                    }
                
                }
            System.out.println(corredores[i].mostrarDatos()+"\n");
        }
        
        
        
        JOptionPane.showMessageDialog(null, "el ganador es :"+corredores[pos].mostrarDatos());
        
    }
    
    public static void triangulosIsoceles(){
    
        
        int numTriangulo = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos trianulos desea agregar?")), pos=0;
        double ladoIn,baseIn,mayor;
        Triangulo triangulos[]=new Triangulo[numTriangulo];
        
        for (int i = 0; i < triangulos.length; i++) {
                ladoIn=  Double.parseDouble(JOptionPane.showInputDialog("ingrese la medida del lado del triangulo"));
                baseIn=  Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de la base"));
                triangulos[i]= new Triangulo(ladoIn, baseIn);
                
               System.out.println(i+"."+ triangulos[i].mostrarDatos());
               System.out.println("");
        }
        mayor =  triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
                
                if(triangulos[i].obtenerArea()> mayor){
                    mayor = triangulos[i].obtenerArea();
                    pos=i;
                }
               
        }
        
        
        JOptionPane.showMessageDialog(null, "El triangulo con la mayor area es el No."+pos + "\n"+triangulos[pos].mostrarDatos());
        
    }
    
    public static void numerosComplejos(){
        int select =0;
        double pReal ,pImg ;
        Complejo numeroComp , numC,res;
        
        do {        
            select= Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion "
                    + "\n1. sumar "
                    + "\n2. multiplicar por un complejo "
                    + "\n3.comparar "
                    + "\n4. Multiplicar por un entero "
                    + "\n0. Salir"));
            
            if(select!=0){
                JOptionPane.showMessageDialog(null,"ingrese el primer numero complejo");
                        pReal = Double.parseDouble(JOptionPane.showInputDialog("ingrese la parte real"));
                         pImg = Double.parseDouble(JOptionPane.showInputDialog("ingrese la parte Imaginaria"));
                         numeroComp = new Complejo(pReal, pImg);
                         
                         System.out.println("Primer numero Complejo "+ numeroComp.getReal() + " "+ numeroComp.getImaginaria()+"i");
                        
                switch (select) {
                    case 1:
                        JOptionPane.showMessageDialog(null,"ingrese el Segundo numero complejo");
                         pReal = Double.parseDouble(JOptionPane.showInputDialog("ingrese la parte real"));
                         pImg = Double.parseDouble(JOptionPane.showInputDialog("ingrese la parte Imaginaria"));
                         
                        numC=new Complejo(pReal, pImg);
                        
                        System.out.println("segundo numero Complejo "+ numC.getReal() + " "+ numC.getImaginaria()+"i");
                            res = numeroComp.sumar(numC);
                         JOptionPane.showMessageDialog(null, "La suma de los numeros complejos es "+ res.getReal() +" "+ res.getImaginaria()+"i"); 
                        break;
                    case 2:
                    JOptionPane.showMessageDialog(null,"ingrese el Segundo numero complejo");
                         pReal = Double.parseDouble(JOptionPane.showInputDialog("ingrese la parte real"));
                         pImg = Double.parseDouble(JOptionPane.showInputDialog("ingrese la parte Imaginaria"));
                        numC=new Complejo(pReal, pImg);
                       System.out.println("segundo numero Complejo "+ numC.getReal() + " "+ numC.getImaginaria()+"i");
                            res = numeroComp.multiplcar(numC);
                         JOptionPane.showMessageDialog(null, "El producto de los numeros complejos es "+ res.getReal() +" "+ res.getImaginaria()+"i"); 
                        break;
                    case 3:

                        JOptionPane.showMessageDialog(null,"ingrese el Segundo numero complejo");
                         pReal = Double.parseDouble(JOptionPane.showInputDialog("ingrese la parte real"));
                         pImg = Double.parseDouble(JOptionPane.showInputDialog("ingrese la parte Imaginaria"));
                        numC=new Complejo(pReal, pImg);
                        System.out.println("segundo numero Complejo "+ numC.getReal() + " "+ numC.getImaginaria()+"i");
                        if(numeroComp.comparar(numC)) {
                        
                            JOptionPane.showMessageDialog(null, "Los numeros Complejos son iguales");
                        }else{
                            JOptionPane.showMessageDialog(null, "Los numeros Complejos son Diferentes");
                        };
                        break;
                    case 4:
                        int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
                        res = numeroComp.multiplicar(num);
                        
                        JOptionPane.showMessageDialog(null, "El producto de la multiplicacion es "+ res.getReal() +" "+ res.getImaginaria()+"i"); 
                        
                        break;

                }
            }
            
            
            
        } while (select!=0);
    
    }
    
    
    public static void banco(){
        
        
         String nombre, apellido, dni;
         
          JOptionPane.showMessageDialog(null, "ingrese los datos del cliente");
          
        nombre = JOptionPane.showInputDialog("Ingrese El nombre del cliente");
        apellido=JOptionPane.showInputDialog("Ingrese El apellido del cliente");
        dni= JOptionPane.showInputDialog("Ingrese El dni del cliente");
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas cuentas desea ingresar?")),select=0;
        Cuenta cuentas[]= new Cuenta[n];
        double movimiento=0;
        
        for (int i = 0; i < cuentas.length; i++) {
                int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta"));
                double saldoCuenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo de cuenta"));
                
                cuentas[i]=new Cuenta(numeroCuenta, saldoCuenta);
        }
        
       
        
       
        
        
        
        Cliente clientes= new Cliente(nombre, apellido, dni, cuentas);
        
          
        for (int i = 0; i < cuentas.length; i++) {
            
            System.out.println(clientes.cuentas[i].imprimirDatos());
          
            
        }
        
        
        do {            
           select= Integer.parseInt(JOptionPane.showInputDialog("Indique que accon desea realizar \n1. Depositar \n2. Retirar  \n3. Consultar saldo \n0. Salir"));
           
           
           
            switch (select) {
                case 1:
                     n = buscarIndice(cuentas);
                     
                     if(n== -1){
                         JOptionPane.showMessageDialog(null, "Lo sentimos el numero de cuenta no pudo ser encontrado");
                     } else{
                         movimiento= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la cuenta"));
                         
                         if(movimiento <=0 ){
                             JOptionPane.showMessageDialog(null, "El monto ingresado no es valido");
                         }else{
                               clientes.ingresar_Dinero(n, movimiento);

                         }
                    }
                        
                        
                        
                    break;
                    
                    case 2:
                        
                        n = buscarIndice(cuentas);
                     
                            if(n== -1){
                                JOptionPane.showMessageDialog(null, "Lo sentimos el numero de cuenta no pudo ser encontrado");
                            } else{
                                movimiento= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la cuenta"));
                                
                                if(movimiento > clientes.cuentas[n].getSaldo()){
                                    
                                    JOptionPane.showMessageDialog(null, "Fondos insuficientes");
                                }else{
                                     clientes.retirar_Dinero(n, movimiento);
                                }
                                
                               
                            }
                        
                    break;
                    case 3:
                        
                        n = buscarIndice(cuentas);
                     
                            if(n== -1){
                                JOptionPane.showMessageDialog(null, "Lo sentimos el numero de cuenta no pudo ser encontrado");
                            } else{
                                clientes.consultarSaldo(n);
                            }
                        
                    break;
                
            }
           
        } while (select!=0);
        
    
        
        clientes.estadoDeCuenta();
    }
    
    public static int buscarIndice(Cuenta cuentas [ ]){
        int i =0, n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la cuenta"));
        
        boolean encontrada=false;
        
        do {                 
            if(n==cuentas[i].getNumeroCuenta()){
                encontrada=true;
                break;
            }
            i++;
        } while (encontrada==false&& i<cuentas.length);
        
        if(encontrada ==false){ 
            return -1;
                    
        } else{
            return i;
        }
        
    }
   
    
   public static int buscarSucursal(Sucursal s[],int numero, int limite){
   
       boolean encontrado=false;
       int posicion =0;
       
       while(posicion < limite&& encontrado ==false){
           
           if(s[posicion].getNumeroSucursal() == numero){
           
               encontrado=true;
           }
           posicion++;
       } 
       
       
       if(encontrado == true){
            return posicion-1;
        }else{
       
           return -1;
       }
       
   }
    
   
    
    public static int buscarNumPaquete(Paquete paq[], int paqueteBuscar, int cont){
        
           boolean encontrado =false;
           int i=0;
           
           do {            
            if(paq[i].getNumeroPaquete()== paqueteBuscar){
                encontrado=true;
                
            }
            i++;
        } while (encontrado==false && i<cont);
            
           if(encontrado==true){
               
                return i-1;
           }else{
           
                return -1;
                   
            }
    }
    
    
    public static void envioDePaquetes(){
    
        int numeroPaquete,prioridad, numeroSucursal , contSucursal=0, contPaquete=0;
        String dni, direccionS,ciudadS;
        double peso;
         int iterator;
        Paquete paquetes[]=new Paquete[100];
        Sucursal sucursales[]= new Sucursal[50];
        
        int select =0;
        
        
        do {            
            select=Integer.parseInt(JOptionPane.showInputDialog("\t\tMenu: "
                    + "\n1.crear Sucursal "
                    + "\n2.Enviar paquete "
                    + "\n3. Consultar sucursal "
                    + "\n4. Consultar paquete"
                    + "\n5.mostrar Scucursales"
                    + "\n6. mostrar paquetes"
                    + "\n0.salir \n"
                    + "\n\tIngrese una opcion"));
            
            switch (select) {
                case 1:
                    
                         JOptionPane.showMessageDialog(null, "Creando sucursal\nIngrese los datos de la sucursal");
                         numeroSucursal=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la sucursal"));
                         direccionS= JOptionPane.showInputDialog("ingrese la direccion de la sucursal");
                         ciudadS = JOptionPane.showInputDialog("Ingrese la ciudad");
                         
                         
                         if(contSucursal==0){
                             sucursales[contSucursal]=new Sucursal(numeroSucursal, direccionS, ciudadS);
                           
                            contSucursal++;
                         
                         }else{
                             
                             if(buscarSucursal(sucursales, numeroSucursal, contSucursal)==-1){
                                 sucursales[contSucursal]=new Sucursal(numeroSucursal, direccionS, ciudadS);
                           
                                    contSucursal++;
                             }else{
                                    JOptionPane.showMessageDialog(null, "Lo sentimos, la sucursal identificada con el numero" + numeroSucursal+ " ya se ecnuentra registrada");
                             }
                        
                         }
                         
                         
                         
                    break;
                   
                    
            case 2:
                
                numeroSucursal = Integer.parseInt( JOptionPane.showInputDialog("ingrese el numero de la sucursal del que desea enviar el paquete"));
                iterator = buscarSucursal(sucursales, numeroSucursal, contSucursal);
                if(iterator==-1){
                
                    JOptionPane.showMessageDialog(null,"Sucursal no encontrada " );
                }else{
                    numeroPaquete = Integer.parseInt( JOptionPane.showInputDialog("ingrese el numero del paquete"));
                    dni =  JOptionPane.showInputDialog("ingrese el dni del propietario");
                    peso= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del paquete en kg"));
                    prioridad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la prioridad del envio siendo \n0. normal \n1. Alta \n2. Express"));
                    
                    paquetes[contPaquete]= new Paquete(numeroPaquete, dni, peso, prioridad);
                    
                 
                    
                    JOptionPane.showMessageDialog(null, "El precio de envio es " + sucursales[iterator].calcularPrecioEnvio(paquetes[contPaquete])+ " USD");
                    
                    contPaquete++;
                }
                    
                    break;
            case 3:
                    numeroSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la sucursal que desea cosultar"));
                    iterator =buscarSucursal(sucursales, numeroSucursal, contSucursal);
                    if ( iterator == -1) {
                        JOptionPane.showMessageDialog(null, " Lo sentimos, el numero indicado no conincide con alguna sucursal");
                    }else{
                          System.out.println(  sucursales[iterator].mostrarDatosSucursal());
                    }
                    break;
            case 4:
                    numeroPaquete = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del paquete a consultar"));
                    iterator = buscarNumPaquete(paquetes, numeroPaquete,contPaquete);
                    
                    if(iterator ==-1){
                        JOptionPane.showMessageDialog(null, "Lo sentimos, el numero que ingreso no coincide con ningun paquete registrado");
                    }else{
                        System.out.println(  paquetes[iterator].mostrarDatosPaquete());
                    }
                    
                    break;
            case 5:
                    for (int i = 0; i < contSucursal; i++) {
                        System.out.println("");
                        System.out.println(  sucursales[i].mostrarDatosSucursal());
                        
                    }
                    break;
            case 6:
                    for (int i = 0; i < contPaquete; i++) {
                        
                        System.out.println("");
                        System.out.println( paquetes[i].mostrarDatosPaquete());
                    
                }
                    break;
            case 0:
                    
                    break;
                    
                    
                    
                    
                default:
                    throw new AssertionError();
            }
            
            
        } while (select!=0);
    
    }
           
}
