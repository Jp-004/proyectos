
/**
 * Representa a un jugador individual en un juego. 
 * Contiene la información básica del jugador y maneja su puntuación
 * 
 * @author J.Pereno 
 * @version 0.1
 * @date 22/06/2024
 */
public class Jugador {
    private String nombre;
    private int puntuacion;

    /**
     * Constructor de la clase Jugador. 
     * Genera un Jugador con un nombre y una puntuacion inicial de 0. 
     * El jugador debe tener un nombre valido, no debe ser nulo ni vacio. 
     */
    public Jugador(String nombre) {
        //Implementar chequeo de precondicion 
        this.nombre = nombre;
        this.puntuacion = 0;
    }
    
    /**
     * Retorna el nombre del Jugador.  
     */
    public String obtenerNombre() {
        return nombre;
    }
    
    /**
     * Retorna la puntuacion del Jugador.  
     */
    public int obtenerPuntuacion() {
        return puntuacion;
    }

    /**
     * Actualiza la puntuacion del Jugador.
     * La puntuacion no puede ser negativa. 
     */
    public void setPuntuacion(int puntuacion) {
        //Implementar chequeo de precondicion
        this.puntuacion = puntuacion;
    }
    
    /**
     * Incrementa la puntuacion del Jugador con la cantidad de puntos proporcionados. 
     * La cantidad de puntos no debe ser negativa. 
     */
    public void incrementarPuntuacion(int puntos) {
        //Implementar chequeo de precondicion
        this.puntuacion += puntos;
    }
    
    /**
     * Invariante de clase Jugador. 
     * Retorna false en caso de que el nombre del jugador sea nulo o vacio. 
     * Si la puntuacion es negativa tambien retorna false.
     * En caso contrario retorna true. 
     */
    public boolean repOK() {
        //Implementar metodo
        return false;
    }

    /**
     * Retorna el texto "<nombre>: <puntuacion> Pts".  
     */
    public String toString() {
        //Implementar metodo
        return "text";
    }
}

