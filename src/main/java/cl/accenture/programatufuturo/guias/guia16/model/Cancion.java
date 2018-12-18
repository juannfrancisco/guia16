package cl.accenture.programatufuturo.guias.guia16.model;

public class Cancion {
    private int idCancion;
    private String nombre;
    private String autor;
    private String genero;
    private int duracion;

    public Cancion(){}

    public Cancion(int idCancion, String nombre, String autor, String genero, int duracion) {
        this.idCancion = idCancion;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.duracion = duracion;
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return this.idCancion + " - "+
                this.getNombre() + " - "+
                this.getAutor() + " - "+
                this.getGenero() + " - "+
                this.getDuracion();
    }
}
