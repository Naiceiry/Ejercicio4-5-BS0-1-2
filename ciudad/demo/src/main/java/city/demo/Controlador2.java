package city.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
public class Controlador2 {
    @Autowired
    ArrayList<Beanciudad> listaciudades;

    @GetMapping("/controlador2/getCiudad")
    public  ArrayList<Beanciudad> getControlador2(){
        return listaciudades;
    };
}
