/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.bicicleta;

/**
 *
 * @author usuario
 */
public class Bicicleta {
    
    private final Integer id;

    public Bicicleta (int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return this.id.toString();
    }


}
