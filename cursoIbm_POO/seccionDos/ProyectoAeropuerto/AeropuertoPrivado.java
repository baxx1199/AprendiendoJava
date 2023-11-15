
package cursoIbm_POO.seccionDos.ProyectoAeropuerto;


public class AeropuertoPrivado extends Aeropuerto{
    private String listaEmpresas[] = new String [10];
    private int numEmpresas;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.numEmpresas =0;
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] compañias, String[]empresas) {
        super(nombre, ciudad, pais, compañias);
        this.listaEmpresas = empresas;
        numEmpresas=listaEmpresas.length;
    }
    
    public void insertarEmpresa(String empresa){
        listaEmpresas[numEmpresas]=empresa;
    
    }
    
    public void insertarEmpresas(String empresas[]){
        listaEmpresas=empresas;
        
        numEmpresas=empresas.length;
    }

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }

    public void mostrarEmpresas(){
        for (int i = 0; i < numEmpresas; i++) {
            System.out.println(listaEmpresas[i]);
        }
    
    }
    @Override
    public String toString() {
        return "\n============ Aeropuerto Privado ==============\n"+
                super.toString() + "\n==========================\n"; 
    }

    
    
    
}
