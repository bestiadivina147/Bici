/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.estacion;

/**
 *
 * @author usuario
 */
public class Anclajes {
    final Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }
    Anclaje[] anclajes() {
        return this.anclajes;
    }

    private void crearAnclajes() {
        for(int i=0;i<anclajes.length;i++){
            this.anclajes[i]=new Anclaje();
        }
    }
    public int numAnclajes(){
        return this.anclajes.length;
    }
}
