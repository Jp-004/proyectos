 
/**
 * La clase Ventas tiene la funcion de gestionar las ventas de productos a lo largo de un anho.
 * Calcula las ganancias mensuales basadas en el precio del producto y la cantidad de ventas por dia.
 * 
 * @author J.Pereno
 * @version 1.0
 * @date 05/06/2024
 */
public class Ventas {
    private float precioProducto;
    private int[] ventasPorDia; 
    private float[] gananciasPorMes; 
    private int diaActual; 
    private int mesActual; 

    private final int MAX_DIAS = 30;
    private final int MESES = 12;

    public Ventas(float precioProducto) {
        this.precioProducto = precioProducto;
        this.ventasPorDia = new int[MAX_DIAS];
        this.gananciasPorMes = new float[MESES];
        this.diaActual = 0;
        this.mesActual = 0;
    }

    /**
     * Este metodo registra las ventas de un dia especifico.
     * El dia debe ser valido entre 1 y 30.
     * Se debe registrar la cantidad de productos vendidos ese dia.
     */
    public void registrarVenta(int cantidad) {
        //Implementar metodo
    }

    /**
     * Este metodo calcula las ganancias del mes.
     * Una vez calculadas las ganancias del mes se guardan un arreglo. 
     */
    private void calcularGanancias() {
        //Implementar metodo
    }

    /**
     * Este metodo devuelve las ganancias de un mes especifico.
     */
    public float obtenerGanancias(int mes) {
        //Implementar metodo
        return 0;
    }

    /**
     * Este metodo cambia el valor del producto.
     * El nuevo precio no debe ser negativo para poder actualizarlo. 
     */
    public void cambiarPrecio(float nuevoPrecio) {
       //Implementar metodo
    }

    /**
     * Metodo para verificar la invariante de clase. 
     */
    private boolean repOK() {
        //Implementar metodo
        return false;
    }

    /**
     * Este metodo reinicia las ventas por dia.  
     */
    public void reiniciarVentas() {
        //Implementar metodo
    }
}


