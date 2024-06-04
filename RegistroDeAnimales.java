import java.util.ArrayList;

public class RegistroDeAnimales {
    private ArrayList<String> registro;

    public RegistroDeAnimales() {
        this.registro = new ArrayList<>();
    }

    public void agregarAnimal(String animal) {
        //Agrega un animal a la lista
        if(animal == null)
            throw new IllegalArgumentException("El nombre del animal no es valido");  
        registro.add(animal);
    }

    public ArrayList<String> listarAnimales() {
        //Lista todos los animales del registro
        return new ArrayList<>(registro);
    }

    public boolean eliminarAnimal(String nombre) {
        /**
         * Elimina un animal del registro.
         * 
         * @param nombre Nombre del animal a eliminar
         * @return true si el animal fue eliminado, false si no se encontró el animal
         */
        return registro.remove(nombre);
    }

    public boolean actualizarAnimal(String nombreActual, String nuevoNombre) {
        /**
         * Actualiza el nombre de un animal en el registro.
         * 
         * Precondiciones:
         * - nombreActual debe existir en el registro.
         * - nuevoNombre no debe estar vacío.
         * 
         * Postcondiciones:
         * - El nombre del animal será actualizado en el registro.
         * 
         * @param nombreActual Nombre actual del animal
         * @param nuevoNombre Nuevo nombre para el animal
         * @return true si el nombre fue actualizado, false si nombreActual no se encontró
         */
        // TODO: Implementar este método
        // Buscar el animal por nombreActual en el registro
        // Si se encuentra, actualizar su nombre a nuevoNombre
        // Retornar true si la actualización fue exitosa, de lo contrario retornar false
        return false; // Retorno temporal
    }

    public static void main(String[] args) {
        RegistroDeAnimales registro = new RegistroDeAnimales();
        registro.agregarAnimal("Perro");
        registro.agregarAnimal("Gato");
        System.out.println(registro.listarAnimales()); // [Perro, Gato]
        System.out.println(registro.eliminarAnimal("Gato")); // true
        System.out.println(registro.listarAnimales()); // [Perro]
        System.out.println(registro.actualizarAnimal("Perro", "Canino")); // TODO: Implementar para que retorne true
        System.out.println(registro.listarAnimales()); // TODO: Implementar para que muestre [Canino]
    }
}
