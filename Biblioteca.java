import java.util.ArrayList;

/**
 * Representa una biblioteca que contiene una colección de libros.
 * Permite gestionar los libros y su estado de préstamo.
 * 
 * @autor J.Pereno 
 * @version 0.1
 * @fecha 23/06/2024
 */
public class Biblioteca {
    private ArrayList<Libro> libros;

    /**
     * Constructor de la clase Biblioteca.
     * Crea una biblioteca vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Agrega un nuevo libro a la biblioteca.
     * El libro no debe ser nulo y debe cumplir con su invariante de clase.
     */
    public void agregarLibro(Libro libro) {
        //Implementar chequeo de precondicion
        libros.add(libro);
    }

    /**
     * Verifica si un libro está prestado, dado su nombre.
     * El nombre debe ser válido (ni nulo ni vacio).
     * Si el libro no se encuentra se lanza una excepcion. 
     */
    public boolean libroEstaPrestado(String nombre) {
        //Implementar metodo y chequeo de precondicion
        return false;
    }

    /**
     * Retorna la cantidad de libros dentro de la Biblioteca. 
     */
     public int cantidadLibros() {
        return libros.size();
    }
    
    /**
     * Presta un libro, dado su nombre.
     * El nombre debe ser válido y el libro debe estar en la biblioteca.
     */
    public void prestarLibro(String nombre) {
        //Implementar metodo y chequeo de precondicion 
    }

    /**
     * Devuelve un libro, dado su nombre.
     * El nombre debe ser válido y el libro debe estar en la biblioteca.
     * De lo contrario lanza una excepcion. 
     */
    public void devolverLibro(String nombre) {
        //Implementar metodo y chequeo de precondicion 
    }

    /**
     * Invariante de clase.
     * Verifica que todos los libros en la biblioteca cumplan con su invariante de clase.
     */
    public boolean repOK() {
        //Implementar metodo
        return false;
    }

    /**
     * Retorna una representación en cadena de la biblioteca.
     * Retorna cada libro dentro de la Biblioteca. 
     */
    public String toString() {
        //Implementar metodo 
        return ""; 
    }
}

