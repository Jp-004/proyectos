import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona las ventas de productos.
 * Permite agregar productos a la lista de ventas y calcular el total de ventas.
 * 
 * @author J.Pereno
 * @version 0.1
 * @date 23/06/2024
 */
public class Ventas {
    private List<Producto> productosVendidos;

    /**
     * Constructor de la clase Ventas.
     */
    public Ventas() {
        this.productosVendidos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la lista de productos vendidos.
     */
    public void agregarProducto(Producto producto) {
        //Implementar chequeo de precondicion
        productosVendidos.add(producto);
    }

    /**
     * Calcula el total de ventas realizado hasta el momento.
     * Retorna el total de ventas realizado.
     */
    public float calcularTotalVentas() {
        //Implementar metodo
        return 0;
    }

    /**
     * Imprime todos los productos vendidos.
     */
    public void imprimirProductosVendidos() {
        //Implementar metodo
    }
}



