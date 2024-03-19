/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package estacion;
import domain.bicicleta.Bicicleta;
import domain.estacion.Anclajes;
import domain.estacion.Estacion;
import domain.usuario.TarjetaUsuario;
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
 public class EstacionTest {

     @Test
     public void constructorEstacionTest() {
         Estacion estacion = new Estacion(1, "Manacor", 6);
         assertNotNull(estacion);
         assertEquals("id: 1 \ndireccion: Manacor \nanclajes: 6", estacion.toString());
     }

     @Test
     public void anclajesLibresTest() {
         Estacion estacion = new Estacion(1, "Manacor", 6);
         assertEquals(6, estacion.anclajesLibres());

         estacion = new Estacion(1, "Manacor", 0);
         assertEquals(0, estacion.anclajesLibres());
     }
    
     @Test
     public void anclarBicicletaTest() {
         Estacion estacion = new Estacion(1, "Manacor", 6);
         estacion.anclarBicicleta(new Bicicleta(911));
         assertEquals(5, estacion.anclajesLibres());
         // cubrir branch del stream 
         estacion.anclarBicicleta(new Bicicleta(922));
         assertEquals(4, estacion.anclajesLibres());

         // cubrir else
         estacion = new Estacion(1, "Manacor", 0);
         estacion.anclarBicicleta(new Bicicleta(911));
         assertEquals(0, estacion.anclajesLibres());
     }

     @Test
     public void anclajesLibres_bici_anclada_Test() {
        
         // cubrir las dos ramas de !a.isOcupado()
         Estacion estacion = new Estacion(1, "Manacor", 1);
         estacion.anclarBicicleta(new Bicicleta(999));
         assertEquals(0, estacion.anclajesLibres());
     } 
    
     @Test
     public void leerTarjetaUsuarioTest() {
         TarjetaUsuario tarjeta = new TarjetaUsuario("yop", true);
         Estacion estacion = new Estacion(1, "Manacor", 1);
         assertTrue(estacion.leerTarjetaUsuario(tarjeta));
     }

     @Test
     public void retirarBicicletaTest() {

         // tarjeta inactiva
         Estacion estacion = new Estacion(1, "Manacor", 6);
         TarjetaUsuario tarjeta = new TarjetaUsuario("yop", false);
         estacion.retirarBicicleta(tarjeta);
         assertEquals(6, estacion.anclajesLibres());

         // tarjeta activa, no hay bicis
         tarjeta = new TarjetaUsuario("yop", true);
         estacion.retirarBicicleta(tarjeta);
         assertEquals(6, estacion.anclajesLibres());

         // tarjeta activa, hay bici
         estacion.anclarBicicleta(new Bicicleta(911));
         assertEquals(5, estacion.anclajesLibres());
         estacion.retirarBicicleta(tarjeta);
         assertEquals(6, estacion.anclajesLibres());
     }
}
