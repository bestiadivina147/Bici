/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package estacion;
import domain.estacion.Anclaje;
import domain.bicicleta.Bicicleta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class AnclajeTest {
     @Test
     public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
         anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
     }

     @Test
     public void getBiciTest() {
         Anclaje anclaje = new Anclaje();
         anclaje.anclarBici(new Bicicleta(911));
         assertTrue(anclaje.isOcupado());
         anclaje.getBici();
         assertTrue(anclaje.isOcupado());
     }

     @Test
     public void liberarBiciTest() {
         Anclaje anclaje = new Anclaje();
         anclaje.anclarBici(new Bicicleta(911));
         assertTrue(anclaje.isOcupado());

         anclaje.liberarBici();
         assertFalse(anclaje.isOcupado());        
     }
    
}
