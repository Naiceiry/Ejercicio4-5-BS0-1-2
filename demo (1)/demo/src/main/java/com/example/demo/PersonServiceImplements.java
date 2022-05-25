import com.example.demo.Interface;
import com.example.demo.servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImplements implements Interface {
    @Autowired
    servicio persona;

    servicio person = new servicio();

    public String getNombre(){
        return person.getNombre();
    }

    public void setNombre(String nombre) {
        person.setNombre(nombre);
    }

    public String getPoblacion() {
        return person.getPoblacion();
    }

    public void setPoblacion(String poblacion) {
        person.setPoblacion(poblacion);
    }

    public int getEdad() {
        return person.getEdad();
    }

    public int setEdad(int edad) {
        person.setEdad(edad);
    }
}