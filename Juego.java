import java.util.ArrayList;
/**
 * Gestiona una colección de objetos Jugador. 
 * Representa un juego que involucra a múltiples jugadores. 
 * Maneja la lógica para agregar jugadores y determinar el ganador.
 * 
 * @author J.Pereno 
 * @version 0.1
 * @date 22/06/2024
 */


public class Juego {
    private ArrayList<Jugador> jugadores;

    /**
     * Crea un objeto <Juego>.  
     */
    public Juego() {
        jugadores = new ArrayList<>();
    }

    /**
     * Agrega un nuevo jugador a la lista <jugadores>. 
     * Los jugadores no pueden ser nulos. 
     */
    public void agregarJugador(Jugador jugador) {
        //Implementar chequeo de precondicion 
        jugadores.add(jugador);
    }

    /**
     * Devuelve la cantidad de jugadores dentro de la lista <jugadores>. 
     */
    public int numeroDeJugadores() {
        return jugadores.size();
    }

    /**
     * Devuelve los datos del jugador con el nombre proporcionado en el parametro.  
     * Solamente puede recibir nombres validos. 
     */
    public Jugador obtenerJugador(String nombre) {
        //Implementar metodo y chequeo de precondicion 
        return null;
    }

    /**
     * Retorna el jugador con mayor puntaje.  
     * Solamente funciona si la lista de jugadores no es vacia. 
     */
    public Jugador obtenerGanador() {
        //Implementar metodo y chequeo de precondicion 
        return null;
    }
    
    /**
     * Incrementa la puntuacion de un jugador tantos puntos como se le asigne.
     * Cheque que el nombre del jugador no sea nulo ni vacio.
     * Solamente se le pueden pasar puntos positivos al jugador. 
     * En caso de no ser encontrado el jugador, devuelve un mensaje. 
     */
    public void incrementarPuntuacionJugador(String nombre, int puntos) {
        //Implementar metodo y chequeo de precondicion
    }
    
    /**
     * Retorna los 3 mejores jugadores del juego mediante su puntaje. 
     * Si la lista <jugadores> contiene menos de 3 jugadores el metodo no funciona. 
     */
    public Jugador[] obtenerTop3Jugadores() {
        //Implementar metodo y chequeo de precondicion
        return null;
    }

    /**
     * Imprime todos los jugadores dentro del Juego. 
     * Si la lista <jugadores> es vacia, el metodo no funciona. 
     */
    public void imprimirJugadores() {
        //Implementar metodo y chequeo de precondicion 
    }
    
    /**
     * Invariante de clase.
     * Retorna false si algun jugador es nulo o su nombre es vacio.
     * Retorna false si algun jugador tiene puntuacion negativa. 
     * De lo contrario retorna true. 
     */
    public boolean repOK() {
        //Implementar metodo
        return false;
    }
}

