import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    public void testConstructor() {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 417);
        assertEquals("Cien Años de Soledad", libro.obtenerNombre());
        assertEquals("Gabriel Garcia Marquez", libro.obtenerAutor());
        assertEquals(417, libro.obtenerCantPaginas());
        assertFalse(libro.estaPrestado());
    }

    @Test
    public void testConstructorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Libro(null, "Autor", 100));
        assertThrows(IllegalArgumentException.class, () -> new Libro("Nombre", null, 100));
        assertThrows(IllegalArgumentException.class, () -> new Libro("Nombre", "Autor", -1));
    }

    @Test
    public void testPrestarYDevolverLibro() {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 417);
        libro.prestar();
        assertTrue(libro.estaPrestado());
        libro.devolver();
        assertFalse(libro.estaPrestado());
    }

    @Test
    public void testPrestarLibroYaPrestado() {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 417);
        libro.prestar();
        assertThrows(IllegalStateException.class, libro::prestar);
    }

    @Test
    public void testDevolverLibroNoPrestado() {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 417);
        assertThrows(IllegalStateException.class, libro::devolver);
    }

    @Test
    public void testRepOK() {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 417);
        assertTrue(libro.repOK());
    }

    @Test
    public void testRepOKInvalido() {
        Libro libro = new Libro("", "Gabriel Garcia Marquez", 417);
        assertFalse(libro.repOK());
    }
}

