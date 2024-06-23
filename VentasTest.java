import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test que verifica el correcto funcionamiento de la clase Ventas.
 * 
 * @author J.Pereno
 * @version 0.1
 * @date 23/06/2024
 */
public class VentasTest {
    private Ventas ventas;

    @BeforeEach
    public void setUp() {
        ventas = new Ventas();
        Producto producto1 = new Producto(50.0f);
        Producto producto2 = new Producto(75.0f);
        ventas.agregarProducto(producto1);
        ventas.agregarProducto(producto2);
    }

    @Test
    public void testAgregarProducto() {
        assertEquals(2, ventas.calcularTotalVentas());
        Producto producto3 = new Producto(100.0f);
        ventas.agregarProducto(producto3);
        assertEquals(225.0, ventas.calcularTotalVentas());
    }

    @Test
    public void testCalcularTotalVentas() {
        assertEquals(125.0, ventas.calcularTotalVentas());
    }
}
