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
public class Casilla {
    private int cantidad;
    private Tipo tipo;
    private Ficha[] ficha;

    public Casilla(int cantidad, Tipo tipo, Ficha[] ficha) {
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.ficha = ficha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Ficha[] getFicha() {
        return ficha;
    }

    public void setFicha(Ficha[] ficha) {
        this.ficha = ficha;
    }

    public void determinarTrayectoria(Ficha f){
        
    }
    /*
    Trabajo en progreso del metodo para comer
    public void comer(Ficha f){
        int a=f.getTipo().getId();
        for (int i = 0; i < 4; i++) {
            if (a == this.ficha[i].getTipo().getId() ) {
                
            }else{
                
            }
        }
    }
    */
    /*
    No recuerdo para que era este metodo
    public void devolver(){
        
    }
*/
}
