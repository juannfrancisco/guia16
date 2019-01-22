package cl.accenture.programatufuturo.guias.guia16.dao;

import cl.accenture.programatufuturo.guias.guia16.exceptions.SinConexionException;
import cl.accenture.programatufuturo.guias.guia16.model.Cancion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CancionDAO {

    private Conexion conexion;

    public CancionDAO(){
        this.conexion = new Conexion();
    }

    public String encriptar( String cadena ){
        return cadena+1;
    }

    /**
     *
     * @param cancion
     * @throws SinConexionException
     */
    public void agregarCancion(Cancion cancion)throws SinConexionException {
        try {

           final String SQL = "INSERT INTO cancion(idCancion,nombre,autor,genero,duracion )" +
                    "VALUES(?,?,?,?,?)";

            PreparedStatement ps = conexion.obtenerConnection().prepareStatement(SQL);
            ps.setInt(1, cancion.getIdCancion());
            ps.setString(2, cancion.getNombre());
            ps.setString(3, cancion.getAutor());
            ps.setString(4,cancion.getGenero());
            ps.setInt(5,cancion.getDuracion());
            ps.executeUpdate();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }


    /**
     *
     * @return
     * @throws SinConexionException
     */
    public List<Cancion> obtenerCanciones()throws SinConexionException{
        List<Cancion> canciones = new ArrayList<Cancion>();
        try{
            final String SQL = "SELECT * from cancion";
            PreparedStatement ps = conexion.obtenerConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Cancion cancion = new Cancion();
                cancion.setIdCancion( rs.getInt(1));
                cancion.setNombre( rs.getString(2));
                cancion.setAutor( rs.getString(3));
                cancion.setGenero( rs.getString(4));
                cancion.setDuracion( rs.getInt(5));
                canciones.add(cancion);
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return canciones;
    }


    /**
     *
     * @return
     * @throws SinConexionException
     */
    public List<Cancion> buscarCanciones(String nombre)throws SinConexionException{
        List<Cancion> canciones = new ArrayList<Cancion>();
        try{
            final String SQL = "SELECT * from cancion where nombre = ?";
            PreparedStatement ps = conexion.obtenerConnection().prepareStatement(SQL);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Cancion cancion = new Cancion();
                cancion.setIdCancion( rs.getInt(1));
                cancion.setNombre( rs.getString(2));
                cancion.setAutor( rs.getString(3));
                cancion.setGenero( rs.getString(4));
                cancion.setDuracion( rs.getInt(5));
                canciones.add(cancion);
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return canciones;
    }



    /**
     *
     * @return
     * @throws SinConexionException
     */
    public Cancion buscarCancionPorId(int idCancion)throws SinConexionException{
        Cancion cancion = null;
        try{
            final String SQL = "SELECT * from cancion where idCancion = ?";
            PreparedStatement ps = conexion.obtenerConnection().prepareStatement(SQL);
            ps.setInt(1, idCancion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                cancion = new Cancion();
                cancion.setIdCancion( rs.getInt(1));
                cancion.setNombre( rs.getString(2));
                cancion.setAutor( rs.getString(3));
                cancion.setGenero( rs.getString(4));
                cancion.setDuracion( rs.getInt(5));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return cancion;
    }
}
