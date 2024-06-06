
/**
 * La clase Ventas tiene la funcion de gestionar las ventas de productos a lo largo de un anho.
 * Calcula las ganancias mensuales basadas en el precio del producto y la cantidad de ventas por dia.
 * 
 * @author J.Pereno
 * @version 1.2.1
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
     * Este metodo registra la cantidad de productos vendidios en un dia especifico.
     * El dia debe ser valido entre 1 y 30.
     * Se debe registrar la cantidad de productos vendidos ese dia.
     */
    public void registrarVenta(int cantidad) {
        //Implementar metodo
        if(cantidad < 0)
         throw new IllegalArgumentException("La cantidad de productos vendidos no puede ser negativa");
         
        if(diaActual < MAX_DIAS) {
            ventasPorDia[diaActual] = cantidad;
            diaActual++;
        } else if(diaActual == MAX_DIAS) {
            calcularGanancias();
        } 
    }

    /**
     * Este metodo calcula las ganancias del mes.
     * Una vez calculadas las ganancias del mes se guardan un arreglo. 
     */
    private void calcularGanancias() {
        //Implementar metodo
        if(!repOK())
            throw new IllegalArgumentException("Las ganancias solo se pueden calcular al final del mes");
            
        int suma = 0;
        for(int i = 0; i < ventasPorDia.length; i++) {
            suma += ventasPorDia[i];
        }
        
        if(suma != 0) {
            gananciasPorMes[mesActual] = suma * precioProducto;
            mesActual++;
            reiniciarVentas();
        } 
    }

    /**
     * Este metodo devuelve las ganancias de un mes especifico.
     */
    public float obtenerGanancias(int mes) {
        //Implementar metodo
        if(!repOK())
            throw new IllegalArgumentException("Ingresar correctamente el mes");
            
        return gananciasPorMes[mes];
    }

    /**
     * Este metodo cambia el valor del producto.
     * El nuevo precio no debe ser negativo para poder actualizarlo. 
     */
    public void cambiarPrecio(float nuevoPrecio) {
       //Implementar metodo
       if(nuevoPrecio < 0) {
           throw new IllegalArgumentException("El nuevo precio debe ser mayor a cero");
       } else {
           precioProducto = nuevoPrecio; 
       }
       
    }

    /**
     * Metodo para verificar la invariante de clase. 
     */
    private boolean repOK() {
        //Implementar metodo
        boolean ok = true;
        if(precioProducto <= 0) {
            ok = false;
        }
        
        if(diaActual < 0 || diaActual > MAX_DIAS) {
            ok = false;
        }
        
        if(mesActual < 0 || mesActual > MESES) {
            ok = false;
        }
        
        if(ventasPorDia.length != MAX_DIAS) {
            ok = false;
        }
        
        if(gananciasPorMes.length != MESES) {
            ok = false;
        }
        return ok;
    }

    /**
     * Este metodo reinicia las ventas por dia.  
     */
    private void reiniciarVentas() {
        //Implementar metodo
        for(int i = 0; i < ventasPorDia.length; i++) {
            ventasPorDia[i] = 0;
        }
        diaActual = 0;
    }
}


