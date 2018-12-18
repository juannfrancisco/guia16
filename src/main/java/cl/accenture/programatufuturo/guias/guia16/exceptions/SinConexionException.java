package cl.accenture.programatufuturo.guias.guia16.exceptions;

public class SinConexionException extends Exception{

    /**
     *
     * @param message
     * @param e
     */
    public SinConexionException(String message, Throwable e){
        super(message, e);
    }
}
