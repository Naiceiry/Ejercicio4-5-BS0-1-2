package city.demo;

/*En controlador1, en la URL /controlador1/addCiudad, petición tipo POST, se añadirá una ciudad a la lista.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class Controlador1 {
    @Autowired
    ArrayList<Beanciudad> listaciudades;

    @RequestMapping(value="/controlador1/addCiudad", method = RequestMethod.POST, consumes = "application/json" )
    public  ArrayList<Beanciudad> addCiudad(@RequestBody Beanciudad beanciudad){
        listaciudades.add(beanciudad);
        return listaciudades;
    }
}

