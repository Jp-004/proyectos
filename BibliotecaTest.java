import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 500);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 400);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
    }

    @Test
    public void testAgregarLibro() {
        assertEquals(2, biblioteca.cantidadLibros());
        Libro libro3 = new Libro("Rayuela", "Julio Cortázar", 300);
        biblioteca.agregarLibro(libro3);
        assertEquals(3, biblioteca.cantidadLibros());
    }

    @Test
    public void testEstaPrestado() {
        assertFalse(biblioteca.libroEstaPrestado("Don Quijote de la Mancha"));
        biblioteca.prestarLibro("Don Quijote de la Mancha");
        assertTrue(biblioteca.libroEstaPrestado("Don Quijote de la Mancha"));
    }

    @Test
    public void testPrestarLibro() {
        assertFalse(biblioteca.libroEstaPrestado("Cien años de soledad"));
        biblioteca.prestarLibro("Cien años de soledad");
        assertTrue(biblioteca.libroEstaPrestado("Cien años de soledad"));
    }

    @Test
    public void testDevolverLibro() {
        biblioteca.prestarLibro("Cien años de soledad");
        assertTrue(biblioteca.libroEstaPrestado("Cien años de soledad"));
        biblioteca.devolverLibro("Cien años de soledad");
        assertFalse(biblioteca.libroEstaPrestado("Cien años de soledad"));
    }
}


