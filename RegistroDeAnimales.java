import java.util.ArrayList;

/**
 *La clase RegistroDeAnimales administra un registro de nombres de animales.
 *Implementa metodos para agregar, listar, eliminar y actualizar los nombres de animales en un registro interno. 
 *@autor J.Pereno
 *@version 1.1.3
 */

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
        //Verifica que el nombre ingresado no sea null
        if(nombre == null)
            throw new IllegalArgumentException("El nombre del animal no debe ser nulo");
        
        return registro.remove(nombre);
    }

    public boolean actualizarAnimal(String nombreActual, String nuevoNombre) {
        if(nuevoNombre == null) 
            throw new IllegalArgumentException("El nuevo nombre del animal no debe ser nulo");
            
        boolean actualizado = false;
        for(int i = 0; i < registro.size(); i++) {
            if(registro.get(i).equals(nombreActual)){
                registro.set(i, nuevoNombre);
                actualizado = true;
            }
        }
        return actualizado;
    }

}
