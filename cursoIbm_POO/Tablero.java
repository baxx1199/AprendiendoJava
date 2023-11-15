/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_POO;


public class Tablero {
    
    private int posX;
    private int posY;

    public Tablero(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
    
    public void moverArriba(int incremento){
        posY+=incremento;
    }
    public void moverAbajo(int incremento){
        posY-=incremento;
    }
    public void moverDerecha(int incremento){
        posX+=incremento;
    }
    public void moverIzquierda(int incremento){
        posX-=incremento;
    }
    
    
    
    
}
