/**
 * Clase que representa un producto.
 * Contiene métodos para obtener y establecer el precio del producto.
 * 
 * @author J.Pereno
 * @version 0.1
 * @date 23/06/2024
 */
public class Producto {
    private float precio;

    /**
     * Constructor de la clase Producto.
     */
    public Producto(float precio) {
        //Implementar chequeo de precondicion
        this.precio = precio;
    }

    /**
     * Retorna el precio actual del producto.
     * Retorna el Precio del producto.
     */
    public float obtenerPrecio() {
        return precio;
    }

    /**
     * Establece un nuevo precio para el producto.
     */
    public void actualizarPrecio(float precio) {
        //Implementar chequeo de precondicion 
        this.precio = precio;
    }
}

