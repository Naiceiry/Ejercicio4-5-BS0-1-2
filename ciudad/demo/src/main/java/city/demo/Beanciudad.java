package city.demo;
import org.springframework.stereotype.Component;

@Component
public class Beanciudad {

    private String nombre;
    private int numeroHabitantes;

    //Constructor
    public Beanciudad(){
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }
    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }


}

/* Necesitamos crear un POJO, en este caso este POJO
*  También, añadiremos sus getters & setters y un método llamado show().
*
* suministrar objetos a una clase mediante a Spring Container,
* sin que la propia clase tenga que crearlos.*/


