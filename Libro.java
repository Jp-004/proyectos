/**
 * Representa un libro en una biblioteca.
 * Contiene la información básica del libro y su estado de préstamo.
 * 
 * @autor J.Pereno
 * @version 0.1
 * @fecha 23/06/2024
 */
public class Libro {
    private String nombre;
    private String autor;
    private int cantPaginas;
    private boolean prestado;

    /**
     * Constructor de la clase Libro.
     * Genera un libro con nombre, autor y número de páginas.
     * El nombre y autor deben ser válidos (no nulos ni vacíos)
     * El número de páginas debe ser mayor a cero.
     */
    public Libro(String nombre, String autor, int cantPaginas) {
        //Implementar chequeo de precondicion
        this.nombre = nombre;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.prestado = false;
    }

    /**
     * Retorna el nombre del libro.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Retorna el autor del libro.
     */
    public String obtenerAutor() {
        return autor;
    }

    /**
     * Retorna la cantidad de páginas del libro.
     */
    public int obtenerCantPaginas() {
        return cantPaginas;
    }

    /**
     * Retorna el estado de préstamo del libro.
     */
    public boolean estaPrestado() {
        return prestado;
    }

    /**
     * Marca el libro como prestado.
     * Solo se puede prestar si el libro no se encuentra prestado. 
     */
    public void prestar() {
        //Implementar metodo y chequeo de precondicion
    }

    /**
     * Marca el libro como devuelto.
     * Solo se puede devolver si el libro esta prestado. 
     */
    public void devolver() {
        //Implementar metodo y chequeo de precondicion
    }

    /**
     * Invariante de clase Libro.
     * Verifica que el nombre y autor no sean nulos ni vacíos
     * Y que la cantidad de páginas sea positiva.
     */
    public boolean repOK() {
        //Implementar metodo
        return false;
    }

    /**
     * Retorna una representación en cadena del libro.
     * "<nombre> por <autor> (<cantPaginas> paginas)"
     */
    public String toString() {
        //Implementar metodo
        return ""; 
    }
}
