package cl.accenture.programatufuturo.guias.guia16.controllers;

import cl.accenture.programatufuturo.guias.guia16.dao.CancionDAO;
import cl.accenture.programatufuturo.guias.guia16.model.Cancion;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin( origins="*" )
public class CancionController {


    @RequestMapping(method = RequestMethod.GET , value="/canciones")
    public List<Cancion> obtenerCanciones(){
        try {
            CancionDAO dao = new CancionDAO();
            return dao.obtenerCanciones();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.GET , value="/canciones/{id}")
    public Cancion obtenerCancion( @PathVariable("id") int id ){
        try {
            CancionDAO dao = new CancionDAO();
            return dao.buscarCancionPorId(id);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.GET , value="/canciones/buscarPorNombre/{nombre}")
    public List<Cancion> obtenerCancionesPorNombre( @PathVariable("nombre") String nombre){
        try {
            CancionDAO dao = new CancionDAO();
            return dao.buscarCanciones(nombre);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }


    @RequestMapping(method = RequestMethod.POST , value="/canciones")
    public void actualizarCancion( @RequestBody Cancion cancion ){
        try{
            CancionDAO dao = new CancionDAO();
            dao.agregarCancion(cancion);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @RequestMapping(method = RequestMethod.PUT , value="/canciones")
    public void agregarCancion( @RequestBody Cancion cancion ){
        try{
            CancionDAO dao = new CancionDAO();
            dao.agregarCancion(cancion);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
