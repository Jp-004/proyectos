
import java.util.ArrayList; 
/**
 * La clase Bilbioteca tiene la funcion de representar una biblioteca.
 * Tiene la capacidad de almacenar libros, buscar libros por su titulo, prestar libros y devolver libros.
 * 
 * @author J.Pereno
 * @version 1.0 
 * @date 04/06/2024
 */

public class Biblioteca {
    private String[] libros;
    private int cantidadLibros;

    public Biblioteca(int capacidadMaxima) {
        libros = new String[capacidadMaxima];
        cantidadLibros = 0;
    }
    
    /**
     * Este metodo debe agregar un libro a la biblioteca.
     * Para agregar un libro, la biblioteca no debe estar llena.
     */
    public void agregarLibro(String titulo) {
        if(cantidadLibros < libros.length) {
            libros[cantidadLibros] = titulo;
            cantidadLibros++;
        } else {
            throw new IllegalArgumentException("Capacidad agotada, no se pueden agregar mas libros");
        }
    }

    /**
     * Este metodo busca un libro por su titulo en la biblioteca.
     * Devuelve true si la biblioteca dispone de este libro, de lo contrario devuelve false.
     */
    public boolean buscarLibro(String titulo) {
        if(titulo == null)
            throw new IllegalArgumentException("El titulo del libro a buscar no debe ser nulo");
        boolean buscar = false;
        int i = 0;
        while(i < cantidadLibros) {
            if(libros[i].equals(titulo)){
                buscar = true;
            } 
            i++;
        }
        return buscar; 
    }

    /**
     * Este metodo presta un libro de la biblioteca.
     * Para prestar un libro, este debe encontrarse dispoible en la biblioteca.
     * El libro sera marcado como "prestado".
     * La cantidad de libros disponibles disminuye en 1.
     */
    public boolean prestarLibro(String titulo) {
        if(titulo == null)
            throw new IllegalArgumentException("El libro no debe ser nulo");
            
        boolean condicion = false;
        
        for(int i = 0; i < cantidadLibros; i++){
            if(libros[i].equals(titulo)) {
                for(int j = i; j < cantidadLibros - 1; j++) {
                    libros[j] = libros[j + 1];
                }
                libros[cantidadLibros - 1] = null;
                cantidadLibros--;
                condicion = true;
            }
        }
        return condicion; 
    }

    /**
     * Este metodo devuelve un libro a la biblioteca.
     * Para devolver un libro, este debe estar prestado. 
     * El libro sera marcado como "disponible".
     * La cantidad de libros disponibles en la biblioteca se incrementa en 1.
     */
    public boolean devolverLibro(String titulo) {
        if(titulo == null)
            throw new IllegalArgumentException("El libro no debe ser nulo");
            
        boolean condicion = false;
        if(cantidadLibros < libros.length){
            libros[cantidadLibros] = titulo;
            cantidadLibros++;
            condicion = true;
        }
        return condicion; 
    }

}