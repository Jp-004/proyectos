import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Test que verifica la correcta funcionalidad de la clase Juego. 
 * 
 * @author J.Pereno
 * @version 0.1
 * @date 23/06/2024
 */
public class JuegoTest {
    @Test
    public void testAgregarJugador() {
        Juego juego = new Juego();
        Jugador jugador = new Jugador("John");
        juego.agregarJugador(jugador);
        assertEquals(1, juego.numeroDeJugadores());
    }

    @Test
    public void testAgregarJugadorInvalido() {
        Juego juego = new Juego();
        assertThrows(IllegalArgumentException.class, () -> juego.agregarJugador(null));
        assertThrows(IllegalArgumentException.class, () -> juego.agregarJugador(new Jugador("")));
    }

    @Test
    public void testObtenerJugador() {
        Juego juego = new Juego();
        Jugador jugador = new Jugador("John");
        juego.agregarJugador(jugador);
        assertEquals(jugador, juego.obtenerJugador("John"));
    }

    @Test
    public void testObtenerJugadorInvalido() {
        Juego juego = new Juego();
        assertThrows(IllegalArgumentException.class, () -> juego.obtenerJugador(null));
        assertThrows(IllegalArgumentException.class, () -> juego.obtenerJugador(""));
    }

    @Test
    public void testIncrementarPuntuacionJugador() {
        Juego juego = new Juego();
        Jugador jugador = new Jugador("John");
        juego.agregarJugador(jugador);
        juego.incrementarPuntuacionJugador("John", 5);
        assertEquals(5, jugador.obtenerPuntuacion());
    }

    @Test
    public void testIncrementarPuntuacionJugadorInvalido() {
        Juego juego = new Juego();
        Jugador jugador = new Jugador("John");
        juego.agregarJugador(jugador);
        assertThrows(IllegalArgumentException.class, () -> juego.incrementarPuntuacionJugador(null, 5));
        assertThrows(IllegalArgumentException.class, () -> juego.incrementarPuntuacionJugador("John", -5));
        assertThrows(IllegalArgumentException.class, () -> juego.incrementarPuntuacionJugador("Invalid", 5));
    }

    @Test
    public void testObtenerTop3Jugadores() {
        Juego juego = new Juego();
        Jugador jugador1 = new Jugador("John");
        Jugador jugador2 = new Jugador("Jane");
        Jugador jugador3 = new Jugador("Doe");
        Jugador jugador4 = new Jugador("Alice");

        jugador1.setPuntuacion(100);
        jugador2.setPuntuacion(200);
        jugador3.setPuntuacion(300);
        jugador4.setPuntuacion(150);

        juego.agregarJugador(jugador1);
        juego.agregarJugador(jugador2);
        juego.agregarJugador(jugador3);
        juego.agregarJugador(jugador4);

        Jugador[] top3 = juego.obtenerTop3Jugadores();
        assertEquals("Doe", top3[0].obtenerNombre());
        assertEquals("Jane", top3[1].obtenerNombre());
        assertEquals("Alice", top3[2].obtenerNombre());
    }

    @Test
    public void testObtenerTop3JugadoresInvalido() {
        Juego juego = new Juego();
        Jugador jugador1 = new Jugador("John");
        Jugador jugador2 = new Jugador("Jane");

        juego.agregarJugador(jugador1);
        juego.agregarJugador(jugador2);

        assertThrows(IllegalStateException.class, () -> juego.obtenerTop3Jugadores());
    }

    @Test
    public void testImprimirJugadores() {
        Juego juego = new Juego();
        Jugador jugador1 = new Jugador("John");
        Jugador jugador2 = new Jugador("Jane");

        juego.agregarJugador(jugador1);
        juego.agregarJugador(jugador2);

        // This test will just ensure that the method runs without exceptions
        // To actually test the output, you would need to capture the output stream
        assertDoesNotThrow(() -> juego.imprimirJugadores());
    }

    @Test
    public void testImprimirJugadoresInvalido() {
        Juego juego = new Juego();
        assertThrows(IllegalStateException.class, () -> juego.imprimirJugadores());
    }

    @Test
    public void testRepOK() {
        Juego juego = new Juego();
        Jugador jugador = new Jugador("John");
        juego.agregarJugador(jugador);
        assertTrue(juego.repOK());
    }

    @Test
    public void testRepOKInvalido() {
        Juego juego = new Juego();
        Jugador jugador = new Jugador("");
        juego.agregarJugador(jugador);
        assertFalse(juego.repOK());
    }
}

