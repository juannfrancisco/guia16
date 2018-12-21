package cl.accenture.programatufuturo.guias.guia16.controllers;

import cl.accenture.programatufuturo.guias.guia16.dao.CancionDAO;
import cl.accenture.programatufuturo.guias.guia16.model.Cancion;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CancionController {

    @RequestMapping(method = RequestMethod.GET ,
            value="/canciones")
    public List<Cancion> obtenerCanciones(){
        try {
            CancionDAO dao = new CancionDAO();
            return dao.obtenerCanciones();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }


    @RequestMapping(method = RequestMethod.POST ,
            value="/canciones")
    public void agregarCancion( @RequestBody Cancion cancion ){
        try{
            CancionDAO dao = new CancionDAO();
            dao.agregarCancion(cancion);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
