/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.usuario;

/**
 *
 * @author usuario
 */
public class TarjetaUsuario {
    private final String id;
    private boolean activada=false;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada=activada;
    }
    public boolean isActivada(){
        return this.activada;
    }
    public void setActivada(boolean activada){
        this.activada=activada;
    }
    @Override
    public String toString() {
	return this.id;
    }
    
}
