import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Test que verifica la correcta funcionalidad de la clase Jugador.
 * 
 * @author J.Pereno 
 * @version O.1
 * @date 23/06/2024
 */

public class JugadorTest {
    @Test
    public void testConstructor() {
        Jugador jugador = new Jugador("John");
        assertEquals("John", jugador.obtenerNombre());
        assertEquals(0, jugador.obtenerPuntuacion());
    }

    @Test
    public void testConstructorNombreInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Jugador(null));
        assertThrows(IllegalArgumentException.class, () -> new Jugador(""));
    }

    @Test
    public void testSetPuntuacion() {
        Jugador jugador = new Jugador("John");
        jugador.setPuntuacion(10);
        assertEquals(10, jugador.obtenerPuntuacion());
    }

    @Test
    public void testSetPuntuacionInvalida() {
        Jugador jugador = new Jugador("John");
        assertThrows(IllegalArgumentException.class, () -> jugador.setPuntuacion(-5));
    }

    @Test
    public void testIncrementarPuntuacion() {
        Jugador jugador = new Jugador("John");
        jugador.incrementarPuntuacion(5);
        assertEquals(5, jugador.obtenerPuntuacion());
    }

    @Test
    public void testIncrementarPuntuacionInvalida() {
        Jugador jugador = new Jugador("John");
        assertThrows(IllegalArgumentException.class, () -> jugador.incrementarPuntuacion(-5));
    }

    @Test
    public void testRepOK() {
        Jugador jugador = new Jugador("John");
        assertTrue(jugador.repOK());
    }

    @Test
    public void testRepOKInvalido() {
        Jugador jugador = new Jugador("");
        assertFalse(jugador.repOK());
    }
}

