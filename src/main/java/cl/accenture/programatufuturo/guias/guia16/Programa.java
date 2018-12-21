package cl.accenture.programatufuturo.guias.guia16;

import cl.accenture.programatufuturo.guias.guia16.dao.CancionDAO;
import cl.accenture.programatufuturo.guias.guia16.model.Cancion;


public class Programa {

    public static void main(String[] args) throws Exception {
        CancionDAO dao = new CancionDAO();
        Cancion cancion = new Cancion(1,
                "yakuza",
                "Chancho en Piedra",
                "Funk, Rock",
                200 );

        /**Cancion cancion2 = new Cancion(2,
                "Locura espacial",
                "Chancho en Piedra",
                "Funk, Rock",
                200 );
         */
        // Insertar una cancion
        dao.agregarCancion(cancion);
        System.out.println("Cancion agregada  + " + cancion);

        // Insertar una cancion
        //dao.agregarCancion(cancion2);
        //System.out.println("Cancion agregada  + " + cancion2);
    }

}
