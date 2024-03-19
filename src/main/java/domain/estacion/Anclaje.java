/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.estacion;
import domain.bicicleta.Bicicleta;
/**
 *
 * @author usuario
 */
public class Anclaje {
    
    private boolean ocupado;
    private Bicicleta bici;

    public Anclaje() {
        this.ocupado = ocupado;
        this.bici = bici;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public Bicicleta getBici() {
        return this.bici;
    }

    public void anclarBici(Bicicleta bici){
        this.bici=null;
        this.ocupado= true;
    }

    public void liberarBici(){
        this.bici=null;
        this.ocupado= false;

    }
    @Override
    public String toString(){
        return "Ocupado:"+ Boolean.toString(isOcupado());
    }




}
