package ADO;

import Exceptions.*;
import MisListas.MiLibreria;
import java.util.Date;

public class AudioLibro extends Libro {

    //ATRIBUTOS
    private static int numCod = 1;

    private boolean sintetizador;
    private int horasDuracion;
    private int minDuracion;

    //CONSTRUCTOR
    public AudioLibro(boolean sintetizador, int horasDuracion, int minDuracion, String nombre, 
            Date fecha, int anyo, String resumen, String autor, boolean deteriorado) 
            throws ExNegativo, ExIntervalo, ExVacio {
        super(0, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.sintetizador = sintetizador;
        if (MiLibreria.checkNegativo(horasDuracion)) {
            this.horasDuracion = horasDuracion;
        }
        if (MiLibreria.checkNegativo(minDuracion)) {
            this.minDuracion = minDuracion;
        }
    }
    //CONSTRUCTOR
    public AudioLibro(boolean sintetizador, int horasDuracion, int minDuracion,int cod, String nombre, 
            Date fecha, int anyo, String resumen, String autor, boolean deteriorado) 
            throws ExNegativo, ExIntervalo, ExVacio {
        super(0,cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.sintetizador = sintetizador;
        if (MiLibreria.checkNegativo(horasDuracion)) {
            this.horasDuracion = horasDuracion;
        }
        if (MiLibreria.checkNegativo(minDuracion)) {
            this.minDuracion = minDuracion;
        }
    }

    //GET Y SET
    public int getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(int horasDuracion) throws ExNegativo {
        if (MiLibreria.checkNegativo(horasDuracion)) {
            this.horasDuracion = horasDuracion;
        }
    }

    public int getMinDuracion() {
        return minDuracion;
    }

    public void setMinDuracion(int minDuracion) throws ExNegativo {
        if (MiLibreria.checkNegativo(minDuracion)) {
            this.minDuracion = minDuracion;
        }
    }

    public boolean isSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(boolean sintetizador) {
        this.sintetizador = sintetizador;
    }

    //METODOS
    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;
        precio = (getPreciobase() * dias);
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp = false;
        if (!c.isEmpty()) {
            getComentarios().add(c);
            resp = true;
        }
        return resp;
    }

    @Override
    public String info() {
        String resp = null;
        resp = "Codigo AudioLibro:" + this.getCodArt() + "\n"
                + "Nombre=" + getNombre() + "\n"
                + "Año Publicación:" + getAnyo() + "\n"
                + "Resumen: " + getResumen() + "\n"
                + "Fecha de Alta: " +getFecha()+"\n"
                + "¿Esta Deteriorado? : " + isDeteriorado() + "\n"
                + "¿Tiene Sintetizador ? " + isSintetizador() + "\n"
                + "Horas de Duracion: " + getHorasDuracion() + "\n"
                + "Minutos Duracion: " + getMinDuracion() +"\n"
                + "\n" + "AUTOR \n"
                + "------------------------------------------------------------ \n"
                + "Codigo de Autor: "+getAutor();
        return resp;

    }
}
