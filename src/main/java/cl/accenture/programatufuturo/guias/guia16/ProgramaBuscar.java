package cl.accenture.programatufuturo.guias.guia16;

import cl.accenture.programatufuturo.guias.guia16.dao.CancionDAO;
import cl.accenture.programatufuturo.guias.guia16.model.Cancion;

import java.util.List;

public class ProgramaBuscar {

    public static void main(String[] args) throws Exception {
        CancionDAO dao = new CancionDAO();

        // Buscar Canciones
        List<Cancion> canciones = dao.buscarCanciones("yakuza");

        printCanciones(canciones);

    }

    public static void printCanciones(List<Cancion> canciones){
        for(Cancion cancion : canciones){
            System.out.println( cancion );
        }

    }
}
