/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacio_ficha;

/**
 *
 * @author USUARIO
 */
public class Tablero {
    //lo separe para colocal el exterior del tablero y las torres donde se gana
    private Casilla casilla1[];
    private Casilla casilla2[];
    private Ficha ficha[];
    private Dado dado[];

    public Tablero(Casilla[] casilla1, Casilla[] casilla2, Ficha[] ficha, Dado[] dado) {
        this.casilla1 = casilla1;
        this.casilla2 = casilla2;
        this.ficha = ficha;
        this.dado = dado;
    }

    public Casilla[] getCasilla1() {
        return casilla1;
    }

    public void setCasilla1(Casilla[] casilla1) {
        this.casilla1 = casilla1;
    }

    public Casilla[] getCasilla2() {
        return casilla2;
    }

    public void setCasilla2(Casilla[] casilla2) {
        this.casilla2 = casilla2;
    }

    public Ficha[] getFicha() {
        return ficha;
    }

    public void setFicha(Ficha[] ficha) {
        this.ficha = ficha;
    }

    public Dado[] getDado() {
        return dado;
    }

    public void setDado(Dado[] dado) {
        this.dado = dado;
    }
    
    public int separarMovimiento(int eleccion, int ficha, int d1, int d2){
        int a;
        //tener en cuenta que el "numero" de la clase tipo de ficha hace referencia a una numeracion dada para poder usarse 
        //en la seleccion individual de la trayectoria que cada jugador tiene individualmente
        a = this.ficha[ficha].getTipo().getNumero();
        int b=0;
        switch(eleccion){
            //mover 1 ficha con los 2 dados
            case 1:
                a+= (d1+d2);
                break;
                //mueve solo con el dado 1
            case 2:
                a+=d1;
                b=d2;
                break;
                //mueve solo con el dado 2
            default:
                a+=d2;
                b=d1;
                break;
        }
        //se returna el faltante o nada lo cual se tomara en cuenta en el main
       return b; 
    }
}
