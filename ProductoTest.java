import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Test que verifica el correcto funcionamiento de la clase Producto.
 * 
 * @author J.Pereno
 * @version 0.1
 * @date 23/06/2024
 */

public class ProductoTest {

    @Test
    public void testConstructor() {
        Producto producto = new Producto(100.0f);
        assertEquals(100.0, producto.obtenerPrecio());
    }

    @Test
    public void testSetPrecio() {
        Producto producto = new Producto(100.0f);
        producto.actualizarPrecio(150.0f);
        assertEquals(150.0, producto.obtenerPrecio());
    }
}

