package bicicleta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import domain.bicicleta.Bicicleta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class BicicletaTest {

    Bicicleta bici = null;
    
    @Test
    public void setup() {
        this.bici = new Bicicleta(999);
    }

    @Test
    public void constructorBiciTest() {
        this.bici = new Bicicleta(999);
        assertEquals(999, bici.getId());
    }

    @Test
    public void toStringTest() {
        this.bici = new Bicicleta(999);
        assertEquals("999", bici.toString());
    }

}
